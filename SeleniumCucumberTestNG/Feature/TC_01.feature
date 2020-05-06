@0E
Feature: Payment for Dry Fruits,Nuts and seeds

User login to the amazon site and clicks on grocies from open menu.
Next he will click on all grocery and gourmet foods and will 
select healthy food store.Later, he will click on Dry Fruits,Nuts and seeds 
and will select the desired dry fruits brand than he will make the payment.

      Background: User clicks on login button
      Given  User enters the url 
      When   User clicks on Accounts & List
      Then   Enter username and click on continue
      Then   Enter password and click on login button
      
         
     Scenario: User clicks on Dry Fruits
      When User clicks on open menu on left side corner
      Then User clicks on Beauty,Health,Grocery
      Then User clicks on All Grocery & Gourmet Foods
      Then User Clicks on Healthy Food Store from Featured Stores
      Then User Clicks on WONDERLAND FOODS California Raw 
      Then User clicks on add to cart and then proceed to buy
      And  User clicks on Netbanking and click on continue
      And  Finally User clicks on place your order and will close the browser 
      
      
      
      
      
      