@test1 @smoke
Feature: As a user, I should be able to log in.
  Scenario Outline: Verify login with valid credentials
    Given user on the login page "http://qa3.trycloud.net/index.php/login?clear=1"
    When user use username "<username>" and passcode "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page

    Examples:
      | username | password    |
      | User2    | Userpass123 |
      | User32   | Userpass123 |
      | User62   | Userpass123 |
      | User92   | Userpass123 |


