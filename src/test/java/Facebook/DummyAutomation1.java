package Facebook;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DummyAutomation1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testerbud.com/practice-page-selection");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.MILLISECONDS);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
	  driver.findElement(By.id("practice-sites-dropdown")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("📋 Web Form Automation")).click();
	  JavascriptExecutor j1 =(JavascriptExecutor)driver;
		j1.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		System.out.println("p");
		
		WebElement country=driver.findElement(By.xpath("//select[@fdprocessedid=\"q981er\"]"));
		Select s = new Select(country);
		s.selectByValue("India");
		Thread.sleep(2000);
		
		WebElement title=driver.findElement(By.xpath("//select[@fdprocessedid=\"y6v0v\"]"));
		Select s1 = new Select(title);
		s1.selectByValue("Mr.");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@fdprocessedid=\"emq2n9\"]")).sendKeys("Abcd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@fdprocessedid=\"8m7d7g\"]")).sendKeys("XYz");
		Thread.sleep(2000);
		
		
		
		System.out.println("pass");
		driver.close();
	}

}
