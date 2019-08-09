@logo @smoke @regression @chefDash @noon @5pm @11pm
Feature: chef dash
Clicking on the Hungry logo will display the default order screen




Background: log in to chef dash
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard


Scenario: click the browser back button
Given i am on the chef dash default view
When i navigate to a future date and click the hungry logo
Then i should navigate to the default screen
When i click the x
And i navigate to a past date and click the hungry logo
Then i should navigate to the default screen