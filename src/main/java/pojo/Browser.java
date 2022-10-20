package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver openBrowser() {
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\UTTAM HAKE\\Documents\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.zlti.com/");
		
		driver.manage().window().maximize();
		
		return driver;
	}
}
