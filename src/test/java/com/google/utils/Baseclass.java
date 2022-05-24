package com.google.utils;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

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
public void closebrower() {
	driver.close();}





}
