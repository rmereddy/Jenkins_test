@changePassword @myAccount @MarketplaceEnd2End @regression
Feature: In order for a user to be able to change their password
the user has to navigate to their account profile and use the password tab to change their password


Scenario: add credit card
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
And i navigate to my account profile
And i click on the password tab
And i enter my current password "gotmoney"
And i enter my new password "gotmoney"
And i click on the save button to save my new password
Then i should succesfully change my password "Your password has been updated"








