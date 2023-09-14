package org.stepdefinition;

import io.cucumber.datatable.DataTable;

import java.util.List;

import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pojo.AmazonSignInPojo;

public class AmazonSignIn extends BaseClass {
	AmazonSignInPojo a;

	@Given("To launch the chrome browser and window maimize")
	public void to_launch_the_chrome_browser_and_window_maimize() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url of the amazon application")
	public void to_launch_the_url_of_the_amazon_application() {
		launchUrl("https://www.amazon.in/");

	}

	@When("To click a accounts and lists")
	public void to_click_a_accounts_and_lists() {
		a = new AmazonSignInPojo();
		clickBtn(a.getAccounts());

	}

	@When("To pass the mobile or email in textbox")
	public void to_pass_the_mobile_or_email_in_textbox(DataTable d) {
		List<String> l = d.asList();
		a = new AmazonSignInPojo();
		passText(l.get(0), a.getEmailorMobileNo());

	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		a = new AmazonSignInPojo();
		clickBtn(a.getClickEmailContinueBtn());

	}

	@When("To pass the password in textbox")
	public void to_pass_the_password_in_textbox(DataTable d) {
		List<String> l = d.asList();
		a = new AmazonSignInPojo();
		passText(l.get(0), a.getPassword());

	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
		a = new AmazonSignInPojo();
		clickBtn(a.getClickSignIn());

	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
//		closeEntireBrowser();

	}

}
