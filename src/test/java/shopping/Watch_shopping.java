package shopping;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Watch_shopping {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mahadiscom.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Close")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("English")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Close")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
	
		driver.findElement(By.xpath("//a[@class=\"elementor-icon elementor-social-icon elementor-social-icon-icon-users elementor-repeater-item-68744f5\"]")).click();
	Thread.sleep(3000);
	
	
		
		System.out.println("pass1");
	driver.close();
	}

}
