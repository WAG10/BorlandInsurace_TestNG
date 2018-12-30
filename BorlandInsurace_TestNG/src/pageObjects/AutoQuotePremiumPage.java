package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoQuotePremiumPage {
	
	 
	public static void GetQuotePremium(WebDriver driver)
	{
		System.out.println(driver.findElement(By.xpath("//form[@id='quote-result']/h1[2]")).getText());
	}
}
