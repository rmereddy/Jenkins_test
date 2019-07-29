@regression @opsDash @smoke @smokeOps @calcRoute
Feature: ops routes calculation and captain assignment

when an order is placed or added from admin the order should show up in ops dash. 
The orders in ops dash can then be assigned to catering captains for delivery.


@calcRouteTest
Scenario: add admin order calculate route and assign captain
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

@dailyTest
Scenario: calc route with multiple captains
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
Then i should navigate to dash to calculate route and assign a captain "tahiru@tryhungry.com" "tahiru123" "Tahiru Nasuru" "This is a test by Tahiru" "30" "Jest Shef" "Tahiru Nasuru(P.O.C)"



@opsMultiCap @calcRouteTest @dailyTest
Scenario: calc route with multiple captains
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
Then i should locate order and navigate to dash to calculate routes and assign multiple captains "tahiru@tryhungry.com" "tahiru123" "Tahiru Nasuru" "This is a test by Tahiru" "30" "Jest Shef" "Tahiru Nasuru(P.O.C)"



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




@marketplaceOpsRoute
Scenario: place marketplace order, calculate route and assign captain
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
And i enter notes for the chef
And i i click continue
Then i should be navigated to the checkout page
Given i am on the checkout page
And i enter delivery instructions
And i choose the building point of access
And i specify security checkin
And i click place order
Then i should succesfully place my order
Then i should navigate to dash from marketplace and calculate routes and assign a captain "tahiru@tryhungry.com" "tahiru123" "Eman Pahlevani" "Test Company Tahiru" "30" "Jest Shef" "Tahiru Nasuru(P.O.C)"



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
