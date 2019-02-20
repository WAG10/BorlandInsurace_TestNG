package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.AutoQuotePremiumPage;
import pageObjects.AutoQuoteSecondPage;
import pageObjects.AutoQuoteThirdPage;
import pageObjects.AutoQuotefirstPage;
import pageObjects.IndexPage;
import utilities.GetDataFromExcel;
import utilities.InitilizeBrowserDriver;
import utilities.TakeScreeshot;

public class CreateAutoQuoteTestNG {
	
	
	
	@Test
	public void TestAutoQuote_TC_001() throws IOException, InterruptedException
	{
		WebDriver driver = InitilizeBrowserDriver.InitlizeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		
		Select s = new Select(IndexPage.ServiceLogindropdown(driver));
		s.selectByVisibleText(GetDataFromExcel.GetCellValue("IndexPage","TC_001","ActionDropdown"));
		
		AutoQuotefirstPage.ZipCode(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_001", "ZipCode"));
		AutoQuotefirstPage.email(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_001", "email"));
		AutoQuotefirstPage.AutoMobileType(driver,GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_001", "AutoMobileType")).click();
		AutoQuotefirstPage.NextButton(driver).click();
		
		AutoQuoteSecondPage.age(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_001", "age"));
		AutoQuoteSecondPage.Gender(driver,GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_001", "Gender")).click();
		AutoQuoteSecondPage.Driveingrecord(driver,GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_001", "Driveingrecord")).click();
		AutoQuoteSecondPage.NextButton(driver).click();
		
		AutoQuoteThirdPage.YearOfManufacture(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_001", "YearOfManufacture"));
		AutoQuoteThirdPage.Make(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_001", "Make")).click();
		AutoQuoteThirdPage.Model(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_001", "Model")).click();
		AutoQuoteThirdPage.FinancialInfo(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_001", "FinancialInfo")).click();
		AutoQuoteThirdPage.NextButton(driver).click();
		
		TakeScreeshot.captureScreen(driver,"TC_001");
		
		AutoQuotePremiumPage.GetQuotePremium(driver);
		
		Thread.sleep(3000);
		driver.quit();
	}

	
	@Test
	public void TestAutoQuote_TC_002() throws IOException, InterruptedException
	{
		WebDriver driver = InitilizeBrowserDriver.InitlizeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		
		Select s = new Select(IndexPage.ServiceLogindropdown(driver));
		s.selectByVisibleText(GetDataFromExcel.GetCellValue("IndexPage","TC_002","ActionDropdown"));
		
		AutoQuotefirstPage.ZipCode(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_002", "ZipCode"));
		AutoQuotefirstPage.email(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_002", "email"));
		AutoQuotefirstPage.AutoMobileType(driver,GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_002", "AutoMobileType")).click();
		AutoQuotefirstPage.NextButton(driver).click();
		
		AutoQuoteSecondPage.age(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_002", "age"));
		AutoQuoteSecondPage.Gender(driver,GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_002", "Gender")).click();
		AutoQuoteSecondPage.Driveingrecord(driver,GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_002", "Driveingrecord")).click();
		AutoQuoteSecondPage.NextButton(driver).click();
		
		AutoQuoteThirdPage.YearOfManufacture(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_002", "YearOfManufacture"));
		AutoQuoteThirdPage.Make(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_002", "Make")).click();
		AutoQuoteThirdPage.Model(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_002", "Model")).click();
		AutoQuoteThirdPage.FinancialInfo(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_002", "FinancialInfo")).click();
		AutoQuoteThirdPage.NextButton(driver).click();
		
		
		TakeScreeshot.captureScreen(driver, GetDataFromExcel.GetCellValue("IndexPage", "TC_002", "TCName")+ ".png");
		
		TakeScreeshot.captureScreen(driver,"TC_002");
		
		AutoQuotePremiumPage.GetQuotePremium(driver);
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void TestAutoQuote_TC_003() throws IOException, InterruptedException
	{
		WebDriver driver = InitilizeBrowserDriver.InitlizeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		
		Select s = new Select(IndexPage.ServiceLogindropdown(driver));
		s.selectByVisibleText(GetDataFromExcel.GetCellValue("IndexPage","TC_003","ActionDropdown"));
		
		AutoQuotefirstPage.ZipCode(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_003", "ZipCode"));
		AutoQuotefirstPage.email(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_003", "email"));
		AutoQuotefirstPage.AutoMobileType(driver,GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_003", "AutoMobileType")).click();
		AutoQuotefirstPage.NextButton(driver).click();
		
		AutoQuoteSecondPage.age(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_003", "age"));
		AutoQuoteSecondPage.Gender(driver,GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_003", "Gender")).click();
		AutoQuoteSecondPage.Driveingrecord(driver,GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_003", "Driveingrecord")).click();
		AutoQuoteSecondPage.NextButton(driver).click();
		
		AutoQuoteThirdPage.YearOfManufacture(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_003", "YearOfManufacture"));
		AutoQuoteThirdPage.Make(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_003", "Make")).click();
		AutoQuoteThirdPage.Model(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_003", "Model")).click();
		AutoQuoteThirdPage.FinancialInfo(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_003", "FinancialInfo")).click();
		AutoQuoteThirdPage.NextButton(driver).click();
		
		TakeScreeshot.captureScreen(driver,"TC_003");
		
		AutoQuotePremiumPage.GetQuotePremium(driver);
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void TestAutoQuote_TC_004() throws IOException, InterruptedException
	{
		WebDriver driver = InitilizeBrowserDriver.InitlizeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		
		Select s = new Select(IndexPage.ServiceLogindropdown(driver));
		s.selectByVisibleText(GetDataFromExcel.GetCellValue("IndexPage","TC_004","ActionDropdown"));
		
		AutoQuotefirstPage.ZipCode(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_004", "ZipCode"));
		AutoQuotefirstPage.email(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_004", "email"));
		AutoQuotefirstPage.AutoMobileType(driver,GetDataFromExcel.GetCellValue("AutoQuotefirstPage", "TC_004", "AutoMobileType")).click();
		AutoQuotefirstPage.NextButton(driver).click();
		
		AutoQuoteSecondPage.age(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_004", "age"));
		AutoQuoteSecondPage.Gender(driver,GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_004", "Gender")).click();
		AutoQuoteSecondPage.Driveingrecord(driver,GetDataFromExcel.GetCellValue("AutoQuoteSecondPage", "TC_004", "Driveingrecord")).click();
		AutoQuoteSecondPage.NextButton(driver).click();
		
		AutoQuoteThirdPage.YearOfManufacture(driver).sendKeys(GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_004", "YearOfManufacture"));
		AutoQuoteThirdPage.Make(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_004", "Make")).click();
		AutoQuoteThirdPage.Model(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_004", "Model")).click();
		AutoQuoteThirdPage.FinancialInfo(driver,GetDataFromExcel.GetCellValue("AutoQuoteThirdPage", "TC_004", "FinancialInfo")).click();
		AutoQuoteThirdPage.NextButton(driver).click();
		
		TakeScreeshot.captureScreen(driver,"TC_004");
		
		AutoQuotePremiumPage.GetQuotePremium(driver);
		Thread.sleep(3000);
		driver.quit();
	}


	
	
}
