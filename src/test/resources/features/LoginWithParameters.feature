Feature: Cybertek library login with parameters feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student

  Background:
    Given User is on the login page

  @Librarian
  Scenario: Login as a librarian 21
    When user enters librarian username "librarian21@library"
    And user enters librarian password "r1m3EbBg"
    And click the sign in button
    Then dashboard should be displayed

  @Student1
  Scenario: Login as a student 10
    When user enters student username "student10@library"
    And user enters student password "cMc9B0m2"
    And click the sign in button
    Then dashboard should be displayed
    And there should be 24234 users
