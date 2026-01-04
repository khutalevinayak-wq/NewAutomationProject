package Github;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.MILLISECONDS);
		
	driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Samsung Tv");
	driver.findElement(By.xpath("//button[@class=\"kV1UjG\"]")).click();
	Thread.sleep(2000);

		Thread.sleep(2000);
		
		
		
		
		
		
		System.out.println("1");
		
		
		
		
	//	Actions a = new Actions(driver);
	//	a.doubleClick(driver.findElement(By.id("1766144149030-uiGrid-0005-header-text"))).build().perform();
	//	
		System.out.println("pass");
		
		
		
		
		
		
		
		
		System.out.println("pass");
		
	
	
	
	
	
	}

}
