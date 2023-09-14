package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class IciciHooksClass extends BaseClass {
	@Before(order = 1)
	private void precondition2() {
		launchBrowser();
	}

	@Before(order = 2)
	private void precondition1() {
		windowMaximize();
	}

	@Before(order = 3)
	private void precondition3() {
		System.out.println("smoke");

	}
	@After(order=10)
	private void postcondition2() {
		System.out.println("takes screenshot");
	}
	@After(order=9)
	private void postcondition1() {
		closeEntireBrowser(); 
	}
	

}
