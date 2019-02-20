package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreeshot {
	//added to facilitate sceenhpotd

	public static void captureScreen(WebDriver driver,String FileNameWithPath)
	{
		
File ScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("Hello screenshot is being taken");
		try {
			FileUtils.copyFile(ScrFile, new File("C:\\Users\\Dhiraj\\Desktop\\" + FileNameWithPath+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
