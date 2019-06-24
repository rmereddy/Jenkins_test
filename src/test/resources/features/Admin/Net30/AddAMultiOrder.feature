@adminEnd2End @regression  @createMultiOrder @salesPage @prodSmoke @prod
Feature: net30
In order for a user with admin credentials to create a multi order
the user has to navigate to multi order page
then use the add new multi order button to add the order


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage


Scenario: add new order
When i click on the sales link
Then i should successfuly navigate to the sales page
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
And i select the chef "Jest"
And i click the first entree item
And i click the second entree item
And i enter the first entree quantity
And i enter the second entree quantity
And i enter chef notes "testing chef notes"
And i click save order
Then i should successfully place my order
And i click on the copy button
And i enter the number of people "40"
And i enter order charge date
And i select the meal type
And i select order presentation setup type
And i enter chef notes "testing chef notes"
And i click save order
Then i should successfully copy the order
And i click on the copy button
And i select the meal type
And i select order presentation setup type
And i enter chef notes "testing chef notes"
And i click save order



@multiOrder
Scenario: add multi order
Given i navigate to the netmulti order page
When i click on the add new multi order button
And i select the customer account "Test Company Tahiru"
And i set the start and end date
And i enter the net offset "2"
And i enter a PO reference "testing multi order"
And i select the order to save in the net order
And i click the save order button
Then i should successfully save the net order



Scenario: delete net/multi order
Given i navigate to the netmulti order page
When i search for the net client "Test Company Tahiru"
And i click on the order created "Test Company Tahiru"
And i click on the delete button
And i accept delete
Then i should succesfully delete the order


Scenario: delete order
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order

Scenario: delete order
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order

Scenario: delete order
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order


