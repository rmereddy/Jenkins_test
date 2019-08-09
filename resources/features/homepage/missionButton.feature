Feature: The mission button should be present on the homepage.

Scenario: Verify that the homepage has a login/sign up button
 Given I am on the homepage
 When I look in the top central 
 Then I should see the mission button

