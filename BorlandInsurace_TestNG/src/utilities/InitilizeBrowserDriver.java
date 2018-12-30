package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitilizeBrowserDriver {
	
	
	
	public static WebDriver InitlizeDriver() throws IOException 
	{
		
		//String TestRunningon;
		WebDriver driver=null;
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("E:\\Selenium\\projects\\BorlandInsurace_TestNG\\BrowserInit.properties");
		prop.load(fs);
		//TestRunningon=prop.getProperty("Browser").toLowerCase();
		
		switch (prop.getProperty("Browser").toLowerCase())
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
			break;
		case "mozilla":
			System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();;	
			break;
		default:
			break;
		}
        return driver;
		
		
			
	}

}
