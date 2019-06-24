@newPassword @myAccount @MarketplaceEnd2End @regression
Feature: In order for a user who has forgotten their password to be able to request a new password
the user has to navigate to the login page and use the forgot password link

Scenario: request a temp password
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i click o the forgot password link
And i enter my email address "hungrytest@protonmail.com"
And i click retrieve password
Then i should successfully request a temp password

Scenario: login with temp password
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungrytest@protonmail.com" "gotmoney"
And i click on the first email
Then i get the temp password requested and be able to use it to login