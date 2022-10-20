package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {

	@FindBy (xpath="//input[@id='userid']") private WebElement userID;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//button[@type='submit']") private WebElement login;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signUp;
	@FindBy (xpath="//input[@type='password']") private WebElement pin;
	@FindBy (xpath="//button[@type='submit']") private WebElement submitPin;
	@FindBy (xpath="//a[text()='Problem with PIN?']") private WebElement problemwithpin;
	@FindBy (xpath="(//input[@type='text'])[1]") private WebElement UserID;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserID(String user) {
		userID.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void clickOnForgot() {
		forgot.click();
	}
	
	public void clickOnSignUp() {
		signUp.click();
	}
	
	public void enterPin(String pinNumber) {
		pin.sendKeys(pinNumber);
	}
	
	public void clickOnContinue() {
		submitPin.click();
	}
	
	public void clickOnProblemWithPin() {
		problemwithpin.click();
	}
	public void enterUserID1(String id) {
		UserID.sendKeys(id);
	}
}
