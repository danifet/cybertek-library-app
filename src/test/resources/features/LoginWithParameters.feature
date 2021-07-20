Feature: Cybertek library login with parameters feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student

  Background:
    Given User is on the login page

  @Librarian2
  Scenario: Login as a librarian 21
    When user enters librarian username "librarian49@library"
    And user enters librarian password "xHdfRYuD"
    And click the sign in button
    Then user should see the dashboard
#   And there should be 5564 users

  @Student2
  Scenario: Login as a student 10
    When user enters student username "student28@library"
    And user enters student password "19Ceq2sT"
    And click the sign in button
    Then user should see the dashboard


   @Librarian3
    Scenario: Login as librarian in the same line
      Given User is on the login page
      When User login using "librarian49@library" and "xHdfRYuD"
      Then user should see the dashboard
#      And there should be 23 users



