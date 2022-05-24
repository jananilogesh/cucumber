package com.google.stepdef;


import org.junit.Assert;

import com.google.pages.Homepage;
import com.google.pages.Loginpage;
import com.google.utils.Baseclass;
import io.cucumber.java.en.*;


public class HotelLogin extends Baseclass {
	Loginpage lp;
	Homepage hp;
	@Given("launch the browser")
	public void launch_the_browser() {
	  launchBrowesr("chrome");
	  iwait(10);
	  maxi();
	}
	@Given("open the application")
	public void open_the_application() {
		openApp("https://adactinhotelapp.com/");
		lp=new Loginpage();

	}
	@When("enter the username and password")
	public void enter_the_username_and_password() {
		send(lp.getUser(), "janani692");
		send(lp.getPass(),"janu123");
		
	   
	}
	@When("click the login button")
	public void click_the_login_button() {
		click(lp.getLogin());
		hp=new Homepage();
	  
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		
		
	String actual=hp.getShow().getAttribute("value");
	String expected="Hello janani692!";
	Assert.assertEquals(actual, expected);
	
	screenshot("Libraries\\Pictures\\janani.png");
	   
	}
	@Then("close the browser")
	public void close_the_browser() {
		closebrower();
	    
	}



}
