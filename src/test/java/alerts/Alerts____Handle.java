package alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alerts____Handle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/pages/basics/alerts-javascript/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		JavascriptExecutor j1 = (JavascriptExecutor) driver;  
		j1.executeScript("window.scrollBy(0,1000)");      
		
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(2000);
		
		
		Alert a =driver.switchTo().alert();
		
		a.sendKeys("abcd");
		System.out.println(a);
		a.accept();
		driver.close();
	
	
		
	}}