package newpackgit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utils  {
	
	

	public static void screnshot( WebDriver driver,String filename) {
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File("./screenshots/"+file+""));
	} catch (IOException e) {
	}
		
		
		
	}
}


