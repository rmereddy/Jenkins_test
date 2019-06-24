@adminEnd2End @regression @users @usersPage
Feature: Users
navigate to the users page

Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the users link
Then i should successfuly navigate to the users page


Scenario: add a user with all roles
Given i am on the users page