package navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class backforwordrefresh {

	WebDriver driver;
	Actions act;
	//git

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().to("https://www.google.com/");
		
		//git addedss

	}

}
