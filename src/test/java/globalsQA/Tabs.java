package globalsQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tabs {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;      
	js.executeScript("window.scrollBy(0,400)"); 
	
	driver.findElement(By.linkText("Tabs")).click();
	
	JavascriptExecutor j1 = (JavascriptExecutor) driver;      
	j1.executeScript("window.scrollBy(0,300)"); 
	
	driver.findElement(By.linkText("Tabs")).click();
	
		Thread.sleep(15000);
	
	
	JavascriptExecutor j2 = (JavascriptExecutor) driver;      
	j2.executeScript("window.scrollBy(0,900)"); 
	
	
	
	System.out.println("1");
	
	driver.close();
}
}
