@adminEnd2End @regression @surveyEmailToClient @salesPage @email
Feature: sales page
in order for an admin to search, view, add or edit an order,
the user with admin access will have to login and navigate to the sales page
where they will be able to search for, view, add or edit orders




@sendSurveyEmailToClient
Scenario: add new order
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
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
And i click save order
Then i should successfully place my order
And i click on the send survey to client panel
And i click the email order survey button
Then i should be able to send order survey successfully




Scenario: verify client survey email
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungryemail@protonmail.com" "gotmoney"
And i click on the first email
Then i should verify that it's the client survey email "How are we doing? Please send us your feedback"



Scenario: verify client survey email
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungryemail@protonmail.com" "gotmoney"
And i click on the first email
Then i should verify that it's the client survey email "How are we doing? Please send us your feedback"


@submitSurvey
Scenario: fill and submit survey
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungryemail@protonmail.com" "gotmoney"
And i click on the first email
Then i should verify that it's the client survey email "How are we doing? Please send us your feedback"
Given i click on the survey email body
And i navigate to the submit survey page
And i fill survey and click the submit button
Then i should successfully summit my survey



Scenario: delete client survey email
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungryemail@protonmail.com" "gotmoney"
And i click on the first email check box
Then i should delete the chef order email



@sendSurveyEmailToClient
Scenario: delete order
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i search for the order
And i click on the delete button
And i accept delete
Then i should successfully delete the order


@TestAutoSendSurveyToClient
Scenario: add new order and verify auto client survey is sent and received
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the admin homepage
When i click on the sales link
Then i should successfuly navigate to the sales page
Given i am on the sales page
When i click on the add new order button
And i select the sales rep "Tahiru Nasuru"
And i select customer account "This is a test by Tahiru"
And i select customer delivery address
And i select catering poc
And i select invoice poc
And i select receipt poc
And i choose a payment method
And i set the delivery month as this month
And i set the delivery day as today
And i set the delivery time as "01"
And i enter the number of people "30"
And i enter service instructions "testing service instructions"
And i select the chef "Jest"
And i click the first entree item
And i click the second entree item
And i enter the first entree quantity
And i enter the second entree quantity
And i click save order
Then i should successfully place my order
