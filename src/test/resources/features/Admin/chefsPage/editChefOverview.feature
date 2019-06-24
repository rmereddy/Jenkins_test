@chefPageEnd2End @adminEnd2End @editChefOverview @regression @smoke
Feature: chef's page
in order for an admin to edit chef overview pages
the user with admin access will have to login and navigate to the chefs page
and navigate to a chefs overview page where they will be able to edit the overview page


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application


Scenario: edit chef overview
Given i am on the chefs page
And i click on add new chef button
When i enter chefs first name "editOverview"
And i enter chefs last name "testing"
And i enter chefs email "testEmail@editoverview.com"
And i enter chefs phone number "2022022022"
And i enter chefs rating "4"
And i choose chefs priority type
And i choose chefs account type
And i select chefs image
And i select chefs status
And i i enter chefs account name "testingEditing"
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
And i click on edit button
When i enter chefs first name "editOverview"
And i enter chefs email "testEditEmail@test.com"
And i enter chefs phone number "2022022000"
And i enter chefs rating "5"
And i choose chefs priority type
And i choose chefs account type
And i select chefs image
And i select chefs status
And i i enter chefs account name "testEditAccount"
And i enter chefs award banner "testEditChef"
And i enter years as a chef "6"
And i enter chefs hometown "TestEditHomeTown"
And i enter chefs bio "best edited bio for test chef in town"
And i enter chefs address line one "202 edited test street"
And i enter chefs address line two "apt 700"
And i enter chefs city "edited city"
And i enter chefs state "DC"
And i enter chefs zip code "20003"
And i enter chefs building instruction "come through the back door"
And i enter hours of advance notice "32"
And i enter max individuals per session "150"
And i enter max buffet per session "100"
And i enter on site fee "300"
And i click save
Then i should successfuly edit my chef





Scenario: delete test
Given i am on the chefs page
When i search for and click a failed test chef "testing"
Then i should navigate to the test chefs overview page