package newpackgit;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchwindow {
	
	public WebDriver driver;

	public static void main(String[]args) throws InterruptedException {
		//window puxh
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Arun\\Desktop\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.salesforce.com/in/?ir=1");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[@href=\"/in/form/signup/freetrial-sales-starter/?d=jumbo1-btn-ft\"]")).click();
		 
		 
		 Set<String> windows=driver.getWindowHandles();
				 
				 
		 Iterator<String> ite=windows.iterator();
		 
		 
		 String parent=ite.next();
		 String child=ite.next();
		 driver.switchTo().window(child);
		 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@name=\"UserFirstName\"]")).sendKeys("arun");
		/* String title=driver.getTitle();
		 		 for(String ite1: windows)
		 			 if(!ite1.equals(title)) {
		System.out.println(title);
		 
		//driver.close();*/
		
		driver.switchTo().window(parent);
		System.out.println(parent);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		 
		 
		 
	}

}
