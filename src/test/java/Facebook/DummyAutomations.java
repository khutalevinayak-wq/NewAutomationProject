package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyAutomations {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testerbud.com/practice-page-selection");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.MILLISECONDS);
		
		   JavascriptExecutor j1 = (JavascriptExecutor) driver;
			j1.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(2000);

		driver.findElement(By.linkText("Practice Sites")).click();
		driver.findElement(By.linkText("🔐 Login Automation")).click();
		
		 JavascriptExecutor j2 = (JavascriptExecutor) driver;
			j2.executeScript("window.scrollBy(0,1500)");
			Thread.sleep(2000);
			
			driver.findElement(By.id("formBasicEmail")).sendKeys("Abc123@gmail.com");
			Thread.sleep(2000);
			
			driver.findElement(By.id("formBasicPassword")).sendKeys("1002@abc");
			Thread.sleep(2000);
			
			driver.findElement(By.id("formBasicCheckbox")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class=\"btn-lg w-100 btn btn-primary\"]")).click();

		driver.close();
		
		System.out.println("pass");
	}

}
