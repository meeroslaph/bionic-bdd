package com.bionic.jbehave;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class JmeterBookSiteSteps {
    private final String jmeterBookUrl = "http://jmeterbook.aws.af.cm";
    private Response response;

    private String userFirstName;
    private String userLastName;
    private String userJobId;

    @Given("<firstname> <lastname> user with <jobid> job")
    public void givenFirstNameLastNameUserWithJobIdJob(String firstname, String lastname, String jobid) {
        this.userFirstName = firstname;
        this.userLastName = lastname;
        this.userJobId = jobid;
    }

    @When("the user is added to the list of persons")
    public void whenTheUserIsAddedToTheListOfPersons() {
        response = given().
                contentType(ContentType.JSON).
                body("{\"firstName\":" + userFirstName + ", \"lastName\":" + userLastName + ", \"jobs\":[{\"id\":" + userJobId + "}]}").
                when().
                post(jmeterBookUrl + "/person/saveRest");
    }

    @Then("the added user is listed in the persons list")
    public void thenTheAddedUserIsListedInThePersonsList() {
        JsonPath jp = new JsonPath(response.asString());
        int personId = jp.getInt("id");
        get(jmeterBookUrl + "/person/get/" + personId).
                then().assertThat().content(equalTo(response.asString()));
    }
}