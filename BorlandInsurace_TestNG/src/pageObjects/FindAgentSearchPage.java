package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindAgentSearchPage {
	
	private static WebElement element = null;

	public static WebElement ZipCodeTextBox(WebDriver driver)
	{
		element = driver.findElement(By.id("zip-search:zipcode"));
		return element;
	}
	
	public static WebElement SearchByZIPCodeButton(WebDriver driver)
	{
		element = driver.findElement(By.id("zip-search:search-zipcode"));
		return element;
	}
	
	public static WebElement LastNameTextBox(WebDriver driver)
	{
		element = driver.findElement(By.id("name-search:lastName"));
		return element;
	}
	
	public static WebElement SearchByLastNameButton(WebDriver driver)
	{
		element = driver.findElement(By.id("name-search:search-name"));
		return element;
	}
	
	public static WebElement ShowAllAgentButton(WebDriver driver)
	{
		element = driver.findElement(By.id("show-all:search-all"));
		return element;
	}
}
