@datatable
Feature: Login feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  Scenario Outline: Login to the Facebook Website as a user on Production
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user enter firstname and lastname
      | FirstName | LastName |
      | Kanika    | Goyal    |
      | Cory      | Paul     |
    And user clicks on signin button
