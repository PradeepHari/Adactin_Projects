Feature: Hotel Booking 




Scenario Outline: To login 

	Given User launch the adactin application 
	When User enter the "<username>" in username field 
	And User enter the "<password>" in password field 
	Then User click the login button and to check it navigates to next page 
	Examples:
	|username|password|
	|AAA|111|
	|BBB|222|
	|PradeepHari|Pradeep123|
	
Scenario: To verify the search hotel page 


	When User launch the location 
	And user select the hotel 
	And user select the roomtype 
	And user select the number of rooms 
	And user select the check in date 
	And user select the check out date 
	And user select the no of adults 
	And user select the no of childrens 
	Then user click the search button 
	
Scenario: To Select Hotel 

	When User click the select button 
	Then Click continue button 
	
Scenario: To Book a Hotel 

	When User Enter the first name 
	And User enter the Last name 
	And User enter the Address 
	And User enter the Credit Card no 
	And User enter the credit card type 
	And User enter the expiry date 
	And User enter the expiry year 
	And User enter the CVV number 
	Then User click the submit button 
	
Scenario: To logout from the page 

	When User click to logoutbutton 
	
	
	
	
	
   