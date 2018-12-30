package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoQuotefirstPage {
	
	private static WebElement element = null;
	
	public static WebElement ZipCode(WebDriver driver)  //ZIp code
	{
		element = driver.findElement(By.id("autoquote:zipcode"));
		return element;
	}
	
	public static WebElement email(WebDriver driver)  //email 
	{
		element = driver.findElement(By.id("autoquote:e-mail"));
		return element;
	}
    
	public static WebElement AutoMobileType(WebDriver driver, String xPathLocation)   
	{
		element = driver.findElement(By.xpath(xPathLocation));
		return element;
	}
	
	public static WebElement NextButton(WebDriver driver)  //email 
	{
		element = driver.findElement(By.xpath("//input[@alt='Next']"));
		return element;
	}
}
