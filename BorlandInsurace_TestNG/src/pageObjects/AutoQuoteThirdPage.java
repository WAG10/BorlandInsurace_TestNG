package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoQuoteThirdPage {

	private static WebElement element = null;
	
	
	public static WebElement YearOfManufacture(WebDriver driver)
	{
		
		driver.findElement(By.id("autoquote:year")).clear();
		element = driver.findElement(By.id("autoquote:year"));
		return element;
	}
	
	public static WebElement Make(WebDriver driver, String MakeXPath) throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@id='ext-gen4']")).click();
		WebDriverWait Wait = new WebDriverWait(driver, 5);
		WebElement VehicleBrand = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MakeXPath)));
		return VehicleBrand;
	}
	
	public static WebElement Model(WebDriver driver, String ModelXPath) throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@id='ext-gen6']")).click();
		WebElement Model = null;
		boolean staleElement = true; 
		while(staleElement){
		  try{
		     Model=  driver.findElement(By.xpath(ModelXPath));
		     staleElement = false;

		  } catch(StaleElementReferenceException e){
		    staleElement = true;
		  }
		}
		return Model;
	}
	
	public static WebElement FinancialInfo(WebDriver driver, String FinancialInfoOptionXpath)
	{
		
		WebDriverWait Wait = new WebDriverWait(driver, 5);
		WebElement FinincialInfo = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FinancialInfoOptionXpath)));
		//element = driver.findElement(By.xpath(FinancialInfoOptionXpath));
		return FinincialInfo;
	}
	
	public static WebElement NextButton(WebDriver driver)
	{
		
		element = driver.findElement(By.id("autoquote:next"));
		return element;
	}
	
}
