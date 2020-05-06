@1E 
Feature: User clicks on the already bought product throght buy again 

Background: User clicks on login button 
	Given  User enters on url 
	When   User clicks on Accounts & List button 
	Then   User enters the username and click on continue 
	Then   User enters the password and click on login button 
	
	
Scenario: User clicks on BuyAgain button 
	Given User clicks on Buy Again 
	When User clicks on Your orders 
	Then  User clicks on dropdown button 
	Then User clicks on Buyagain button in any of the product 
	And User logs out of the application
