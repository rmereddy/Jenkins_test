@chefPageEnd2End @adminEnd2End @addNewMenuItem @regression
Feature: chef's page
in order for an admin to add a new menu item for a chef
the user with admin access will have to login and navigate to the chefs page
and navigate to a chefs menu item page where they will be able to add a new menu item


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application


Scenario: Add new menu item
Given i am on the chefs page
And i click on add new chef button
When i enter chefs first name "addMenuItem"
And i enter chefs last name "testing"
And i enter chefs email "testEmail@menuitem.com"
And i enter chefs phone number "2022022022"
And i enter chefs rating "4"
And i choose chefs priority type
And i choose chefs account type
And i select chefs image
And i select chefs status
And i i enter chefs account name "testAddMenuItem"
And i enter chefs award banner "testChef"
And i enter years as a chef "5"
And i enter chefs hometown "TestHomeTown"
And i enter chefs bio "best test chef in town"
And i enter chefs address line one "202 test street"
And i enter chefs address line two "apt 600"
And i enter chefs city "test city"
And i enter chefs state "DC"
And i enter chefs zip code "20001"
And i enter chefs building instruction "come through the front door"
And i enter hours of advance notice "24"
And i enter max individuals per session "100"
And i enter max buffet per session "70"
And i enter on site fee "200"
And i click save
Then i should successfuly add my new chef
Given i am on the chefs overview page
And i navigate to the menu items tab
When i click on new menu item button
And i pick the menu item meal type
And i enter the manu item name "test menu item"
And i enter the menu item ingredients "test item"
And i enter the menu item description "this item is for testing purposes"
And i enter the menu item servings per package "40"
And i select the menu item serving utensils "Spoon"
And i enter the menu item chefs price "10000"
And i enter the menu item market price "10000"
And i upload the menu item meal image
And i check the menu item dietary preference
And i choose the menu item packaging
And i check to make my new menu live and approved
And i check no minimum quatity requirement for the menu item
And i click save
Then i should successfully add the new menu item and see that it is live



Scenario: delete test
Given i am on the chefs page
When i search for and click a failed test chef "testing"
Then i should navigate to the test chefs overview page