package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.ExtentReport;
import utility.Parametrization;
import utility.Screenshot;
import utility.ZerodhaPageElements;

@Listeners(utility.Listeners.class)

public class ZerodhaLoginPageTest extends ZerodhaPageElements {

	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void createReports() {
		reports=ExtentReport.getReports();
	}
	
	@BeforeMethod
	public void openChromeBrowser() {
		driver = Browser.openBrowser();
	}
	
	@Test(timeOut=2000)
	public void validateZerodaLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		
		test = reports.createTest("validateZerodaLogin");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.enterUserID(Parametrization.getExcelSheet(0, 1,"credentials"));
		zerodhaLoginPage.enterPassword(Parametrization.getExcelSheet(1, 1,"credentials"));
		Thread.sleep(5000);
		zerodhaLoginPage.clickOnLogin();
		zerodhaLoginPage.enterPin(Parametrization.getExcelSheet(2, 1,"credentials"));
		zerodhaLoginPage.clickOnContinue();
		
	}
	
	@Test
	public void signUp() throws IOException {
		
		test = reports.createTest("signUp");
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickOnSignUp();
	}
	
	@Test(dependsOnMethods= {"validateZerodaLogin"})
	public void forgot() {
		
		test = reports.createTest("forgot");
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickOnForgot();
	}
	
	@AfterMethod
	public void captureResult(ITestResult result) {
		
		if(result.getStatus() == ITestResult.SUCCESS) 
		{
		    test.log(Status.PASS , result.getName());	
		}
		else if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL , result.getName());
		}
		else
		{
			test.log(Status.SKIP , result.getName());
		}
    }
	
	@AfterTest
	public void flushResults() {
		reports.flush();
	}
	
}
