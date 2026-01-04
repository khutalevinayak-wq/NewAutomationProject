package Tools__QA;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,200)");  
		Thread.sleep(2000);
		
		driver.findElement(By.id("item-4")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor j1 = (JavascriptExecutor)driver;
		  j1.executeScript("window.scrollBy(0,400)");  
		Thread.sleep(200);
		
		Actions a = new Actions(driver);
	
		a.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();     // Double Click
		Thread.sleep(3000);
		
           a.click(driver.findElement(By.id("ZMAOp"))).build().perform();         //single click
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
