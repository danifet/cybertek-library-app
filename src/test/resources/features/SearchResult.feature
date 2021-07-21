Feature: user should be able to login as librarian. When goes to Users page, table
  should have specified columns



    Scenario:
      Given User is on the login page
      And   User login as a librarian
      When user clicks on Users link
      Then table should have following column names:
        | Actions   |
        | User ID   |
        | Full Name |
        | Email     |
        | Group     |
        | Status    |