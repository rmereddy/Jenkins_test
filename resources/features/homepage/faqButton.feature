Feature: The FAQ button should be present on the homepage.

Scenario: Verify that the homepage has a FAQ button
 Given I am on the homepage
 When I look in the top right corner
 Then I should see the FAQ button.

