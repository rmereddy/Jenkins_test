Feature: The company number and call us button should be present on the homepage.

Scenario: Verify that the homepage has the company number displayed.
 Given I am on the homepage
 When I look in the top right corner
 Then I should see the company number and a call us sign.

