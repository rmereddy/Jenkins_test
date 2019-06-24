@addNewCreditCard @myAccount @MarketplaceEnd2End @regression
Feature: In order for a user to be able to add a credit card to their account
the user has to navigate to their account profile and use the add new card button to add a card

@addCard
Scenario: add credit card
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
And i navigate to my account profile
And i click on the add new card button
And i enter the required credit card details and save
Then i should successfully save the credit card "Your user profile was successfully updated"


Scenario: delete credit card
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
And i navigate to my account profile
And i locate credit card and click delete
Then i should successfully delete the credit card



