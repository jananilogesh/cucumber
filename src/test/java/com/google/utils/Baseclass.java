package com.google.utils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	
	public static WebDriver driver;
	
	public void launchBrowesr(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		}
	public void openApp(String url) {
		driver.get(url);
	}
	
	public void maxi() {
		driver.manage().window().maximize();
	}
public void iwait(int time) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
}
public void send(WebElement element, String value ) {
	element.clear();
	element.sendKeys(value);
}
public void date( ) {
	Date thisdate = new Date();
	SimpleDateFormat dateform = new SimpleDateFormat("MM/dd/YY");
	System.out.println(dateform.format(thisdate));
	
}
	


public void click(WebElement element) {
	element.click();
}

public void screenshot(String path) {
	
	try {
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src=tk.getScreenshotAs(OutputType.FILE);
	File des=new File(path);
		FileHandler.copy(src, des);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} 
public void dropdown(WebElement element,int value)
{
	Select sc=new Select(element);
	sc.selectByIndex(value);
}

public void closebrower() {
	driver.close();}





}
