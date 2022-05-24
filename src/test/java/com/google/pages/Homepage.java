package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utils.Baseclass;

public class Homepage extends Baseclass {
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Welcome to Adactin Group of Hotels")
	private WebElement show;

	public WebElement getShow() {
		return show;
	}
	
}
