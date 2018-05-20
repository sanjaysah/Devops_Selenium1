package apache.maven.org.maven_proj;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SeleniumCaseStudy {
	WebDriver driver;
	@Test 
	public void seleniumTest() { 
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions(); 
		driver = new ChromeDriver(chromeOptions); 
		//String url = "http://localhost:9090/addressbook";
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sweet.sanjay@gmail.com"); 
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Sonu0383"); 
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		boolean actual = driver.getTitle().contains("Facebook");
		Assert.assertTrue(actual);
		//Thread.sleep(5000); 
		driver.quit(); 
	}
	@AfterMethod
	public void after(){
		driver.quit();
	}
}
