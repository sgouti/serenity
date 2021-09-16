package com.uiautomation.apisteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.uiautomation.apiactions.RegisterUserActions;
import com.uiautomation.registeruserpojo.RegisterUserResponse;

public class RegisterUserSteps {
	
	@Steps
	RegisterUserActions registerUserActions;

	@Given("^the user have proper register request data$")
	public void the_user_have_proper_register_request_data() throws Exception {
		registerUserActions.getJSONRequestWithValidRegisterUserData();
	}

	@When("^the user sents a POST request to register API with valid request$")
	public void the_user_sents_a_POST_request_to_register_API_with_valid_request() throws Exception {
		//registerUserActions.requestQuoteAPIWithPostMethod();
		registerUserActions.requestApiGetUserDetailsMethod(1);
	}

	@When("^the user get the registered user detaisl for user id (\\d+)$")
	public void the_user_sents_a_GET_request_to_register_API_with_valid_request(int userid) throws Exception {
		//registerUserActions.requestQuoteAPIWithPostMethod();
		registerUserActions.requestApiGetUserDetailsMethod(userid);
	}
	@Then("^register API should have status code as (\\d+) and content-type as JSON$")
	public void register_API_should_have_status_code_as_and_content_type_as_JSON(int statusCode) throws Exception {
		assertThat("Verify Content Type for Order Api ", registerUserActions.getContentType(),
				equalTo("application/json; charset=utf-8"));
		assertThat("Verify Status code for Order Api ", registerUserActions.getStatusCode(), equalTo(statusCode));	
	}

	@Then("^the register API should return proper json response$")
	public void the_register_API_should_return_proper_json_response() throws Exception {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.serializeNulls().setPrettyPrinting().create();
		RegisterUserResponse registerUserResponse = gson.fromJson(registerUserActions.response.asString(), RegisterUserResponse.class); 
		assertThat(registerUserActions.getContentType(),is(notNullValue()));
		System.out.println(registerUserActions.getContentType());
		/*assertThat("Verify User registration Token", registerUserResponse.getToken(),
				is(notNullValue()));*/
	}
}
