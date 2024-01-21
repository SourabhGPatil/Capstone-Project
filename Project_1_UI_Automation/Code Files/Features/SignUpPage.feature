@SignUpPage
Feature: UI Automation Testing for the Sign Up Page

  @SignUpPageTest1
  Scenario: Basic Signup testing
  	Given User is on the signup page
  	When User creates an account with the email "kevinsmith201059991996@gmail.com"
  	Then User signup is successful
  	
  @SignUpPageTest2
  Scenario Outline: User Registration Testing
  	Given User is on the Registraion Form
  	When User enters First Name as "<fname>" Last Name as "<lname>" Password as "<pwd>" Company as "<company>" Address as "<address>" City as "<city>" Zip as "<zip>" Home Phone as "<hphone>" Mobile Phone as "<mphone>" Address Alias as "<alias>"
  	Then User is successfully registered
  	
  	Examples: 
      | fname | lname | pwd | company | address | city | zip | hphone | mphone | alias |
      | Kevinn | Smith | kevinsmith123 | Wipro | 4478 Sunrise Road, Las Vegas, NV | Las Vegas | 89134 | 702-892-9675 | 702-205-7725 | Kev |
      
   @SignUpPageTest3
   Scenario: Sign out button testing
   	When User clicks on the sign out button
   	Then User must be signed out from the account
   	
   @SignUpPageTest4
   Scenario: Forgot/Retrieve Password Testing
   	Given User is on the signup page
   	When User clicks on the Forgot Password option
   	And User completes the Retrieve Password process with the email "kevinsmith201059991996@gmail.com"
   	Then User successfully retrieves the password
   	
   @SignUpPageTest5
   Scenario: Subscribe to Newsletter testing
		Given User is on the signup page
		When User enters the email "kevinsmith201059991996@gmail.com"
		And User clicks on the proceed button
		Then User will successfully be subscribed to the newsletter
   	
   	
