Feature: Login with parameters

  @studentparam
  Scenario: Login as student 14
    Given I am on the login page
    When I enter username "student14@library"
    And I enter password '6SW236ia'
    And click the sign in button
    Then dashboard should be displayed


  @librarianparam
  Scenario: Login as librarian 14
    Given I am on the login page
    When I enter username "librarian14@library"
    And I enter password '87x8afWY'
    And click the sign in button
    Then dashboard should be displayed
    And there should be 665users
    #numbercan be whatever you have there