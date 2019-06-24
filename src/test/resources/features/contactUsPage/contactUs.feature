@contactUs @regression @marketplaceEnd2End
Feature: contact us/get quote
A user should be able to contact us through the contact us or get quote button 
and then and submitting filling the contact us form

Background: launch the tryhungry website
Given i navigate to "https://staging.tryhungry.com/"


Scenario: contacting try hungry through the contact us buttons
Given i am on the tryhungry homepage
When i click the contact us button
And i enter my name
And my company name
And my email
And my phone number
And i click submit
Then I should see a confirmation page that says a hungry rep will contact me





Scenario: contacting try hungry through the contact us page without sufficient information should display an error
Given i am on the tryhungry homepage
When i click the contact us button
And i click submit
Then i should see error messages