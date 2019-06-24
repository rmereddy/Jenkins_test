@customizeOrderLink @myAccount @MarketplaceEnd2End @regression @smoke
Feature: In order for a user to be able to customize/update their order, the user with valid login
has to navigate to their account portal, locate the order and use the customize link to update the order





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
And i enter my head count
And i i click continue
Then i should be navigated to the checkout page
Given i am on the checkout page
And i enter delivery instructions
And i choose the building point of access
And i specify security checkin
And i click place order
Then i should succesfully place my order


@customizeOrder
Scenario: customize order
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
And i navigate to my account profile
And i navigate to my orders
And i locate order and click on customize order link
Then i should navigate to customize menu page
And i should be able to edit and update my order



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