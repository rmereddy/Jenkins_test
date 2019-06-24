@clientsPageEnd2End @adminEnd2End @taxExemptProposal @regression 
Feature: clients page
in order for an admin to be able to add an order with a tax exempt client
the user with admin access will have to login and navigate to the clients page
where they will be able to add the tax exempt client and then use the client to add an order


Background: login to admin website
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage



Scenario: Add a new tax exempt client
When i click on the clients link
Then i should successfuly navigate to the clients page
Given i am on the clients page
And i click on add new client button
When i enter clients account name "NewClient TestingTesting"
And i enter the number of employees "30"
And i enter the price per person "20"
And i click net client check box
And i click tax exempt client check box
And i click pay by check check box
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
And i enter clients tax status
And i enter card holder name
And i enter card number
And i enter expiration date
And i enter cvv
And i click save
Then i should successfuly add my new client


Scenario: add new proposals
Given i am on the admin homepage
When i click on the proposals link
Given i am on the proposals page
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
And i verify that client is tax exempt
And i click save proposal
Then i should successfully add the proposal


Scenario: delete proposals
Given i am on the admin homepage
When i click on the proposals link
Given i am on the proposals page
When i search for the proposal
And i click on the delete button
And i accept delete
Then i should successfully delete the proposals


Scenario: delete test
When i click on the clients link
Then i should successfuly navigate to the clients page
Given i am on the clients page
When i search for and delete the client "NewClient TestingTesting"
Then i should navigate to the clients page
