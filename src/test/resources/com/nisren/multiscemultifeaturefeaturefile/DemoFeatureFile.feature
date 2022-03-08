#Feature: Facebook Login
#  As a Facebook user, i want to enter Username and Password as a parameter
#
#  Scenario: Valid FB login Scenario
#    Given  The user is on Facebook Login Page
#    When   He enters "User" as  Username
#    And    He enters "Password" as Password
#    Then   Check Username is present in textbox

Feature: Validate First and Last Name
  As a User need to  validate First and Last Name

  Scenario: Check First Name and LAst Name field
    Given User need to be on demo site page
    When  User enters First Name
    When  User enters Last Name
