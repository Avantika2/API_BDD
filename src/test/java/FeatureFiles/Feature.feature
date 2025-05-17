Feature: Login API testing

  Scenario Outline: login with valid/invalid credentials
    Given I set the base URI
    When I perform login with "<username>" and "<password>"
    Then I should get a <status_code>

  Examples:
    | username | password | status_code |
    | Avan     | Password | 200         |
    | Avan123  | Passwordd | 401        |

