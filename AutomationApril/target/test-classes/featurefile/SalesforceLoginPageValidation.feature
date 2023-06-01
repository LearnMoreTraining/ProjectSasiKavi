Feature: To validate the login page of salesforce application

  @ErrorMessage @Sample
  Scenario: To validate the error message
    Given user navigates to salesforce application
    When user enter the username "Aravinth" and password "123"
    And user clicks the login button
    Then validate the error message

  @Samplezzz
  Scenario Outline: To validate the error message
    Given user navigates to salesforce application
    When user enter the username "<UserName>" and password "<Password>"
    And user clicks the login button
    Then validate the error message
    Examples:
      | UserName | Password |
      | Ajay     | 123      |
      | sasi     | abc      |
      | Kalai    | tyu      |

  @Sample
  Scenario: To validate the label name in login page
    Given user navigates to salesforce application
    Then validate the label name

  Scenario: To validate the login functionality
    Given user navigates to salesforce application
    When user enter the username "learnmore" and password "123"
    And user clicks the login button
    Then user navigate to home page