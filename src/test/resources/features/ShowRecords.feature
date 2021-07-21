Feature: Show records

  Background:
    Given User is on the login page


      @dropDown
  Scenario: Show records dropdown

    When user enters librarian username "librarian49@library"
    And user enters librarian password "xHdfRYuD"
    And click the sign in button
    Then user should see the dashboard

    Then user clicks on Users
    Then verify dropDown
    And  verify all dropdown options