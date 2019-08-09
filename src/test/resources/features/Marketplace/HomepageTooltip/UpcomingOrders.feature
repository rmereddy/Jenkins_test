Feature: Upcoming orders
clients should see the upcoming orders link and be able to use it to navigate to see their upcoming orders


Scenario: verify the upcoming orders link in tooltip
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
Given i am on the marketplace homepage
When i should see that the tooltip is displayed
And i should see that the upcoming orders link is displayed
When i click on the tooltip upcoming orders link
Then i should navigate to the upcoming orders page in my account