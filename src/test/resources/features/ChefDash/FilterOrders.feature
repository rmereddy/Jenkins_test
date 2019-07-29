Feature: chef dash
Chefs should able to filter orders by dates.

Scenario: log in to chef dash
Given i navigate to the chef dashboard homepage/login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard
When i click the calendar
And i select a future date "August 1"
Then future orders should be displayed