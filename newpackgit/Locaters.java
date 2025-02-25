package newpackgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locaters {
	
	public WebDriver driver;

	public static void main(String[]args) {
		//git pusheddd
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		/*Exception in thread "main" org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //button[starts-with(@id="u_0_5_")] because of the following error:
		SyntaxError: Failed to execute 'evaluate' on 'Document': The string '//button[starts-with(@id="u_0_5_")]' is not a valid XPath expression.*/
		
		/* Unable to find an exact match for CDP version 132, returning the closest version; found: 131; Please update to a Selenium version that supports CDP version 132
		Exception in thread "main" org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression */
		/* for the above exception i have updated the selenium version why because not able to higLighted the locaters in chrome develeper tool(CDP version)*/
		
				 WebElement element =driver.findElement(By.id("email"));
				 System.out.println(element);
				 //git tested;
				
				 
		
	}

}
