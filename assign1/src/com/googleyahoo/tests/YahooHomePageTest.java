package com.googleyahoo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.fnb.pages.YahooLoginPage;
import com.fnb.utils.SeleneseActionMethods;

public class YahooHomePageTest {
	
	private WebDriver driver;
	String appURL="http://yahoo.com";
	
	@BeforeClass
	public void testSetUp()
	{
		driver =new ChromeDriver();
		
	}
	
	
	@Test
	public void verifyYahooPageTitle()
	{
		SeleneseActionMethods.launchUrl(driver, appURL);
		Assert.assertEquals(YahooLoginPage.getTitle(driver), "Yahoo");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
