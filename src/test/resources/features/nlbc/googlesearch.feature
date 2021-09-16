Feature: Google search
In order to find items
As a generic user
I want to be able to search with Google
 
Scenario: Google search
Given I want to search in Google
When I search for 'Serenity BDD'
Then I should see link to 'Serenity BDD - Automated Acceptance Testing with Style'
 
 Scenario Outline: Google search for the random site
Given I want to search in Google
When I search for '<text>'
Then I should see link to '<name>'
 Examples:
 |text|name|
 | Dev testing|completed|
 | MTQA testing|completed|
 | BA testing|completed|
 | MTQA testing|completed|
 | BA testing|completed|