Feature: Automate Register and Login APIs for https://reqres.in/

Scenario: Register user  using valid details
	Given the user have proper register request data 
	When the user get the registered user detaisl for user id 1
	Then register API should have status code as 200 and content-type as JSON 
	And the register API should return proper json response 
	
	Scenario: Get user   using valid details
	Given the user have proper register request data 
	When the user get the registered user detaisl for user id 2 
	Then register API should have status code as 200 and content-type as JSON 
	And the register API should return proper json response 
	
	Scenario Outline: Set user  using valid details
	Given the user have proper register request data 
	When the user get the registered user detaisl for user id <userid>
	Then register API should have status code as <code> and content-type as JSON 
	And the register API should return proper json response 
	
	Examples:
	|userid|code|
	|3|200|
	|4|200|
	|5|200|
	|6|200|
	|7|200|
	