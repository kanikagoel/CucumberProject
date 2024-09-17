@prod
Feature: Login feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  Scenario Outline: Login to the Facebook Website as a valid user
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user select the age category
    |Age     |
    |below 18|
    |above 18|
    And user clicks on signin button

Examples:
    |username |password |
    |valid    |valid    |
    |invalid  |invalid  |
    |valid    |invalid  |
    |invalid  |valid    |