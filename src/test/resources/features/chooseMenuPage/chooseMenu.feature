@ChooseMenuPage @regression @menuImages @marketplaceEnd2End
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
  
@chefimage
Scenario: Hover over all chef images to see if the chef bio in blue background appears successfully with the bio text.
When i hover my mouse over the chef image
Then i should see see that the blue background with chef bio displayed

@menuimage
Scenario: Hover over all menu image to see if the menu item detials in red background appears successfully.
When i hover my mouse over the chef menu image
Then i should see a red background appear with menu details



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


