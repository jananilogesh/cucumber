package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utils.Baseclass;

public class Homepage extends Baseclass {
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username_show")
	private WebElement show;
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement datein;
	
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy(id="Submit")
	private WebElement Submit;
	
	
	
	public WebElement getLoc() {
		return loc;
	}

	public WebElement getShow() {
		return show;
	}
	
}
