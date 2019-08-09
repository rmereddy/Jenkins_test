Feature: The company email should be present on the homepage.

Scenario: Verify that the homepage has the company email link that's clickable
 Given I am on the homepage
 When I look in the bottom central
 Then I should see the company email as a clickable link

