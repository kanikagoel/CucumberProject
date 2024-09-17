@bvt
Feature: Login feature - Production
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  Scenario Outline: Login to the Facebook Website as a user on Production
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user validates captcha image
    And user clicks on signin button

Examples:
    |username |password |
    |valid    |valid    |
    |invalid  |invalid  |
    |valid    |invalid  |
    |invalid  |valid    |