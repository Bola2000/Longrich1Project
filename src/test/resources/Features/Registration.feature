Feature: Registration
  As a user of the site
  I would like to Register
  So that i can use the site

  Scenario: Valid Registration
    Given a user navigates to longrich website
    When a user click on Register
    And a user enter FirstName
    And a user enter LastName
    And a user enter Email
    And a user enter Password
    And a user click on the checkbox
    And a user click on Register button
    Then user should be logged into the site