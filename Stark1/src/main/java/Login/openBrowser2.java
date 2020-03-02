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

public class openBrowser2 {

	static ChromeDriver driver;
	//static String mid;

	public openBrowser2() {

		System.setProperty("webdriver.chrome.driver", "/Users/Satish/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://stark.nearbuytoolsstag.in/fox/login");

	}
	
	public static void login(String url, String uid, String pwd) throws InterruptedException {
		
		driver.get(url);
		driver.findElement(By.xpath("//a[@class='btn red default']")).click();
		driver.findElement(By.id("identifierId")).sendKeys(uid);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys(pwd);
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(5000);
	}
	
	public static void addNewMerchant(String name,String addLine1, Double lat, Double lng,String pContact, String rContact ) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Add New Merchant ']")).click();
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("addressLine1")).sendKeys(addLine1);
		driver.findElement(By.id("latLong")).sendKeys(lat.toString()+","+ lng.toString());
		driver.findElement(By.id("redemptionLocationFetchBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pContactNo0")).sendKeys(pContact);
		driver.findElement(By.id("rContactNo0")).sendKeys(rContact);
		WebElement ele = driver.findElement(By.id("timing1.isOpen1"));
		driver.executeScript("arguments[0].click();", ele);
		WebElement ele1 = driver.findElement(By.id("timing1.isOpenAllDay1"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", ele1);
		WebElement ele2 = driver.findElement(By.xpath("//button[@onclick='setTiming()']"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click();", ele2);
		WebElement cat = driver.findElement(By.id("category"));
		Select s1 = new Select(cat);
		s1.selectByVisibleText("Food & Beverages");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Kiosk']")).click();
		driver.findElement(By.xpath("//label[text()='Afghani']")).click();
		driver.findElement(By.xpath("//label[text()='Pure Veg']")).click();
		driver.findElement(By.xpath("//label[text()='Breakfast Buffet']")).click();
		driver.findElement(By.xpath("//label[text()='Free Wi-fi']")).click();
		driver.findElement(By.xpath("//label[text()='No Seating']")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "//label[@for='catInfo.fields[SVL-ALC].values-SVL']")).click();
		 * driver.findElement(By.xpath(
		 * "//label[@for='catInfo.fields[HAV-DLY].values-HAV']")).click();
		 * driver.findElement(By.xpath(
		 * "//label[@for='catInfo.fields[TAV-TKY].values-TAV']")).click();
		 */
		driver.findElement(By.xpath("//label[text()='No Bar']")).click();
		//driver.findElement(By.xpath("//label[text()='Cash']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'cat-MER\']//div/div[1]/span/input")).sendKeys("/Users/Satish/Downloads/pestt (1).jpg");
        Thread.sleep(3000);
        driver.findElement(By.id("draftBtn")).click();
        Thread.sleep(3000);
        searchMerchant(name);
		Thread.sleep(4000);
		WebElement ele7 = driver.findElement(By.xpath("//button[text()='Submit Mca']"));
		driver.executeScript("arguments[0].click();", ele7);
		Thread.sleep(5000);

		
	}
	
	   public static String getMerchantId(String name) throws InterruptedException {
		   driver.findElement(By.id("search-box")).sendKeys(name, Keys.ENTER);
		   Thread.sleep(2000);
		   String mid = driver.findElement(By.xpath("//*[@id='unPublish']/table/tbody/tr/td[3]")).getText();
		   System.out.println("mid is:"+ mid);
		   return mid;
		   
	   }
	   
	   public static void reassign(String merchantId, String text, String uid,String elementId) throws InterruptedException {
		    driver.findElement(By.linkText("Home")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Reassign Merchant")).click();
			driver.findElement(By.id("s2id_autogen2")).sendKeys(text);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='ROLE_']")).click();
			driver.findElement(By.id("merchantId")).sendKeys(merchantId);
			driver.findElement(By.xpath("//button[text()='Search']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id(merchantId)).click();
			Thread.sleep(2000);
			// because id value is different for IE and QA role
			driver.findElement(By.id(elementId)).sendKeys("biz");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//span[text()='biz.imged1@gmail.com']")).click();
			driver.findElement(By.xpath("//span[text()='"+uid+"']")).click();
			driver.findElement(By.id("reassign")).click();
			Thread.sleep(1000);
			// Alert simpleAlert = driver.switchTo().alert();
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		   
	   }
	   
	   public static void logOut() throws InterruptedException {
		   
		   WebElement ele11 = driver.findElement(By.xpath("//a[text()='Home']"));
			driver.executeScript("arguments[0].click();", ele11);
			Thread.sleep(2000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			// for expiring the session driver.quit(); or when no session id error
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		   
	   }
	    
	   public static void searchMerchant(String name) throws InterruptedException {
		   driver.findElement(By.id("search-box")).sendKeys(name, Keys.ENTER);              
			driver.findElement(By.xpath("//a[text()='"+name+"']")).click();
			Thread.sleep(6000);
  
	   }
	   
	   public static void imageEditor() throws InterruptedException
	   {
		   WebElement ele8 = driver.findElement(By.xpath("//a[text()='Accept']"));
			driver.executeScript("arguments[0].click();", ele8);
			Thread.sleep(2000);
			WebElement ele9 = driver.findElement(By.xpath("//a[text()='Tags']"));
			driver.executeScript("arguments[0].click();", ele9);
			Thread.sleep(2000);
			driver.findElement(By.id("s2id_tagCategory")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Food & Beverages']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("s2id_type")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Indoor']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("s2id_tag")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Display Shelf']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("s2id_additionalTags")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Bar']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("imageSource")).sendKeys("selenium");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Landscape']")).click();
			Thread.sleep(5000);
			WebElement ele12 = driver.findElement(By.xpath("//button[@onclick='confirmLandscapeImage(this)']"));
			driver.executeScript("arguments[0].click();", ele12);
			Thread.sleep(6000);
			WebElement ele13 = driver.findElement(By.xpath("//*[@id=\"landscapeImageCropper\"]/div/div/div[3]/button[1]"));
			driver.executeScript("arguments[0].click();", ele13);
			Thread.sleep(3000);
			driver.findElement(By.id("editorSubmit")).click();
			Thread.sleep(5000);

	   }
	   
	     public static void submitMerchant(String name) throws InterruptedException {
	    	 searchMerchant(name);
	    	 Thread.sleep(4000);
	 		driver.findElement(By.id("publish")).click();
	 		Thread.sleep(4000);
	     }
	     
	/*
	 * public static void associateBID(String bid) {
	 * driver.findElement(By.xpath("//a[text()='Business Account']")).click();
	 * driver.findElement(By.xpath("//a[text()='Manage Business Account']")).click()
	 * ; driver.findElement(By.id("search-box")).sendKeys(bid, Keys.ENTER); String
	 * Bname =
	 * driver.findElement(By.xpath("//*[@id='tbody']/tr/td[2]/a")).getText(); }
	 */

	public static void main(String[] args) throws InterruptedException {
		String name = "testscript3";
		openBrowser2 open = new openBrowser2();
		login("http://stark.nearbuytoolsstag.in/fox/login","biz.mca1@gmail.com", "stark@tony");
		addNewMerchant(name,"gurgaon", 28.43691, 77.11262,"8285240657", "8285240657");
		String merchantId= getMerchantId(name);
		reassign(merchantId,"image","biz.imged1@gmail.com","s2id_autogen13");
		logOut();
		login("http://stark.nearbuytoolsstag.in/fox/login","biz.imged1@gmail.com", "stark@tony");
		searchMerchant(name);
		imageEditor();
		logOut();
		login("http://stark.nearbuytoolsstag.in/fox/login","biz.mca1@gmail.com", "stark@tony");
		reassign(merchantId,"qa","biz.mpqa1@gmail.com","s2id_autogen10");
		logOut();
		login("http://stark.nearbuytoolsstag.in/fox/login","biz.mpqa1@gmail.com", "stark@tony");
		submitMerchant(name);
		
		System.out.println("Congrats! Merchant"+ name + "created succcessfully");
		
		
		
		
		
		/*
		 * logOut();
		 * login("http://stark.nearbuytoolsstag.in/fox/login","biz.mca3@gmail.com",
		 * "stark@tony"); associateBID("1028489");
		 */


	}

}
