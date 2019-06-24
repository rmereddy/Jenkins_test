@ChooseMenuPage @regression @marketplaceEnd2End @smoke 
Feature: choosing a menu
in order for a customer to place an order
the customer has to navigate to the choose a menu page
and choose their prefered menu from their prefered chefs, 
by their prefered prices and dietary options

Background: launch the tryhungry website
Given i navigate to "https://staging.tryhungry.com/"
When i click on menus or seeMenus
And i click on my location
Then i should be navigated to the hungry choose a menu page

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


@testingMenu
Scenario: Verifying the high level choose menu features to make sure they function properly
Then i should be able to navigate to the choose menus page
And i should be able to filter menus by cuisine
And i should be able to filter menus by meal type
And i should be able to filter menus by dietary preference
And i should be able to filter menus by chef
And i should be to see the chefs bio 
And i should be able to see the menus details 
And i should be able to select my prefered menu
And i should be able to go back to the menus page if i want to choose a different menu


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