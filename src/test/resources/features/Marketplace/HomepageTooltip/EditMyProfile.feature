Feature: Edit client profile
clients should see the edit my profile link and be able to use it to navigate to see their profile details


Scenario: verify the edit profile link in tooltip
Given i navigate to "https://staging.tryhungry.com/"
Given i am on the login page
When i enter my email
And i enter my password
And i click the sign in button
Then i should successfully sign into my user account and profile
Given i am on the marketplace homepage
When i should see that the tooltip is displayed
And i should see that the edit profile link is displayed
When i click on the tooltip edit profile link
Then i should navigate to the edit profile page in my account