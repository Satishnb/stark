package Login;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class videoLike

{
	
WebDriver driver;
	
	
	public  void openBrowser() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "/Users/Satish/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://youtube.com");
		Thread.sleep(3000);

	
		
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.className("BHzsHc")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("itsytube77@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123@123");
		//driver.findElement(By.xpath("//div[text()='Enter your password']")).sendKeys("stark@tony");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		
		List <WebElement> all =driver.findElements(By.id("video-title"));
		//give the size of all same web elements
		int value=all.size();
		System.out.println(value);
		// will click on first video
		all.get(0).click();
		Thread.sleep(5000);
		
		

		
		driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label,'likes')]")).click();		
				/*
		 * List <WebElement> like =driver.findElements(By.className("yt-icon-button"));
		 * like.get(53).click();
		 * //driver.findElement(By.cssSelector("yt-icon-button#button")).click();
		 * Thread.sleep(8000);
		 */

		}
	
	public static void main(String[] args) throws InterruptedException {
		
		videoLike vl = new videoLike();
		vl.openBrowser();
		
	}
	}


