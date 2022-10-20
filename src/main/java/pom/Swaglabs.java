package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglabs {

	@FindBy (xpath="//input[@id='user-name']") private WebElement userID;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//input[@id='login-button']") private WebElement login;
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addtocart;
	@FindBy (xpath="//a[@class='shopping_cart_link']") private WebElement cart;
	@FindBy (xpath="//button[@id='checkout']") private WebElement checkout;
	@FindBy (xpath="//input[@id='first-name']") private WebElement firstname;
	@FindBy (xpath="//input[@id='last-name']") private WebElement lastname;
	@FindBy (xpath="//input[@id='postal-code']") private WebElement postalcode;
	@FindBy (xpath="//input[@id='continue']") private WebElement Continue;
	@FindBy (xpath="//button[@id='finish']") private WebElement finish;
	
	public Swaglabs(WebDriver driver) {
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
	
	public void clickOnAddtocart() {
		addtocart.click();
	}
	
	public void clickOnCart() {
		cart.click();
	}
	
	public void clickOnCheckout() {
		checkout.click();
	}
	
	public void enterFirstname(String name) {
		firstname.sendKeys(name);
	}
	
	public void enterLastname(String Lastname) {
		lastname.sendKeys(Lastname);
	}
	
	public void enterPostalcode(String code) {
		postalcode.sendKeys(code);
	}
	
	public void clickOnContinue() {
		Continue.click();
	}
	
	public void clickOnFinish() {
		finish.click();
	}
}
