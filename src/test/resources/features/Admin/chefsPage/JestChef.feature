@jestChef
Feature: chef's page
in order for an admin to add a menu card
the user with admin access will have to login and navigate to the chefs page
and navigate to a menu cards page where they will be able to add the menu card


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application




Scenario: Add new menu card
Given i am on the chefs page
And i click on add new chef button
When i enter chefs first name "Jest"
And i enter chefs last name "Shef"
And i enter chefs email "hungryboston@protonmail.com"
And i enter chefs phone number "2022022022"
And i enter chefs rating "4"
And i choose chefs priority type
And i choose chefs account type
And i select chefs image
And i select chefs status
And i i enter chefs account name "Jest Shef"
And i enter chefs award banner "testChef"
And i enter years as a chef "5"
And i enter chefs hometown "TestHomeTown"
And i enter chefs bio "best test chef in town"
And i enter chefs address line one "202 test street"
And i enter chefs address line two "apt 600"
And i enter chefs city "Boston"
And i enter chefs state "MA"
And i enter chefs zip code "02111"
And i enter chefs building instruction "come through the front door"
And i enter hours of advance notice "24"
And i enter max individuals per session "100"
And i enter max buffet per session "70"
And i enter on site fee "200"
And i click save
Given i am on the chefs overview page
And i navigate to the menu items tab
When i click on new menu item button
And i pick the menu item meal type
And i enter the manu item name "salad"
And i enter the menu item ingredients "test item"
And i enter the menu item description "this item is for testing purposes"
And i enter the menu item servings per package "40"
And i select the menu item serving utensils "Serving Spoon"
And i enter the menu item chefs price "10000"
And i enter the menu item market price "10000"
And i upload the menu item meal image
And i check the menu item dietary preference
And i choose the menu item packaging
And i check to make my new menu live and approved
And i check no minimum quatity requirement for the menu item
And i click save
Then i should successfully add the jests menu item and see that it is live
And i navigate to the menu items tab
When i click on new menu item button
And i pick the menu item meal type
And i enter the manu item name "burgerKing"
And i enter the menu item ingredients "test item"
And i enter the menu item description "this item is for testing purposes"
And i enter the menu item servings per package "40"
And i select the menu item serving utensils "Serving Spoon"
And i enter the menu item chefs price "20000"
And i enter the menu item market price "20000"
And i upload the menu item meal image
And i check the menu item dietary preference
And i choose the menu item packaging
And i check to make my new menu live and approved
And i check no minimum quatity requirement for the menu item
And i click save
Then i should successfully add the jests menu item and see that it is live
Given i am on the chefs overview page
And i navigate to the menu cards tab
When i click on add new menu card button
And i enter new menu card name "test menu card"
And i check new menu card status
And i choose new menu card day part
And i choose new menu card cuisine type
And i enter new menu card marketplace featured ranking "3"
And i upload new menu card image
And i select new menu card entree
And i click save
Then i should successfully add a new menu card
Given i am on the chefs overview page
And i navigate to the chef contacts tab
When i click on new contact button
And i enter chefs new contact name "test name"
And i enter chefs new contact role "booking"
And i enter chefs new contact email "hungryboston@protonmail.com"
And i enter chefs new contact phone number "2023779676"
And i check chefs contact roles
And i click save
Then i should successfully add a new chefs contact


