Feature: The terms of use link  should be present on the homepage.

Scenario: Verify that the homepage has a terms of use link 
 Given I am on the homepage
 When I look in the center bottom
 Then I should see the terms of use link 

