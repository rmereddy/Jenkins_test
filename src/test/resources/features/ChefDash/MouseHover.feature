@chefDash @regression @chefDashOrderDetailsMouse
Feature: chef dash
doing a mouse hover on captain's name will display the captain's phone number.
doing a mouse hover on Sales rep  will display the Sale's rep phone numbers.




Scenario: login to admin website
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
And i set the delivery month as this month
And i set the delivery day as today
And i enter the number of people "30"
And i enter service instructions "testing for order in admin dash"
And i select the chef "Jest"
And i click the first entree item
And i click the second entree item
And i enter the first entree quantity
And i enter the second entree quantity
And i click save order
Then i should navigate to dash to calculate route and assign a captain "tahiru@tryhungry.com" "tahiru123" "Tahiru Nasuru" "This is a test by Tahiru" "30" "Jest Shef" "Tahiru Nasuru(P.O.C)"


@11pm 
Scenario: mouse over contacts on chef dash
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard
Given i am on the chef dash default view
When i click on the view button
Then the order details should be displayed
When i move my mouse over the reps contact name 
Then the reps contact number should be displayed
When i move my mouse over the captains name
Then the captains contact info should be displayed




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
