package abc;

import java.nio.file.spi.FileSystemProvider;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WebFormAutomation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testerbud.com/practice-page-selection");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//span[@class=\"text-white nav-item-bordered\"]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
	
		
	     driver.findElement(By.linkText("📋 Web Form Automation")).click();
	     JavascriptExecutor j1 = (JavascriptExecutor) driver;
			j1.executeScript("window.scrollBy(0,350)");
			Thread.sleep(2000);
			
			System.out.println("pass");
			
		//	WebElement country=driver.findElement(By.xpath("//select[@fdprocessedid=\"6by5u\"]"));
		//	Select s1 = new Select(country);
		//	s1.selectByValue("India");
		//	Thread.sleep(2000);
		//	System.out.println("fail");
			
			WebElement mr=driver.findElement(By.xpath("//select[@fdprocessedid=\"44dfg\"]"));
			Select s2 = new Select(mr);
			s2.selectByValue("Dr.");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@fdprocessedid=\"i1e2dk\"]")).sendKeys("Abcabc");
			driver.findElement(By.xpath("//input[@fdprocessedid=\"8lg0zr\"]")).sendKeys("XYZ");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@fdprocessedid=\"x5iqgk\"]")).sendKeys("2020-02-03");
			

			
					
	     
		
	}

}
