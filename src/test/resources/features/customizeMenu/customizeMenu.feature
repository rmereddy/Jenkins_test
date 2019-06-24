@marketplaceEnd2End @customizeMenu @regression @smoke @testCuz
Feature: customize menu
in order for a customer to place an order
the customer has to navigate to the choose a menu page
and choose their prefered menu from their prefered chefs, 
and customize their menu before placing an order





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


Scenario: Verifying the high level customize menu features to make sure they function properly
Given i navigate to "https://staging.tryhungry.com/"
When i click on menus or seeMenus
And i click on my location
Then i should be navigated to the hungry choose a menu page
And i should be able to filter menus by chef
And i should be able to select my prefered menu
Given i am on the customize menu page
When i enter my zip code
And i enter my prefered date
And i enter my head count
And i i enter my set up time
#And i enter my first entree quantity
#And i enter my second entree quantity
#And i enter my first sides quantity
#And i enter my drinks
#And i enter my drinks quantity
#And i enter my desert
#And i enter my deserts quantity
And i enter notes for the chef
And i choose my delivery option
And i enter a promo code
And i enter a tip percentage
And i i click continue
Then i should be navigated to the checkout page
And i should be able to navigate back to the customize menu page to make changes






Scenario: Verifying that a user should not be able to navigate to the checkout page with an insuffient order
Given i navigate to "https://staging.tryhungry.com/"
When i click on menus or seeMenus
And i click on my location
Then i should be navigated to the hungry choose a menu page
And i should be able to filter menus by chef
And i should be able to select my prefered menu
Given i am on the customize menu page
When i enter my zip code
And i enter my head count
And i enter notes for the chef
And i enter a tip percentage
Then i should not be able to navigate to the checkout page
And the continue button should ask me to adjust quantities



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
And i change menu card status from live and approved
And i click save
