@Homepage
Feature: UI Automation Testing for the Homepage
  


	@test1
  Scenario Outline: Login Testing
    Given User is on homepage
    When User clicks on Sign In button
    And User logins with email as "<email>" and password as "<password>"
    Then User must login to the website
    
    Examples:
    | email | password |
    | dem@gmail.com | dem123 |
    
  @test2
	Scenario Outline: Search query testing
		Given User is on homepage
		When User enters search query as "<search>"
		Then Search query should be executed
		
		Examples:
		| search |
		| Faded Short Sleeve T-shirts |
		| Printed Chiffon Dress |
		
	@test3
	Scenario: Add product to cart testing
		Given User is on homepage
		When User clicks on a product
		And User adds the product to the cart
		Then The product must be successfully added to the cart
		
	@test4
	Scenario: Order checkout testing
		Given User is on homepage
		When User clicks on the cart
		And User proceeds to checkout
		Then The order is successfully placed 
		
	@test5
	Scenario Outline: Contact us button testing
		Given User is on homepage
		When User clicks on the Contact us button
		And User fills the message form with message as "<message>" and submits it
		Then The message is successfully sent to the team
		
		Examples:
		| message |
		| Delivery was late. Very poor service. |
	

		
