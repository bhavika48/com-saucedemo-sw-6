@smoke
Feature: Login Test
  As user I want to login in page

  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I enter "standard_user" username
    And  I enter "secret_sauce" password
    And  I click on 'LOGIN' button
    Then I verify the text PRODUCTS



