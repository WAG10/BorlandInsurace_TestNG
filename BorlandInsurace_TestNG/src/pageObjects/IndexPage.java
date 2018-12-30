package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage {

	
	private static WebElement element = null;
	
	public static WebElement ServiceLogindropdown(WebDriver driver)
	{
		element = driver.findElement(By.id("quick-link:jump-menu"));
		return element;
	}
	
	
}
