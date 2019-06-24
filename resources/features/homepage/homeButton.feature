Feature: The home button should be present on the homepage.

Scenario: Verify that the homepage has a home button
 Given I am on the homepage
 When I look in the top left corner
 Then I should see the home button.

