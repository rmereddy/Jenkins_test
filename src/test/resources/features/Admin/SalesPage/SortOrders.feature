@adminEnd2End @regression @sortOrders @salesPage
Feature: sales page
in order for an admin to search, view, add or edit an order,
the user with admin access will have to login and navigate to the sales page
where they will be able to search for, view, add or edit orders


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application



Scenario: sort orders
Given i am on the admin homepage
When i click on the sales link
Then i should navigate to the sales page and be able to sort orders by "closed"
And sort orders by "open"
And sort orders by "all"