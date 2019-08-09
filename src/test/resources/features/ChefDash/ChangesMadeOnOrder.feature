@changeOrderChefDash @smoke @regression @chefDash 
Feature: chef dash
Any changes to an order will be displayed real-time on chef's dashboard 
Any changes to an order will be highlighted in chef's dashboard and 
chef will have the abilty to accept the changes in the order





Scenario: add new order
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
Then i should successfully place my order

@11pm @changes
Scenario: edit existing order
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
And i click on the edit button
And i enter the number of people "0"
And i enter service instructions "testing service instructions"
And i select the meal type
And i select order presentation setup type
And i change the first entree quantity "4"
And i change the second entree quantity "6"
And i enter chef notes "testing chef notes for changes"
And i click save order
Then i should successfully edit the order


@changes @11pm
Scenario: verify chnages to order on chef dash
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard
Given i am on the chef dash default view
Then i should see changes made to my order on the default view "Dessert" "300" "16" "14" "testing chef notes for changes"
When i click on the view button
Then the order details should be displayed
And i should see changes made to my order on the order details view "Dessert" "300" "16" "14" "testing chef notes for changes"
When i click the browser back button
Then i should see the changes highlighted on the order details view with accept button
When i click on the accept changes button
Then the changes highlighted should disappear

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


Scenario: verify canceled order on chef dash
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard
Then i should validate canceled order on chef dash and clear it from my orders

