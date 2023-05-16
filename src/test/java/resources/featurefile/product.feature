Feature:Product page
  As a user I want to verify products displayed on page
@Regression
  Scenario: Verify that six products are Displayed on page
    When I enter "standard_user" username
    And I enter "secret_sauce" password
    And I click on 'LOGIN' button
    Then I verify that six products are displayed on page



