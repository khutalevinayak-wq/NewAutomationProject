package Booking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dummy_UI__Booking {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testerbud.com/practice-different-ui-elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.id("textField")).sendKeys("New - Home ");
		Thread.sleep(2000);
		
		driver.findElement(By.id("textArea")).sendKeys("1000 Sq .Ft (100+100 *5)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='mt-5 explore-ui-container container']/div[@class='content-wrapper']/div[4]")).click();
		
	}

}
