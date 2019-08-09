@editProfile @myAccount @MarketplaceEnd2End @regression
Feature: Edit profile
In order for a user to be able to add a credit card to their account
the user has to navigate to their account profile and use the add new card button to add a card


Scenario: edit client profile in marketplace
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
And i navigate to my account profile
And i enter my new company name "Testing editing"
And i enter my new address "001 test St NW"
And i click the save button to update the profile details
Then i should successfully update my account profile "Your user profile was successfully updated"
And i enter my new company name "Test Company Tahiru"
And i enter my new address "1337 test St NW"
And i click the save button to update the profile details
