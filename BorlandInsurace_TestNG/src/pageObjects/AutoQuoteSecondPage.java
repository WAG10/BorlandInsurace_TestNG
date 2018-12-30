package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoQuoteSecondPage {

	private static WebElement element = null;
	
	public static WebElement age(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@name='autoquote:age']"));
		return element;
	}
	
	public static WebElement Gender(WebDriver driver,String genderXPathLocation)
	{
		element = driver.findElement(By.xpath(genderXPathLocation));
		return element;
	}
	
	public static WebElement Driveingrecord(WebDriver driver,String DrivingRecordXpath)
	{
		element = driver.findElement(By.xpath(DrivingRecordXpath));
		return element;
	}
	
	public static WebElement NextButton(WebDriver driver)
	{
		element = driver.findElement(By.id("autoquote:next"));
		return element;
	}
	
	
	
	
	
}
