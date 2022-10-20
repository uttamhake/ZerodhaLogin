package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;

public class ZerodhaSignUpTest {

	WebDriver driver;
	
	@BeforeMethod
	public void chromeBrowser() {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void signUp() {
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickOnSignUp();
		
	}
	
}
