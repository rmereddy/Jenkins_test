@chefPageEnd2End @adminEnd2End @deleteAServiceItem @regression
Feature: chef's page
in order for an admin to delete a service item
the user with admin access will have to login and navigate to the chefs page
and navigate to a service items tab where they will be able to delete the service item


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application



@deleteServiceItem
Scenario: delete service item
Given i am on the chefs page
And i click on add new chef button
When i enter chefs first name "deleteServiceItem"
And i enter chefs last name "testing"
And i enter chefs email "testEmail@deleteServiceItem.com"
And i enter chefs phone number "2022022022"
And i select chefs status
And i choose vendor only account type
And i enter chefs address line one "202 test street"
And i enter chefs address line two "apt 600"
And i enter chefs city "test city"
And i enter chefs state "DC"
And i enter chefs zip code "20001"
And i enter chefs building instruction "come through the front door"
And i click save
Then i should successfuly add my new chef
Given i am on the chefs overview page
And i navigate to the service items tab
When i click on new service items
And i enter service item name "test name"
And i enter description "testing delete service items"
And i enter pricing rate "hour"
And i choose choose vendor status
And i enter vendor price "2"
And i enter market price "2"
And i click save
Then i should successfully add a new service item
Given i am on the chefs overview page
And i navigate to the service items tab
And i click on the service item
And i click on delete
Then i should successfuly delete service item





Scenario: delete test
Given i am on the chefs page
When i search for and click a failed test chef "testing"
Then i should navigate to the test chefs overview page


