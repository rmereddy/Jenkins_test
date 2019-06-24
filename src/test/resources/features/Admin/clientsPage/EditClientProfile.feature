@clientsPageEnd2End @adminEnd2End @editClientProfile @regression 
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



Scenario: Add a new net, pay by check and tax exempt client
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
And i select recurring payment period "monthly"
And i enter payment period length "1"
And i enter net days "1"
And i click save
Then i should successfuly add my new client

Scenario: edit client profile
When i click on the clients link
Then i should successfuly navigate to the clients page
Given i am on the clients page
And i click on add new client button
When i enter clients account name "EditedClient TestingTesting"
And i click net client check box
And i click tax exempt client check box
And i click pay by check check box
And i enter clients building instruction "come through the back door"
And i click save
Then i should successfuly add my new client

Scenario: delete test
When i click on the clients link
Then i should successfuly navigate to the clients page
Given i am on the clients page
When i search for and delete the client "EditedClient TestingTesting"
Then i should navigate to the clients page