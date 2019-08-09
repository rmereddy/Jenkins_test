Feature: password link
clients should see the password link and be able to use it to navigate to the password page to change their password


Scenario: verify the password link in tooltip
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
Given i am on the marketplace homepage
When i should see that the tooltip is displayed
And i should see that the password link is displayed
When i click on the tooltip password link
Then i should navigate to the password page in my account