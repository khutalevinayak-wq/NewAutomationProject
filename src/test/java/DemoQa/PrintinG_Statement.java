package DemoQa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintinG_Statement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
	 driver.findElement(By.xpath("//h5[contains(text(),'Widgets')]")).click();
	Thread.sleep(2000);
	
	
	js.executeScript("window.scrollBy(0,2000)");
	driver.findElement(By.xpath("//span[contains(text(),'Select Menu')]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
	driver.findElement(By.xpath("//div[contains(text(),'Select Option')]")).sendKeys("ABc");
	
	}

}
