package newpackgit;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchbrowser {

	public static void main(String[] args) {
		//finffffff

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arun\\Desktop\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://developer.chrome.com/docs/chromedriver/downloads");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("(//button[@aria-haspopup='menu'] )[1]")).click();
		
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

		
		/*when you not put enough weight then element is not going to be click then
		exception will come as:Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable*/
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		driver.findElement(By.xpath("//a[@href=\"https://developer.chrome.com/docs/web-platform\"]/div[contains(text(),'Web Platform')]")).click();
		
		
		
		//driver.findElement(By.xpath("//li[@class=\"devsite-nav-item\"]/a[@href=\"https://developer.chrome.com/docs/web-platform\"]")).getText();
		
		
		//div[contains(text(),'Web Platform')]
		
		//driver.close();
		
	}

}
