@chefPageEnd2End @adminEnd2End @regression
Feature: chef's page
in order for an admin to search, view, add or edit chef profiles,
the user with admin access will have to login and navigate to the chefs page
where they will be able to search for, view, add or edit chef profiles


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application

@chefsPage 
Scenario: chefs page
Given i am on the admin homepage
When i click on the chefs button
Then i should navigate to the chefs page
And i should see active chefs prepopulated on the chefs page

@chefProfile 
Scenario: Verify chef profiles
Given i am on the chefs page
When i search and select a chef
Then i should see that all the profile tabs and contents are present

@ChefStatus
Scenario: Verify sorting out chefs by status
Given i am on the chefs page
When i click on the chef status dropdown
Then i should be able to sort out chefs by active
And i should be able to sort out chefs by trial
And i should be able to sort out chefs by inactive
And i should be able to sort out chefs by review



