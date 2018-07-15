package com.googleyahoo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.fnb.pages.GoogleLoginPage;
import com.fnb.utils.SeleneseActionMethods;

public class GoogleHomePageTest {
	
	private WebDriver driver;
	String appURL="http://google.com";
	
	@BeforeClass
	public void testSetUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void verifyGooglePageTitle()
	{
		SeleneseActionMethods.launchUrl(driver, appURL);
		Assert.assertEquals(GoogleLoginPage.getTitle(driver), "Google");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
