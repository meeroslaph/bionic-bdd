Meta:

Narrative:
As a user of jmeter-book site
I want to add myself to the list of persons
So that I can be found as a listed person

Scenario: Adding person to the list of all persons
Given a
When the user with <firstname> <lastname> name and <job> id is added to the list of persons
Then system is in a different state