package Github;

import java.util.concurrent.TimeUnit;

import javax.security.auth.Subject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class AmazonSearchProduct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.MILLISECONDS);
	
		
	
	 driver.findElement(By.linkText("Mobiles & Tablets")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.className("ybaCDx")).click();
	 Thread.sleep(2000);
	 
	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,5050)");  
		Thread.sleep(2000);
		
		
	 
	 
	 System.out.println("pass");
		
	

	
		
		
		
		
		
		
	}

}
