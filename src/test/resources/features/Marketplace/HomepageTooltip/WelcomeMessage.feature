Feature: Tooltip Welcome Message
clients should see a welcome message with their name on the tooltip 


Scenario: verify the upcoming orders link in tooltip
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
Given i am on the marketplace homepage
When i see that the tooltip is displayed
Then i should see the welcome message displayed "Welcome back,"
And i should see the welcome message name displayed "Tahiru"