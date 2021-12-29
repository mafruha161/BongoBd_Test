package page;

import org.openqa.selenium.WebDriver;

import model.Locators;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public String HomePageUrl() {
		return Locators.homePageUrl;
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
