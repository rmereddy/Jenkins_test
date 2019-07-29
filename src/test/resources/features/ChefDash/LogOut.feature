@logoutChefDash @smoke @regression @chefDash @11pm @5pm @noon
Feature: chef dash
clicking on Logout button should log user out of the website/app

Background: log in to chef dash
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard


Scenario: log out of chef dash
Given i am on the chef dash default view
When i click the log out button
Then i should succesfully log out of the application