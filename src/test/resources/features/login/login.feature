@Login @marketplaceEnd2End
Feature: Sign In
  As an employee of the company
  I want to login to application with my credentails
  In order to use the application features.

  Scenario: User navigates to Application URL
    Given I am on the Login page URL "https://staging.tryhungry.com/"
    When I look in the top right corner 
    Then I should see I should see the login button

#   @sanity
#  Scenario: Sign In with valid credential
#    When I enter username as "admin"
#    And I enter password as "password"
#    And click on login button
#    Then I sould see application homepage
#    And I sould see administrator text message on home Page
#
#  @sanity
#  Scenario Outline: Sign In with valid credentials
#    When I enter username as "<userName>"
#    And I enter password as "<password>"
#    And click on login button
#    Then I sould see application homepage
#    And I sould see administrator text message on home Page
#
#    Examples: 
#      | userName | password |
#      | admin    | password |
#      | admin    | password |
#      | admin    | password |
