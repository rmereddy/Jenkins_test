@regression  @marketplaceEnd2End
Feature: tryHungry homepage
in order for a user to use the services provided by tryHungry,
the user should be able launch the tryHungry website using any web browser
and the user should be able to access all the homepage features


Background: verify that a user can succesfully launch the tryHungry marketplace web application
Given i navigate to "https://staging.tryhungry.com/"
Then i should see the tryHungry homepage launch in my browser


@Homepage 
Scenario: verifying that the tryhungry homepage is lauched
Given i am on the try hungry homepage I should see that the page title is "Hungry Marketplace"

@HomepageLinks @Homepage
Scenario: verifying the number of buttons and links on the homepage
When i count the number of buttons and links on the homepage
Then i should see that there are more than 20 buttons and links on the homepage


@HomepageBrokenLinks @Homepage 
Scenario: verifying that there are no broken links on the homepage
When i verify the response code of every link
Then i should see that we have no broken links


@Homepage @HomepageLinks 
Scenario: veryfying that all the homepage links and buttons are clickable
Given i should verify that the home button is clickable

@Homepage @MenusButton 
Scenario: menus DC
Given i should verify that the washington dc link is clickable

@Homepage @MenusButon 
Scenario: PA menus link
Given i should verify that the philladelphia link is clickable

@Homepage @MissionButton 
Scenario: mission button
And i should verify that the mission button is clickable

@Homepage 
Scenario: media button
And i should verify that the media button is clickable

@Homepage 
Scenario: FAQ button
And i should verify that the FAQ button is clickable

@Homepage 
Scenario: testimonials button
And i should verify that the testimonials button is clickable

@Homepage 
Scenario: call us button
And i should verify that the call us button is clickable

@Homepage 
Scenario: login button
And i should verify that the login button is clickable

@Homepage 
Scenario: see menus button
And i should verify that the see menus button is clickable

@Homepage 
Scenario: get quote button
And i should verify that the get quote button is clickable

@Homepage @ChefNetwork 
Scenario: chef network dispays
And i should verify that the chef network displays are clickable

@Homepage 
Scenario: contact us button
And i should verify that the contact us button is clickable

@Homepage 
Scenario: second contact us button
And i should verify that the second contact us button is clickable

@Homepage 
Scenario: subscribe link text
And i should verify that the subscribe link text is clickable

@Homepage 
Scenario: terms of use link text
And i should verify that the terms of use link text is clickable

@Homepage @EmailLink 
Scenario: email link text
And i should verify that the tryhungry email link text is clickable

@Homepage @ChatFeature 
Scenario: Verifying that the chat button will open the chat window when it is clicked
When i click the chat feature in the botton left of the homepage
Then the chat window should pop up on the homepage

@homepage @seeMenus 
Scenario: Verifying that the see menus button will display a dropdown of cities tryhungry operates in when clicked
Given i am on the tryhungry homepage
When i click on the see menus button
Then the see menu button should display a dropdown of operating cities

@Homepage @EmailLink
Scenario: verifying that the tryhungry email link text is spelled correctly
When i read the tryhungry email
Then i should see that the email link is correctly spelled as "hello@tryhungry.com"
















 