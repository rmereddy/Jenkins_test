@createNewAccount @myAccount @MarketplaceEnd2End @regression
Feature: In order for a user to be able to create an account
the user has to navigate to the login page and use the create account button to create an account


Scenario: create an account
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i click on create your hungry account
And i enter my first name "test"
And i enter my last name "test"
And i enter my temp test email address
And i enter a test password "testingtesting"
And i re enter the test password "testingtesting"
And i click the create button
Then i should successfully create an account "Please check your email to confirm your account."
