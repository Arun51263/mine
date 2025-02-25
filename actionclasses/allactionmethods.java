package actionclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allactionmethods {

	static WebDriver driver;
	static Actions act;
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		try{
			driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
			
			Thread.sleep(4000);
		}
		
		catch(Exception r) {
			
			
			
		}
//Exception in thread "main" org.openqa.selenium.ScriptTimeoutException: script timeout
//(this will come while using the javascriptexecutor interface using scrolling the pages)
JavascriptExecutor script=(JavascriptExecutor)driver;	
try {}

finally {
	//script.executeAsyncScript("window.scrollBy(0,1000)");
	
	
	
}
//Even scroll By the dropwdown can be done by using the ACTIONS Classes below is the code.
/*Thread.sleep(3000);

Actions act=new Actions(driver); 

act.clickAndHold();
act.scrollByAmount(0, 400);
act.build().perform();*/
}
		
		
	}


