package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitilizeBrowserDriver {
	
	
	
	public static  WebDriver InitlizeDriver() throws IOException 
	{
		
		//String TestRunningon;
		WebDriver driver;
		//Properties prop = new Properties();
		//FileInputStream fs = new FileInputStream("E:\\Selenium\\projects\\BorlandInsurace_TestNG\\BrowserInit.properties");
		//prop.load(fs);
		/*switch (prop.getProperty("Browser").toLowerCase())
		{
		case "chrome":*/
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
			/*break;
		case "mozilla":
			System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();;	
			break;
		default:
			break;
		}*/
        return driver;
		
		
			
	}

}
