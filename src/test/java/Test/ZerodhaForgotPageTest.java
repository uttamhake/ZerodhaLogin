package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;

public class ZerodhaForgotPageTest {
	
	WebDriver driver;

	@BeforeMethod
	public void openChrome() {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void forgotPage() {
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickOnForgot();
		zerodhaloginpage.enterUserID1("Abc");
	}
	
}
