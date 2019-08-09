@loginChefDash
Feature: chef dash
A User can sucessfully navigate to Chef dashboard login page/homepage and log in with valid credentials

Scenario: log in to chef dash
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard