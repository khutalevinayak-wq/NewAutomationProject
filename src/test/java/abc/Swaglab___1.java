package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Swaglab___1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(15000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;      
		 
		js.executeScript("window.scrollBy(0,2000)");       
		
			driver.findElement(By.xpath("//button[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
			Thread.sleep(2000);

			JavascriptExecutor j1 = (JavascriptExecutor) driver;      
			 
			j1.executeScript("window.scrollBy(0,-2000)");  
			
			driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]")).click();
			
			JavascriptExecutor j2 = (JavascriptExecutor) driver;      
			 
			j2.executeScript("window.scrollBy(0,2000)");  
		
			driver.findElement(By.xpath("//button[@name=\"checkout\"]")).click();
			
			driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("AAAA");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("BBBB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("1234567");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
			Thread.sleep(2000);
			
			JavascriptExecutor j3 = (JavascriptExecutor) driver;      
			j3.executeScript("window.scrollBy(0,2000)");  
			
			driver.findElement(By.id("finish")).click();
			
			String ab=driver.findElement(By.xpath("//h2[contains((text()),'Thank you for your order!')]")).getText();
			System.out.println(ab);
			
			String bc=driver.findElement(By.xpath("//div[contains((text()),'Your order has been dispatched, and will arrive just as fast as the pony can get there!')]")).getText();
			System.out.println(bc);
		
            driver.close();
		
	}

}
