package Login;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.Select;

public class openBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		                 // set exe property for browser 
		System.setProperty("webdriver.chrome.driver","/Users/Satish/Desktop/chromedriver"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		  
		               // login 
		
		  driver.get("http://stark.nearbuytoolsstag.in/fox/login");
		  driver.findElement(By.xpath("//a[@class='btn red default']")).click();
		  driver.findElement(By.id("identifierId")).sendKeys("biz.mca1@gmail.com");
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  Thread.sleep(4000);
		  //driver.findElement(By.xpath("input[@type='password']")).sendKeys("stark@tony");
		  driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("stark@tony");
		  driver.findElement(By.className("CwaK9")).click();
		  Thread.sleep(5000);
		 
		 
		                        // Add new merchant
		
		
		  driver.findElement(By.xpath("//a[text()='Add New Merchant ']")).click();
		  driver.findElement(By.id("name")).sendKeys("dtmerchat58");
		  driver.findElement(By.id("addressLine1")).sendKeys("Suncity Gurgaon");
		  driver.findElement(By.id("latLong")).sendKeys("28.43691, 77.11262");
		  driver.findElement(By.id("redemptionLocationFetchBtn")).click();
		  Thread.sleep(3000);
		 
		 

		                 // driver.findElement(By.id("s2id_pinCode")).click();
		                // Thread.sleep(4000);
		                // driver.findElement(By.xpath("//div[text()='122003']")).click();
		                // Thread.sleep(2000);
		 
	
		
		  driver.findElement(By.id("pContactNo0")).sendKeys("8285240657");
		  driver.findElement(By.id("rContactNo0")).sendKeys("8285240657");
		 
		
		                  //for scrolling
		                  //JavascriptExecutor js = (JavascriptExecutor)driver;
		                  // js.executeScript("scroll(0, 350)");
         
		                   //due to overlay element not clcikable
		
		
		
		  WebElement ele = driver.findElement(By.id("timing1.isOpen1"));
		  driver.executeScript("arguments[0].click();", ele);
		  
		  
		  WebElement ele1 = driver.findElement(By.id("timing1.isOpenAllDay1"));
		  JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		  executor1.executeScript("arguments[0].click();", ele1);
		  
		  WebElement ele2 =
		  driver.findElement(By.xpath("//button[@onclick='setTiming()']"));
		  JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		  executor3.executeScript("arguments[0].click();", ele2);
		  
		  
		  WebElement cat = driver.findElement(By.id("category")); Select s1 = new
		  Select(cat); s1.selectByVisibleText("Food & Beverages"); Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//label[text()='Bakery']")).click();
		  driver.findElement(By.xpath("//label[text()='Afghani']")).click();
		  driver.findElement(By.xpath("//label[text()='Pure Veg']")).click();
		  driver.findElement(By.xpath("//label[text()='Breakfast']")).click();
		  driver.findElement(By.xpath("//label[text()='AC']")).click();
		  driver.findElement(By.xpath("//label[text()='No Seating']")).click();
		  
		  
		  driver.findElement(By.xpath(
		  "//label[@for='catInfo.fields[SVL-ALC].values-SVL']")).click();
		  driver.findElement(By.xpath(
		  "//label[@for='catInfo.fields[HAV-DLY].values-HAV']")).click();
		  driver.findElement(By.xpath(
		  "//label[@for='catInfo.fields[TAV-TKY].values-TAV']")).click();
		  driver.findElement(By.xpath("//label[text()='No Bar']")).click();
		  driver.findElement(By.xpath("//label[text()='Cash']")).click();
		  Thread.sleep(2000);
		 
		 
		
		                   // upload image using common value 
		                  //  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/Satish/Downloads/pestt (1).jpg");
		  
                          // upload image using exact path ( how to create path for merchant image)
		
		
		
		
		  driver.findElement(By.xpath("//*[@id=\'cat-MER\']//div/div[1]/span/input")).
		  sendKeys("/Users/Satish/Downloads/pestt (1).jpg"); 
		  Thread.sleep(3000);
		  driver.findElement(By.id("draftBtn")).click(); 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.id("search-box")).sendKeys("dtmerchat58",Keys.ENTER);
		  driver.findElement(By.xpath("//a[text()='dtmerchat58']")).click();
		  Thread.sleep(4000);
		 
		  driver.findElement(By.id("pContactNo0")).sendKeys(Keys.ENTER);
		  Thread.sleep(4000);
		 
	
		
		                         //submit to IE
		
		
		
		
		  WebElement ele7 =
		  driver.findElement(By.xpath("//button[text()='Submit Mca']"));
		  driver.executeScript("arguments[0].click();", ele7); Thread.sleep(2000);
		 
		 
		  
		  
		
		  driver.findElement(By.id("search-box")).sendKeys("dtmerchat58",Keys.ENTER);
		  Thread.sleep(2000);
		 
		  
		                        // xpath using inspect element 
		  
		  
		
		  String mid1=driver.findElement(By.xpath("//*[@id='unPublish']/table/tbody/tr/td[3]")). getText();
		 
		  
		  //using link text when href available
		  
		
		  driver.findElement(By.linkText("Home")).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("Reassign Merchant")).click();
		  driver.findElement(By.id("s2id_autogen2")).sendKeys("image");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='ROLE_']")).click();
		  driver.findElement(By.id("merchantId")).sendKeys(mid1);
		  driver.findElement(By.xpath("//button[text()='Search']")).click();
		  Thread.sleep(2000); driver.findElement(By.id(mid1)).click();
		 
		 
			  
		
		 
		
		
		  Thread.sleep(2000);
		  driver.findElement(By.id("s2id_autogen13")).sendKeys("biz");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[text()='biz.imged1@gmail.com']")).click() ;
		  driver.findElement(By.id("reassign")).click(); Thread.sleep(1000);
		 
			  
			  //Alert simpleAlert = driver.switchTo().alert();

		 driver.switchTo().alert().accept(); 
		 
		  
		 
		
		  Thread.sleep(4000);
		  
		  WebElement ele11 = driver.findElement(By.xpath("//a[text()='Home']"));
		  driver.executeScript("arguments[0].click();", ele11);
		  
		  //driver.findElement(By.linkText("Home")).click(); Thread.sleep(3000);
		  
		  
		  
		  Thread.sleep(2000); driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		 
		  
		  // for expiring the session driver.quit(); 
		  // when no session , session is null
		   
		  // You need to intialize your driver everytime inside your voidBefore()
		  
		
		  driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://stark.nearbuytoolsstag.in/fox/login");
		  
		  driver.findElement(By.xpath("//a[@class='btn red default']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("identifierId")).sendKeys("biz.imged1@gmail.com");
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("stark@tony"); 
		  driver.findElement(By.className("CwaK9")).click();
		  Thread.sleep(4000);
		 
		  driver.findElement(By.id("search-box")).sendKeys("dtmerchat58",Keys.ENTER);
		  driver.findElement(By.xpath("//a[text()='dtmerchat58']")).click();
		  Thread.sleep(6000);
		
		
		  WebElement ele8 = driver.findElement(By.xpath("//a[text()='Accept']"));
		  driver.executeScript("arguments[0].click();", ele8);
		  
		  Thread.sleep(2000);
		 
		  
			 
		
		  WebElement ele9 = driver.findElement(By.xpath("//a[text()='Tags']"));
		  driver.executeScript("arguments[0].click();", ele9);
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("s2id_tagCategory")).click(); Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='Food & Beverages']")).click();
		  Thread.sleep(2000); driver.findElement(By.id("s2id_type")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='Indoor']")).click();
		  Thread.sleep(2000); driver.findElement(By.id("s2id_tag")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//div[text()='Display Shelf']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("s2id_additionalTags")).click(); Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//div[text()='Bar']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("imageSource")).sendKeys("selenium");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[text()='Save']")).click();
		  Thread.sleep(2000); driver.switchTo().alert().accept(); Thread.sleep(2000);
		 
		  driver.findElement(By.xpath("//span[text()='Landscape']")).click();
		  Thread.sleep(5000);
		  
		  WebElement ele12 = driver.findElement(By.xpath("//button[@onclick='confirmLandscapeImage(this)']"));
		  driver.executeScript("arguments[0].click();", ele12);
		  Thread.sleep(6000);
		 
		
		  WebElement ele13= driver.findElement(By.xpath("//*[@id=\"landscapeImageCropper\"]/div/div/div[3]/button[1]"));
		  driver.executeScript("arguments[0].click();", ele13);
		  
		  Thread.sleep(3000);
		  driver.findElement(By.id("editorSubmit")).click();
		  Thread.sleep(5000);
		  
		  Thread.sleep(2000); driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		  
          driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://stark.nearbuytoolsstag.in/fox/login");
		  
		  driver.findElement(By.xpath("//a[@class='btn red default']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("identifierId")).sendKeys("biz.mca1@gmail.com");
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("stark@tony"); 
		  driver.findElement(By.className("CwaK9")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.linkText("Reassign Merchant")).click();
		  driver.findElement(By.id("s2id_autogen2")).sendKeys("qa");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='QA']")).click();
		  driver.findElement(By.id("merchantId")).sendKeys(mid1);
		  driver.findElement(By.xpath("//button[text()='Search']")).click();
		  Thread.sleep(3000); 
		  driver.findElement(By.id(mid1)).click();
		 
		 
			  
		
		 
		
		
		  Thread.sleep(3000);
		  driver.findElement(By.id("s2id_autogen10")).sendKeys("biz");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//span[text()='biz.mpqa1@gmail.com']")).click() ;
		  driver.findElement(By.id("reassign")).click(); 
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept(); 
		  Thread.sleep(4000);
		  WebElement ele15 = driver.findElement(By.xpath("//a[text()='Home']"));
		  driver.executeScript("arguments[0].click();", ele15);
		  
		  Thread.sleep(2000); driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		  
          driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://stark.nearbuytoolsstag.in/fox/login");
		  
		  driver.findElement(By.xpath("//a[@class='btn red default']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("identifierId")).sendKeys("biz.mpqa1@gmail.com");
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("stark@tony"); 
		  driver.findElement(By.className("CwaK9")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.id("search-box")).sendKeys(mid1,Keys.ENTER);
		  driver.findElement(By.xpath("//a[text()='dtmerchat58']")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.id("publish")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='dtmerchat58']")).click();
		  Thread.sleep(4000);
		  
		  
		  
		  
		  
		  
		  
		  
		
		 
		  

		  
		  
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		 
		 


		
		  
		  

		
		  
		
	
		  
		  
		  
		  
		  
		 
         		
         		
         
         
         
         
         
		 
		 
		 
		 
		 
		 
		 
		
				


			    
				
	}

}
