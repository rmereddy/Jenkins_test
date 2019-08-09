@autoClientSurveyEmail
Feature: sales page
in order for an admin to search, view, add or edit an order,
the user with admin access will have to login and navigate to the sales page
where they will be able to search for, view, add or edit orders



@autoSurveyEmail
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



Scenario: verify client survey email
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungryemail@protonmail.com" "gotmoney"
And i click on the first email
Then i should verify that it's the client survey email "How are we doing? Please send us your feedback"




Scenario: delete client survey email
Given i navigate to the client test email "https://mail.protonmail.com/login"
When i login to the test email account "hungryemail@protonmail.com" "gotmoney"
And i click on the first email check box
Then i should delete the chef order email




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


