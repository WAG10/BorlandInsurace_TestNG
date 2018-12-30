package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsuranceAgentSearchResultPage {
	


	public static void ShowAgentSearchResult(WebDriver driver)
	{
	  System.out.println(driver.findElement(By.id("ext-gen5")).getText());
	  System.out.println(driver.findElement(By.xpath("//tr[@class='message-info']/td")).getText());
	 
	}
	
	
}
