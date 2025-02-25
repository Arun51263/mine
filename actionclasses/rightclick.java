package actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclick {
	
	WebDriver driver;
	Actions act;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Login')]"))).contextClick();
		act.moveToElement(driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]"))).contextClick();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		act.build().perform();
		
		String text=driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]")).getText();
		System.out.println("succesfull mouse over on login button" + text);
		
		
				
	}

}
