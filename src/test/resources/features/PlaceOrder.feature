Feature: Place the Order

Scenario: Add items to cart
Given Login into APP
| username | password |
| Ashok Kumar | Test |
When Add an item to cart "Nokia lumia 1520"
Then Items must be added to the cart "Nokia lumia 1520"

Scenario: Delete an item
#Given Login into APP
When List of items should be available in cart
Then Delete an item from cart

#Scenario: Place Order
#Given Login into APP
#When Items should be available in cart
#Then Place Order
#And Then Purchase Items