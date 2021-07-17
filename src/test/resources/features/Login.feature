Feature: Cybertek library login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student

  Background:
    Given User is on the login page

  @Librarian
  Scenario: Login as a librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @Student2
  Scenario: Login as a student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

