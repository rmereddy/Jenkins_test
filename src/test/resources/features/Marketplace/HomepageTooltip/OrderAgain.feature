Feature: order again button
clients should be able to order again from a past order in the past orders tab. Must be orders from marketplace


Scenario: make test chef live and approved
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the chefs page
When i search and select a chef
Given i am on the chefs overview page
And i navigate to the menu cards tab
When i click on a menu card
And i change menu card status to live and approved
And i click save

Scenario: place one order in mk 
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
When i click on menus or seeMenus
And i click on my location
Then i should be navigated to the hungry choose a menu page
And i should be able to filter menus by chef
And i should be able to select my prefered menu
And i enter my head count
And i i click continue
Then i should be navigated to the checkout page
Given i am on the checkout page
And i enter delivery instructions
And i choose the building point of access
And i specify security checkin
And i click place order
Then i should succesfully place my order

Scenario: verify the order again link for my order in tooltip
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
Given i am on the marketplace homepage
When i should see that the tooltip is displayed
When i navigate to the past orders tab in tooltip
And i see that the order again link is displayed
When i click on the tooltip order again link
Then i should navigate to the customize page




Scenario: make test chef unapproved
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the chefs page
When i search and select a chef
Given i am on the chefs overview page
And i navigate to the menu cards tab
When i click on a menu card
And i change menu card status to live and approved
And i click save



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




Scenario: add an order in admin
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
And i set the delivery day as the two days
And i set the delivery time as "10"
And i enter the number of people "30"
And i enter service instructions "testing service instructions"
And i select the chef "Jest"
And i click the first entree item
And i click the second entree item
And i enter the first entree quantity
And i enter the second entree quantity
And i click save order

Scenario: verify the order link does not show for admin orders
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
Given i am on the marketplace homepage
When i should see that the tooltip is displayed
When i navigate to the past orders tab in tooltip
When i get the text in place of order again link
Then i should see that the text in place of order again link equals "Custom Order - Please contact sales rep. to order again."


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



Scenario: verify canceled order on chef dash
Given i navigate to the chef dashboard login page
When i enter the username
And i enter the password
And i click on login button
Then i should successfully login to the chef dashboard
Then i should validate canceled order on chef dash and clear it from my orders