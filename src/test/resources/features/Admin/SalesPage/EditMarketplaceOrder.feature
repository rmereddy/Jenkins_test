@adminEnd2End @editMarketPlaceOrder @regression @sales
Feature: sales page
in order for an admin to search, view, add or edit an order,
the user with admin access will have to login and navigate to the sales page
where they will be able to search for, view, add or edit orders



Scenario: edit menu card
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

Scenario: place order
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
When i enter my zip code
And i enter my head count
And i i click continue
Then i should be navigated to the checkout page
Given i am on the checkout page
And i enter the zip code
And i enter delivery instructions
And i choose the building point of access
And i specify security checkin
And i click place order
Then i should succesfully place my order
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the marketplace order
And i click on the edit button
And i enter the number of people "40"
And i enter order charge date
And i select the meal type
And i select order presentation setup type
And i enter the first entree quantity
And i enter the second entree quantity
And i enter chef notes "testing chef notes"
And i click save order
Then i should successfully edit the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order


Scenario: edit menu card
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
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order