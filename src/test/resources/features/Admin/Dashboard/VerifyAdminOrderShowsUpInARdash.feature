@adminEnd2End @regression @adminDash @ar @dash
Feature: Dashboard
in order for an admin to search, view or edit an order in dashboard,
the user with admin access will have to login and navigate to the dashboard page
where they will be able to search for, view or edit orders


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage


Scenario: add admin order to show up in dashboard
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i click on the add new order button
And i select the sales rep "Tahiru" "Nasuru"
And i select customer account "This is a test by Tahiru"
And i select customer delivery address
And i choose a payment method
And i set the delivery month as this month
And i set the delivery day as today
And i enter the number of people "30"
And i enter service instructions "testing for order in admin AR dash"
And i select the chef "Jest"
And i click the first entree item
And i click the second entree item
And i enter the first entree quantity
And i enter the second entree quantity
And i click save order
Then i should navigate to dash and verify that the order shows in admin AR dashboard



Scenario: delete order
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order
