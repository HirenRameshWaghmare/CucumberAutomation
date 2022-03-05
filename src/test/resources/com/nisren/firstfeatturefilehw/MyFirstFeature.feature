#Feature: Facebook Login
#  As a Facebook user, i want to enter Username and Password as a parameter
#
#  Scenario: Valid FB login Scenario
#    Given  The user is on Facebook Login Page
#    When   He enters "User" as  Username
#    And    He enters "Password" as Password
#    Then   Check Username is present in textbox

Feature: Create Account Of FFaceBook
  As a User u need to open facebook home page and do the validations

  Scenario: validate First Name field
    Given User need to be on facebook login page
    When  User enters user First Name
    Then  User checks User First Name is present


#  Scenario: validate create user multiple fields
#    Given User need to be on facebook login page
#    When User enters First name
#    And User enters Surname
#    And  User checks First Name is present
#    But  User mobile field should be blank