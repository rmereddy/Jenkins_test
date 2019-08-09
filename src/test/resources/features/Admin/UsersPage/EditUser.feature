@adminEnd2End @regression  @editUser @users @smoke
Feature: Users
in order for an admin to be able to edit a user account
the user with admin access will have to login and navigate to the users page
where they will be able to edit the user account


Scenario: add a user with all roles
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the users link
Then i should successfuly navigate to the users page
Given i am on the users page
When i click on the add new user button
And i enter the users first name "Testing"
And i enter the users last name "Testing"
And i enter the users email "Testing@Testemail.com"
And i enter the users phone number "2021111111"
And i enter the users temporary password "testing"
And i select the users headquarter
And i click on account executive checkbox
And i click on admin checkbox
And i click on catering captain checkbox
And i click on chef checkbox
And i click on chef recruiting checkbox
And i click on master account executive checkbox
And i click the save button
Then i should succesfully add the new all roles user


Scenario: login with all roles user
Given i navigate to admin login
When i login with "Testing@Testemail.com"
And my password as "testing"
Then i should successfully login to the application


Scenario: edit user account
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the users link
Then i should successfuly navigate to the users page
Given i am on the users page
When i search for user and click edit "Testing Testing"
And i enter the users first name "Edited"
And i enter the users last name "Testing Testing"
And i enter the users temporary password "testingtesting"
And i click on account executive checkbox
And i click on admin checkbox
And i click on chef checkbox
And i click on chef recruiting checkbox
And i click the save button
Then i should succesfully edit user


Scenario: login with edited user
Given i navigate to admin login
When i login with "Testing@Testemail.com"
And my password as "testingtesting"
Then i should successfully login to the application



@deleteUser 
Scenario: delete test
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the users link
Then i should successfuly navigate to the users page
Given i am on the users page
When i search for and delete the user "Testing Testing"
Then i should navigate to the users page

