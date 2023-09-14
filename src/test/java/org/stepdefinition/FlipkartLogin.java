package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartLogin extends BaseClass{
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch the url of the flipkart application")
	public void to_launch_the_url_of_the_flipkart_application() {
		launchUrl("https://www.flipkart.com/");
	    
	}

	@When("To pass the valid mobile number")
	public void to_pass_the_valid_mobile_number() {
		System.out.println("enter the valid mobile number");
	   
	}

	@When("To click the request otp")
	public void to_click_the_request_otp() {
		System.out.println("enter the OTP");
	    
	}

	@When("To check whether navigate to the login page or not")
	public void to_check_whether_navigate_to_the_login_page_or_not() {
		System.out.println("check whether navigate to the login page or not");
	   
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	   
	}

}
