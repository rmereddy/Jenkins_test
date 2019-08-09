@adminLogin 
Feature: admin login
 in order for an administrative user to login and use the admin panel of HUNGRY the user has to login with valid credentials
 
 Scenario: verify that an admin user can login with valid credentials
 Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application


Scenario: verify that a non admin user won't be able to login to the admin panel
Given i navigate to admin login
When i login with "tahirnasri96@gmail.com" as my email
And and "testing" as my password
Then system should display an error message