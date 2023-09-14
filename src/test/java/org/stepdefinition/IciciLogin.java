package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pojo.IciciPojo;

public class IciciLogin extends BaseClass {
	IciciPojo i;

	@Given("To launch the chrome browser and window maximize")
	public void to_launch_the_chrome_browser_and_window_maximize() {
		launchBrowser();
		windowMaximize();

	}

	@When("To launch the url of the icici application")
	public void to_launch_the_url_of_the_icici_application() {
		launchUrl("https://www.icicibank.com/");

	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		i = new IciciPojo();
		clickBtn(i.getLogin());

	}

	@When("To enter the user id in the text box")
	public void to_enter_the_user_id_in_the_text_box() {
		i = new IciciPojo();
		passText("6534668997", i.getUserId());

	}

	@When("To enter the password in the text box")
	public void to_enter_the_password_in_the_text_box() {
		i = new IciciPojo();
		passText("12345", i.getPassword());

	}

	@When("To click the icici login button")
	public void to_click_the_icici_login_button() {
		i = new IciciPojo();
		clickBtn(i.getIciciLogin());
	}

	@Then("To close the entire browser")
	public void to_close_the_entire_browser() {
		closeEntireBrowser();

	}

}
