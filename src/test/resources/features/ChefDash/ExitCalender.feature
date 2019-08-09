@smoke @regression @chefDash @exitCalender
Feature: Chef Dash
Chef should able to see the default screen with their orders  after  exiting  the calender filter

@11pm
Scenario: log in to chef dash
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard
When i click the calendar
And i select a future date "August 3"
Then future orders should be displayed
When i click the x
Then i should return back to the default page