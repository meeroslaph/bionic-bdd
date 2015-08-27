Meta:

Narrative:
As a user of jmeter-book site
I want to add myself to the list of persons
So that I can be found as a listed person

Scenario: Adding person to the list of all persons
Given <firstname> <lastname> user with <jobid> job
When the user is added to the list of persons
Then the added user is listed in the persons list

Examples:
|firstname|lastname|jobid|
|Someone|Cool|3|
|In|Cognito|5|