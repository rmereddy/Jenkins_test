@adminEnd2End @regression @addTipOrder @salesPage
Feature: sales page
in order for an admin to search, view, add or edit an order,
the user with admin access will have to login and navigate to the sales page
where they will be able to search for, view, add or edit orders


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the sales link
Then i should successfuly navigate to the sales page


Scenario: add tip to new order
Given i am on the sales page
When i click on the add new order button
And i select the sales rep "Tahiru Nasuru"
And i select customer account "This is a test by Tahiru"
And i select customer delivery address
And i choose a payment method
And i set the delivery month "February"
And i set the delivery day "1"
And i enter the number of people "30"
And i enter service instructions "testing service instructions"
And i select the chef "Jest"
And i click the first entree item
And i click the second entree item
And i enter the first entree quantity
And i enter the second entree quantity
And i enter a discount percentage
And i click save order
Then i should successfully place my order with a flat tip applied



Scenario: edit existing order and add tip percentage
Given i am on the sales page
When i search for the order
Given i am on an order overview page
When i click the edit button
And i click tip percentage
And i click save order
Then i should successfully edit my order with a tip percentage applied


Scenario: delete order
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order
