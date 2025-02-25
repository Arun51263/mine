package actionclasses;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionandiframeclass {

	//git push 
	public static WebDriver driver;
	public static Actions act;
	//git pushsss
	
		
		public static void main (String[] args) throws InterruptedException
		{
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arun\\Desktop\\chromedriver-win64\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		 //driver.manage().window().minimize();	
		 
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 
		 /*try {
			 
			 Thread.sleep(2000);
		 }
		 catch(Exception e) {
			 
		 }*/
		 
		 
		 
		 Thread.sleep(3000);
		 
		 //driver.switchTo().frame(1);
		 //switch to frame first
		 driver.switchTo().frame("callout");
		
		 
			 act=new Actions(driver);
			 //driver.findElement("//button[contains(text(),'Stay signed out')]");
WebElement element=driver.findElement(By.xpath("//button[contains(text(),'Stay signed out')]"));
act.moveToElement(element);
act.build().perform();
act.click();
element.click();
System.out.println("we have succesfully signed out from Sign out button  "+element.getText());

			
			 
		 }
		 
}
	


