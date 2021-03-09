Feature: Login feature


@librarian
  Scenario: Login as the librarian
  Given I am on the login page
  When I log in as a librarian
  Then I a should see dashboard

