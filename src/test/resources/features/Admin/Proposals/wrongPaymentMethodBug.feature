@adminEnd2End @regression @bug @proposals @smoke
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
When i click on the proposals link


Scenario: add new proposals
Given i am on the proposals page
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
And i enter chef notes "testing chef notes"
And i click save proposal
Then i should successfully add the proposal


Scenario: edit existing proposal and change customer account and verify payment method
Given i am on the proposals page
When i search for the proposal
And i click on the edit button
And i change customer account to "This is a test"
And i click save proposal
Then i should successfully edit my proposal
And i click on create order
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
Then i should verify that a payment method was not attached to this order "Unable to charge client without Payment Method!"








Scenario: delete order
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order

