package apache.maven.org.maven_proj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium_test {
	@Test 
	public static void seleniumTest() { 
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
	ChromeOptions chromeOptions = new ChromeOptions(); 
	WebDriver driver = new ChromeDriver(chromeOptions); 
	System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
	//String url = "http://localhost:9090/addressbook";
	driver.get("http://localhost:9090/addressbook");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	driver.findElement(By.className("v-button")).click(); 
	driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka"); 
	driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps"); 
	driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709"); 
	driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co"); 
	driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015"); 
	driver.findElement(By.className("v-button-primary")).click(); 
	//Thread.sleep(5000); 
	driver.quit(); }

}
