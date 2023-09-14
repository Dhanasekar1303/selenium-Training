package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pojo.GmailPojo;

public class GmailLogin extends BaseClass {
	GmailPojo g;
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("User has to launch the gmail url")
	public void user_has_to_launch_the_gmail_url() {
		launchUrl("https://mail.google.com/");

	}

	@When("User has to pass the valid email data {string} in email field")
	public void user_has_to_pass_the_valid_email_data_in_email_field(String em) {
		g=new GmailPojo();
		passText(em,g.getEmail());
		
	}

	@When("User has to click the email field next button")
	public void user_has_to_click_the_email_field_next_button() {
		g=new GmailPojo();
		clickBtn(g.getEmailNextBtn());

	}

	@When("User has to pass the valid password data {string} in password field")
	public void user_has_to_pass_the_valid_password_data_in_password_field(String pd) throws InterruptedException {
		Thread.sleep(3000);
		g=new GmailPojo();
		passText(pd,g.getPassword());
		
	}

	@When("User has to click the passwor field next button")
	public void user_has_to_click_the_passwor_field_next_button() {
		clickBtn(g.getPasswordNextBtn());

	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
		System.out.println("close entire browser");

	}

}
