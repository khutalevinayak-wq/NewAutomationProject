package Tools__QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New___Users {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.id("newUser")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Jethalal ");
		Thread.sleep(3000);
		driver.findElement(By.id("lastname")).sendKeys("Gadha");
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys("*************");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("password");
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("register")).click();
		Thread.sleep(3000);
		
	}

}
