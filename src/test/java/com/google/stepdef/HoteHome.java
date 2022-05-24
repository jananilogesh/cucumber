package com.google.stepdef;

import com.google.pages.Homepage;
import com.google.pages.Loginpage;
import com.google.utils.Baseclass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HoteHome extends Baseclass {
	Loginpage lp;
	Homepage hp;
	@When("select the location")
	public void select_the_location() {
		//iwait(10);
	//dropdown(hp.getLoc(), 3);
	    
	}

	@When("select the hotel")
	public void select_the_hotel() {
		dropdown(hp.getHotel(), 1);
	    
	}

	@When("select the room type")
	public void select_the_room_type() {
		
		dropdown(hp.getRoomtype(), 2);
	    
	}

	@When("select the number of rooms")
	public void select_the_number_of_rooms() {
		dropdown(hp.getRoomnos(), 3);
	    
	}

	@When("select check in date")
	public void select_check_in_date() {
		date();
		
		
	    
	}

	@When("select the check out date")
	public void select_the_check_out_date() {
	    date();
	}

	@When("Select adults")
	public void select_adults() {
		dropdown(hp.getAdultroom(), 2);
	    
	}

	@When("select children")
	public void select_children() {
		dropdown(hp.getChildroom(), 2);
	    
	}

	@When("click the Search button")
	public void click_the_search_button() {
		click(hp.getSubmit());
	    
	}

	@Then("I validate the outcome")
	public void i_validate_the_outcome() {
		
		System.out.println("Booking success");
	    
	}


}
