@BackButtonTest @smoke @regression @noon @5pm @chefDash
Feature: chef dash
clicking on back button in order details will display default orders screen


Background: log in to chef dash
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard

 
Scenario: click the browser back button
When i click on the view button
Given i am on order view page
When i click the browser back button
Then i should navigate to the default screen
