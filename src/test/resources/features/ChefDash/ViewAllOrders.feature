Feature: Chef dash
Chef should be able to see all their orders by default when they log in to the chef dashboard


Scenario: all orders are displayed
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard
Given i am on the chef dash default view
When i get the number of orders on default view
Then all orders are displayed