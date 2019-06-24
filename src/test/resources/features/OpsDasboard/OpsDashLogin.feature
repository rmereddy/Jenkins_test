@regression @opsDash
Feature: ops dash
users with admin access are able to log into the ops dash using their admin panel credentials

@opsAdminLogin
Scenario: login into ops with admin access
Given i navigate to the ops dashboard
When i enter my username "tahiru@tryhungry.com"
And i enter my password "tahiru123"
And i select my operating location
And i click the login button to log in to ops
Then i should successfully log in to the ops dashboard full access




@opsCaptainLogin
Scenario: login into ops with catering captain access
Given i navigate to the ops dashboard
When i enter my username "hungrycaptaintest@gmail.com"
And i enter my password "gotmoney"
And i select my operating location
And i click the login button to log in to ops
Then i should successfully log in to the ops dashboard catering captain view

