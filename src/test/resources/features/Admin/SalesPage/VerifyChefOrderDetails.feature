@adminEnd2End @regression @smoke  @salesPage @chefOrderDetails @email
Feature: sales page
in order for an admin to search, view, add or edit an order,
the user with admin access will have to login and navigate to the sales page
where they will be able to search for, view, add or edit orders




Scenario: verify chef order details email
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the sales link
Then i should successfuly navigate to the sales page
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
And i click save order
Then i should successfully place my order
And i click on the send chef order details panel
And i select chef "Jest Shef"
And i click email and text button
Then i should be able to send order details


Scenario: verify chef order email
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungrychef@protonmail.com" "gotmoney"
And i click on the first email
Then i should verify that it's the chef order details "Please see the order details in the attached pdf."


Scenario: verify chef order email
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungrychef@protonmail.com" "gotmoney"
And i click on the first email
Then i should verify that it's the chef order details "Please see the order details in the attached pdf."



Scenario: verify chef order email
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungrychef@protonmail.com" "gotmoney"
And i click on the first email
Then i should verify that it's the chef order details "Please see the order details in the attached pdf."

@emailDelete
Scenario: delete chef order email
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungrychef@protonmail.com" "gotmoney"
And i click on the first email check box
Then i should delete the chef order email




Scenario: delete order
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order










