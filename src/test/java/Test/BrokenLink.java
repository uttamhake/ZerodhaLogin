package Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class BrokenLink {

		public static void main(String[] args) 
	{
		WebDriver driver = Browser.openBrowser();
	
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println(link.size());
		
		for(int i=0; i < link.size(); i++)
		{
			String url = link.get(i).getAttribute("href");
			
			if(url.isEmpty()||url==null)
			{
				continue;
			}
			
			try
			{
				HttpURLConnection huc = (HttpURLConnection) new URL(url).openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				int responsecode = huc.getResponseCode();
				
				if(responsecode >= 400)
				{
					System.out.println("Broken linl :- " + url);
				}
				else
				{
					System.out.println("Link is working successfully :- " + url);
				}
			} 
		    catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
