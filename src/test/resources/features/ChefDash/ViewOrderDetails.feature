@chefDash @smoke @regression @chefDashOrderDetails
Feature: Chef dash
Chef should be able click any where on order to view the order details(desktop view only).
They should see the order number ,dates ,meal type ,head count ,captain assigned , menu items ,
special instructions and Total amount(default view).
when they click on order the details should display  order number ,dates ,meal type ,head count ,
captain assigned , menu items ,special instructions ,sales rep and sales rep phone num ,dietary preferences ,
Packing type,Serving Size  and Total amount Correctly Calculated

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
And i set the delivery month "February"
And i set the delivery day "1"
And i enter the number of people "30"
And i enter service instructions "testing service instructions"
And i select the meal type
And i select order presentation setup type
And i select the chef "Jest"
And i click the first entree item
And i click the second entree item
And i enter the first entree quantity
And i enter the second entree quantity
And i enter chef notes "testing chef notes"
And i click save order
Then i should successfully place my order

Scenario: view order details
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard
Given i am on the chef dash default view
When i click on the view button
Then the order details should be displayed

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

