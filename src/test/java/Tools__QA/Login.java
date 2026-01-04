package Tools__QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		driver.findElement(By.id("userName")).sendKeys("Jethalal Gada ");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Jethya@1234");
		Thread.sleep(4000);
		
		driver.findElement(By.id("login")).click();
		
		
		
		
		
		driver.quit();
	}

}
