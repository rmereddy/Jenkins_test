@adminEnd2End @regression @addNewOrderFreeDelivery @salesPage
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


Scenario: add new order with free delivery
Given i am on the sales page
When i click on the add new order button
And i select the sales rep "Tahiru Nasuru"
And i select customer account "Test Company Tahiru"
And i select customer delivery address
And i select catering poc
And i select invoice poc
And i select receipt poc
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
And i click the free delivery check box
And i click save order
Then i should successfully place my order with free delivery applied



Scenario: edit existing order and take off free delivery
Given i am on the sales page
When i search for the order
When i click the edit button
And i click the free delivery check box to apply a delivery fee
And i click save order
Then i should successfully edit my order with a delivery fee added to the total





Scenario: delete order
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order
