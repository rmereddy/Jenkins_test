@adminEnd2End @regression @orderWithCustomItem @salesPage @smoke @customItemTest
Feature: sales page
in order for an admin to search, view, add or edit an order,
the user with admin access will have to login and navigate to the sales page
where they will be able to search for, view, add or edit orders


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the sales link
Then i should successfuly navigate to the sales page

@orderWithCustomEntree
Scenario: add new order with custom item
Given i am on the sales page
When i click on the add new order button
And i select the sales rep "Tahiru"
And i select customer account "This is a test by Tahiru"
And i select customer delivery address
And i choose a payment method
And i set the delivery month "February"
And i set the delivery day "1"
And i enter the number of people "30"
And i enter service instructions "testing service instructions"
And i select the meal type
And i select order presentation setup type
And i select the chef "Jest  "
And i click on add custom entree
And i enter custom entree name "custom entree test"
And i enter the first entree quantity
And i enter chef notes "testing chef notes"
And i click save order
Then i should successfully place my order


@deleteCustomEntree
Scenario: delete custom entree
Given i am on the chefs page
When i search and select a chef
Given i am on the chefs overview page
And i navigate to the menu items tab
And i click on my custom test item "custom entree test"
And i click on delete
Then i should successfully delete menu item



Scenario: delete order
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order



@orderWithCustomSide
Scenario: add new order with custom item
Given i am on the sales page
When i click on the add new order button
And i select the sales rep "Tahiru Nasuru"
And i select customer account "This is a test by Tahiru"
And i select customer delivery address
And i choose a payment method
And i set the delivery month "February"
And i set the delivery day "1"
And i enter the number of people "30"
And i enter service instructions "testing service instructions"
And i select the meal type
And i select order presentation setup type
And i select the chef "Jest"
And i click on add custom side
And i enter custom side name "custom side test"
And i enter the first entree quantity
And i enter chef notes "testing chef notes"
And i click save order
Then i should successfully place my order

@deleteCustomSide
Scenario: delete custom entree
Given i am on the chefs page
When i search and select a chef
Given i am on the chefs overview page
And i navigate to the menu items tab
And i click on my custom test item "custom side test"
And i click on delete
Then i should successfully delete menu item


Scenario: delete order
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order



@orderWithCustomEntreeAndCustomSide
Scenario: add new order with custom item
Given i am on the sales page
When i click on the add new order button
And i select the sales rep "Tahiru Nasuru"
And i select customer account "This is a test by Tahiru"
And i select customer delivery address
And i choose a payment method
And i set the delivery month "February"
And i set the delivery day "1"
And i enter the number of people "30"
And i enter service instructions "testing service instructions"
And i select the meal type
And i select order presentation setup type
And i select the chef "Jest"
And i click on add custom entree
And i enter custom entree name "custom entree test"
And i enter the first entree quantity
And i click on add custom side
And i enter custom side name "custom side test"
And i enter the second entree quantity
And i enter chef notes "testing chef notes"
And i click save order
Then i should successfully place my order


Scenario: delete custom entree
Given i am on the chefs page
When i search and select a chef
Given i am on the chefs overview page
And i navigate to the menu items tab
And i click on my custom test item "custom side test"
And i click on delete
Then i should successfully delete menu item

Scenario: delete custom entree
Given i am on the chefs page
When i search and select a chef
Given i am on the chefs overview page
And i navigate to the menu items tab
And i click on my custom test item "custom entree test"
And i click on delete
Then i should successfully delete menu item


Scenario: delete order
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order




@editAnOrderAndAddCustomItem
Scenario: add new order
Given i am on the sales page
When i click on the add new order button
And i select the sales rep "Tahiru Nasuru"
And i select customer account "This is a test by Tahiru"
And i select customer delivery address
And i choose a payment method
And i set the delivery month "February"
And i set the delivery day "1"
And i enter the number of people "30"
And i enter service instructions "testing service instructions"
And i select the meal type
And i select order presentation setup type
And i select the chef "Jest"
And i click the first entree item
And i enter the first entree quantity
And i click on add custom entree
And i enter custom entree name "custom entree test"
And i enter the second entree quantity
And i enter chef notes "testing chef notes"
And i click save order
Then i should successfully place my order

Scenario: delete custom entree
Given i am on the chefs page
When i search and select a chef
Given i am on the chefs overview page
And i navigate to the menu items tab
And i click on my custom test item "custom entree test"
And i click on delete
Then i should successfully delete menu item

Scenario: delete order
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order
