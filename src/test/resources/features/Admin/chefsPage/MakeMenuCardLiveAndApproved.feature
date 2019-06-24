@adminEnd2End @chefPageEnd2End @MenuCardLiveAndApproved @regression 
Feature: chef's page
in order for an admin to make a menu card live
the user with admin access will have to login and navigate to the chefs page
and navigate to a chefs menu cards page where they will be able to click on 
and edit a menu card to make it live


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


@ww
Scenario: verify menu card
Given i navigate to "https://staging.tryhungry.com/"
And i click on my location
Then i should be navigated to the hungry choose a menu page
And i should be able to filter menus by chef
And i should be able to select my prefered menu


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
