package tests;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.CommonMethods;
import model.Locators;
import model.TimeOut;
import page.HomePage;


public class BongoTest {

	Base base = new Base();
	WebDriver driver = base.setup();
	CommonMethods commonMethods = new CommonMethods(driver);
	HomePage homePage = new HomePage(driver);
	TimeOut time = new TimeOut();
	
	@BeforeClass
	public void start() {
		driver.get(homePage.HomePageUrl());
		driver.manage().window().maximize();
		
	}
	@Test
	public void amazontest() {
		assertEquals(commonMethods.getTitle(),Locators.pageTitle);
		time.timeOut();
		
		commonMethods.clickOnButton(Locators.fashion);
		time.timeOut();
		base.close();
	}
}
