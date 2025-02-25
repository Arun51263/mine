package newpackgit;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot extends utils  {
	
	private static final String JavascripExecutor = null;
	
	

	public static void main(String[] args) {
		
		System.setProperty("werbdriver.chrome.driver","C:\\Users\\Arun\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		utils.screnshot(driver, "arun.png");
		
		
	

	}

}
