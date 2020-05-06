@2E 
Feature: Know about covid-19 from amazon website 

Background: User clicks on login button 
	Given User will enter the url 
	When  User clicks on Accounts & List button on the top 
	Then  User will enter the username and click on continue 
	Then  User will enter the password and click on login button 
	
	
Scenario: User knows the details of donation using amazon site 
	Given User clicks on Amazon pay 
	When  User clicks on covid-19 Donation 
	Then  User scrolls down and clicks on donate now from habitat for humanity 
	And   User clicks on About habitat and closes the browser