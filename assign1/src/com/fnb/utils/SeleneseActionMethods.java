package com.fnb.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleneseActionMethods {
	
	public static WebElement element=null;
	
	public static void launchUrl(WebDriver driver,String appURL)
	{
		driver.navigate().to(appURL);
		driver.manage().window().maximize();
	}

}
