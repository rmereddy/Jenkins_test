@login @loginSignUp @smoke @regression @marketplaceEnd2End
Feature: login
in order for a customer to have a user profile and the save their information
the customer has to sign up for an account and then navigate to the login page
and enter valid user email and password that was used in signing up to sign into their accounts


@validLogin
Scenario: verifying that a user with an existing user profile can successfully sign into their accounts
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile

@checkoutLogin
Scenario: Verifying that a user can sign in from the checkout page and prefill checkout details from user profile
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
Given i navigate to "https://staging.tryhungry.com/"
When i click on menus or seeMenus
And i click on my location
Then i should be navigated to the hungry choose a menu page
And i should be able to filter menus by chef
And i should be able to select my prefered menu
And i enter my head count
And i enter notes for the chef
And i choose my delivery option
And i enter a tip percentage
And i i click continue
Then i should be navigated to the checkout page
Given i am on the checkout page
When i click on the sign in button
When i enter my email
And i enter my password
And i click the sign in button
Then I should sign in and my profile information should prefill my checkout page
Given i navigate to admin login
Given i am on the chefs page
When i search and select a chef
Given i am on the chefs overview page
And i navigate to the menu cards tab
When i click on a menu card
And i change menu card status from live and approved
And i click save



@invalidLogin
Scenario: Verifying that a user will not be able to sign in with invalid credentials
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter an invalid email "tahir@tryhungry.com"
And i enter an invalid password "invalid"
And i click the sign in button
Then i should not be able to sign into my user account and profile














