@adminEnd2End @regression @addNet30Order @salesPage @prod @prodSmoke
Feature: net30
In order for a user with admin credentials to add a net order
the user has to mark a client as a net client and set the net preferences 
inorder for an automatic net order to be created based on the settings in the net clients profile
then the user can save orders in the net order based on the net days


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage

@addNetClient
Scenario: Add a new net client
When i click on the clients link
Then i should successfuly navigate to the clients page
Given i am on the clients page
And i click on add new client button
When i enter clients account name "NewClient TestingTesting"
And i enter the number of employees "30"
And i enter the price per person "20"
And i click net client check box
And i click call on arrival check box
And i click napkins utensils check box
And i click servings utensils check box
And i enter parking instructions "testing parking instructions"
And i enter clients address "122 testing adding client"
And i enter clients city "test city"
And i enter clients state "DC"
And i enter clients zip code "20001"
And i enter clients building instruction "come through the front door"
And i enter clients contacts title "CEO"
And i enter clients first name "Test"
And i enter clients last name "Contact"
And i enter clients phone number "2023221256"
And i enter clients email address "@test.com"
And i enter card holder name
And i enter card number
And i enter expiration date
And i enter cvv
And i select recurring payment period "monthly"
And i enter payment period length "1"
And i enter net days "1"
And i click save
Then i should successfuly add my new client

Scenario: verify net order is created
Given i navigate to the netmulti order page
When i search for the net client "NewClient TestingTesting"
And i click on the auto net order created "NewClient TestingTesting"
Then i should verify that the net order is created


Scenario: add new order
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i click on the add new order button
And i select the sales rep "Tahiru Nasuru"
And i select customer account "NewClient TestingTesting"
And i select customer delivery address
And i select catering poc
And i select invoice poc
And i select receipt poc
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
And i select the sales rep "Tahiru Nasuru"
And i enter the number of people "40"
And i enter order charge date
And i select the meal type
And i select order presentation setup type
And i enter chef notes "testing chef notes"
And i click save order
Then i should successfully copy the order
And i click on the copy button
And i select the sales rep "Tahiru Nasuru"
And i select the meal type
And i select order presentation setup type
And i enter chef notes "testing chef notes"
And i click save order
Then i should successfully copy the order




Scenario: add order to a net/multi order
Given i navigate to the netmulti order page
When i search for the net client "NewClient TestingTesting"
And i click on the auto net order created "NewClient TestingTesting"
And i click on edit order
And i enter a PO reference "testing net30"
And i select the order to save in the net order
And i click the save order button
Then i should successfully save the net order


@d
Scenario: delete net/multi order
Given i navigate to the netmulti order page
When i search for the net client "NewClient TestingTesting"
And i click on the order created "NewClient TestingTesting"
And i click on the delete order button
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

@c
Scenario: delete client
When i click on the clients link
Then i should successfuly navigate to the clients page
Given i am on the clients page
When i search for and delete the client "NewClient TestingTesting"
Then i should navigate to the clients page
