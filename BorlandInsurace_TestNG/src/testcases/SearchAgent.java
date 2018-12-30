package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.FindAgentSearchPage;
import pageObjects.IndexPage;
import pageObjects.InsuranceAgentSearchResultPage;
import utilities.GetDataFromExcel;

public class SearchAgent {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		
		Select s = new Select(IndexPage.ServiceLogindropdown(driver));
		try {
			s.selectByVisibleText(GetDataFromExcel.GetCellValue("IndexPage","TC_002","ActionDropdown"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FindAgentSearchPage.ZipCodeTextBox(driver).sendKeys(GetDataFromExcel.GetCellValue("FindAgentSearchPage", "TC_002", "ZIPCode"));
		FindAgentSearchPage.SearchByZIPCodeButton(driver).click();
		InsuranceAgentSearchResultPage.ShowAgentSearchResult(driver);
		
	}

}
