@checkoutPage @marketplaceEnd2End @regression
Feature: checkout page
in order for a customer to place an order
the customer has to navigate to the choose a menu page
and choose their prefered menu from their prefered chefs, 
and customize their menu before navigating to the checkout page to place the order

Scenario: make chef live
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the chefs page
When i search and select a chef
Given i am on the chefs overview page
And i navigate to the menu cards tab
When i click on a menu card
And i change menu card status to live and approved
And i click save



@placeAnOrder
Scenario: verifying that a user can succesfully checkout
Given i navigate to "https://staging.tryhungry.com/"
When i click on menus or seeMenus
And i click on my location
Then i should be navigated to the hungry choose a menu page
And i should be able to filter menus by chef
And i should be able to select my prefered menu
And i enter my head count
And i enter notes for the chef
And i choose my delivery option
And i enter a tip percentage
And i i click continue
Then i should be navigated to the checkout page
Given i am on the checkout page
When i enter the first name
And i enter the last name
And i enter the a phone number
And i enter my email address
And i enter my company name
And i enter my company address
And i enter my company suite
And i enter my city
And i enter my state
And i enter the zip code
When i click on the sign in button
When i enter my email
And i enter my password
And i click the sign in button
And i click place order
Then i should succesfully place my order

Scenario: verifying that a user will not be able to checkout with only credit card information
Given i navigate to "https://staging.tryhungry.com/"
When i click on menus or seeMenus
And i click on my location
Then i should be navigated to the hungry choose a menu page
And i should be able to filter menus by chef
And i should be able to select my prefered menu
And i enter my head count
And i enter notes for the chef
And i choose my delivery option
And i enter a tip percentage
And i i click continue
Then i should be navigated to the checkout page
Given i am on the checkout page
And i enter my credit card name
And i enter my credit card number
And i enter my credit card expiration date
And i enter my credit card cvv
And i enter to save my card on file
And i click place order
Then i should not be able to checkout


Scenario: verifying that a user will not be able to checkout without credit card information
Given i navigate to "https://staging.tryhungry.com/"
When i click on menus or seeMenus
And i click on my location
Then i should be navigated to the hungry choose a menu page
And i should be able to filter menus by chef
And i should be able to select my prefered menu
And i enter my head count
And i enter notes for the chef
And i choose my delivery option
And i enter a tip percentage
And i i click continue
Then i should be navigated to the checkout page
Given i am on the checkout page
When i enter the first name
And i enter the last name
And i enter the a phone number
And i enter my email address
And i enter my company name
And i enter my company address
And i enter my company suite
And i enter my city
And i enter my state
And i enter the zip code
And i enter delivery instructions
And i choose the building point of access
And i specify security checkin
And i click place order
Then i should not be able to checkout



Scenario: verifying that a user will not be able to checkout with only company and credit card information
Given i navigate to "https://staging.tryhungry.com/"
When i click on menus or seeMenus
And i click on my location
Then i should be navigated to the hungry choose a menu page
And i should be able to filter menus by chef
And i should be able to select my prefered menu
And i enter my head count
And i enter notes for the chef
And i choose my delivery option
And i enter a tip percentage
And i i click continue
Then i should be navigated to the checkout page
Given i am on the checkout page
And i enter my company name
And i enter my company address
And i enter my company suite
And i enter my city
And i enter my state
And i enter the zip code
And i enter delivery instructions
And i choose the building point of access
And i specify security checkin
And i enter my credit card name
And i enter my credit card number
And i enter my credit card expiration date
And i enter my credit card cvv
And i enter to save my card on file
And i click place order
Then i should not be able to checkout


Scenario: verifying that a user will not be able to checkout without company information
Given i navigate to "https://staging.tryhungry.com/"
When i click on menus or seeMenus
And i click on my location
Then i should be navigated to the hungry choose a menu page
And i should be able to filter menus by chef
And i should be able to select my prefered menu
And i enter my head count
And i enter notes for the chef
And i choose my delivery option
And i enter a tip percentage
And i i click continue
Then i should be navigated to the checkout page
Given i am on the checkout page
When i enter the first name
And i enter the last name
And i enter the a phone number
And i enter my email address
And i enter my city
And i enter my state
And i enter the zip code
And i enter delivery instructions
And i choose the building point of access
And i specify security checkin
And i enter my credit card name
And i enter my credit card number
And i enter my credit card expiration date
And i enter my credit card cvv
And i enter to save my card on file
And i click place order
Then i should not be able to checkout



Scenario: make chef live
Given i navigate to admin login
When i login with "tahiru@tryhungry.com"
And my password as "tahiru123"
Then i should successfully login to the application
Given i am on the chefs page
When i search and select a chef
Given i am on the chefs overview page
And i navigate to the menu cards tab
When i click on a menu card
And i change menu card status from live and approved
And i click save



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