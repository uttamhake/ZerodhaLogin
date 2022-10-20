package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.Swaglabs;

public class SwaglabsTest {

	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void enterValidData() throws InterruptedException {
		Swaglabs swaglabs = new Swaglabs(driver);
		swaglabs.enterUserID("standard_user");
		swaglabs.enterPassword("secret_sauce");
		swaglabs.clickOnLogin();
		Thread.sleep(3000);
		swaglabs.clickOnAddtocart();
		swaglabs.clickOnCart();
		swaglabs.clickOnCheckout();
		
		swaglabs.enterFirstname("Ajit");
		swaglabs.enterLastname("Hake");
		swaglabs.enterPostalcode("413512");
		Thread.sleep(2000);
		swaglabs.clickOnContinue();
		Thread.sleep(2000);
		swaglabs.clickOnFinish();
	}
}
