package shopping;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Samsung mobile");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Galaxy S25 FE Cell Phone (2025), 256GB AI Smartphone, Unlocked Android, Large Display, 4900mAh Battery, High Res-Camera, AI Photo Edits, Durable, US 1 Yr Warranty, JetBlack')]")).click();
		
		
		driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]")).click();
		
		driver.findElement(By.id("ap_email_login")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ap_password")).sendKeys("abc@1234567");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		driver.close();
		
		
	}

}
