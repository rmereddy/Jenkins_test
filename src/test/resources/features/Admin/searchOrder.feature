Feature: checkout page
in order for a customer to place an order
the customer has to navigate to the choose a menu page
and choose their prefered menu from their prefered chefs, 
and customize their menu before navigating to the checkout page to place the order


@searchOrder
Scenario: verify order from admin
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
And i click on sales
And i click on orders
And i search and click on the order number
