package org.step;

import org.fbloginpojo.AmazonLogin;
import org.lib.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonDefinition extends BaseClass {
	static public AmazonLogin a;

	@Given("Launch the chrome browser")
	public void launch_the_chrome_browser() {
		//browserLaunch();
		launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		maxWin();
	}

	@When("pass the value in emailfied")
	public void pass_the_value_in_emailfied() {
		a = new AmazonLogin();
		fillText(a.getTextEmail(), "8524046025");

	}

	@When("click the continue button")
	public void click_the_continue_button() {
		a = new AmazonLogin();
		btnClick(a.getConBtn());
	}

	@When("pass the value in passwordfied")
	public void pass_the_value_in_passwordfied() {
		a = new AmazonLogin();
		fillText(a.getTextPass(), "1111111");
	}

	@When("click singin button")
	public void click_singin_button() {
		a = new AmazonLogin();
		btnClick(a.getSignInBtn());
	}

	@Then("close the chrome browser")
	public void close_the_chrome_browser() {
		browserClose();
	}
	
	@Given("to Launch the chrome browser")
	public void to_Launch_the_chrome_browser() {
		launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		maxWin();
	}

	@When("to pass the value in emailfied")
	public void to_pass_the_value_in_emailfied() {
		a = new AmazonLogin();
		fillText(a.getTextEmail(), "8524046025");

	}

	@When("to click the continue button")
	public void to_click_the_continue_button() {
		a = new AmazonLogin();
		btnClick(a.getConBtn());
	}

	@When("to pass the value in passwordfied")
	public void to_pass_the_value_in_passwordfied() {
		a = new AmazonLogin();
		fillText(a.getTextPass(), "1111111");
	}

	@When("to click singin button")
	public void to_click_singin_button() {
		a = new AmazonLogin();
		btnClick(a.getSignInBtn());
	}

	@Then("to close the chrome browser")
	public void to_close_the_chrome_browser() {
		browserClose();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
