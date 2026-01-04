package Booking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flight {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testerbud.com/flight-booking-scenarios");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		
		WebElement from1=driver.findElement(By.xpath("//select[@id=\"from\"]"));
		Select s =new Select(from1);
		s.selectByValue("Delhi");
		Thread.sleep(2000);
		
		WebElement from2=driver.findElement(By.xpath("//select[@id=\"to\"]"));
		Select s1=new Select(from2);
		s1.selectByValue("Mumbai");
		Thread.sleep(2000);
		
		driver.findElement(By.id("departureDate")).sendKeys("11-06-2026");
		Thread.sleep(2000);
		
		driver.findElement(By.id("returnDate")).sendKeys("19-06-2026");
		Thread.sleep(2000);
		
		driver.findElement(By.id("passengers")).sendKeys("10");
		Thread.sleep(2000);
		
		driver.findElement(By.id("travelClass"));
		
		WebElement from3=driver.findElement(By.id("travelClass"));
		Select s2=new Select(from3);
		s2.selectByValue("First");
		Thread.sleep(2000);
		
		driver.findElement(By.id("oneWay")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Search Flights')]")).click();
		
		js.executeScript("window.scrollBy(0,900)");
		
		driver.close();
		

	}

}
