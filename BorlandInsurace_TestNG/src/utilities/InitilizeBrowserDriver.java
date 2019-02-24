package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InitilizeBrowserDriver {
	
	
	
	public static  WebDriver InitlizeDriver() throws IOException 
	{
		
		//
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("E:\\Selenium\\projects\\BorlandInsurace_TestNG\\BrowserInit.properties");
		prop.load(fs);
		System.out.println(prop.getProperty("Browser").toLowerCase().toString());
		
		String TestRunningon= prop.getProperty("Browser").toLowerCase().toString();
		
		if(!TestRunningon.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else
		{
			System.out.println("hahaaha");
			/*System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();*/
		}
		/*switch (prop.getProperty("Browser").toLowerCase().toString())
		{
		case "chrome":
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
			break;
		}
		}*/


        return driver;
		
		
			
	}

}
