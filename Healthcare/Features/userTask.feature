Feature: purchase product from product list

  Scenario: login as a user and purhase a product
  
Given open the healthcare website
When click on the login
And put E-mail and the password
And click on Antibiotics
And add first item to cart
And click to continueShopping
And click on Analgesics
And add second item to cart
And click checkOut
And select Address
And Make a payment
Then close the browser