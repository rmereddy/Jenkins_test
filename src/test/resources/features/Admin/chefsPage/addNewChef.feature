@chefPageEnd2End @adminEnd2End @addNewChef @regression
Feature: chef's page
in order for an admin to be able to add a new chef
the user with admin access will have to login and navigate to the chefs page
where they will be able to add a new chef


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application


@addChef
Scenario: Add a new chef
Given i am on the chefs page
And i click on add new chef button
When i enter chefs first name "NewChef"
And i enter chefs last name "testing"
And i enter chefs email "testEmail@newchef.com"
And i enter chefs phone number "2022022022"
And i enter chefs rating "4"
And i choose chefs account type
And i choose chefs priority type
And i select chefs image
And i select chefs status
And i i enter chefs account name "testingAddChef"
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




Scenario: delete test
Given i am on the chefs page
When i search for and click a failed test chef "testing"
Then i should navigate to the test chefs overview page