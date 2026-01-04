package alerts;

import java.util.concurrent.TimeUnit;

import javax.security.auth.Subject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.Timeout;

public class GetActiions {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.testautomationstudio.com/demo/get/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.MILLISECONDS);
		
		driver.findElement(By.name("fname")).sendKeys("000000");
		driver.findElement(By.name("lname")).sendKeys("2345");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;      //scrole screen.
		 
		js.executeScript("window.scrollBy(0,500)");
		
		
		
		 WebElement m=driver.findElement(By.id("PgCountry"));
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("one")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("newsLetter")).click();
		
	//	Subject m = new Subject();
	//	m.selectByVisibleText("Kolhapur");
	
		
		
		
		
		
		
		System.out.println("pass");
	}

}
