@test3 @smoke
Feature: As a user, I should be accessing all the main modules of the app
  Scenario: Verify users accessing all the main modules of the app.
    Given user on the login page
    When the users log in with valid credentials
Then Verify the user see the following:
| Dashboard |
| Files     |
| Photos    |
| Activity  |
| Talk     |
| Contacts  |
| Circles   |
| Calendar  |
| Deck      |

