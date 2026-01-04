package shopping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_a1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pen");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		driver.findElement(By.xpath("//span[contains(text(),'rOtring 600 Ballpoint Pen Medium Point Black Ink Black Barrel Refillable')]")).click();
		Thread.sleep(3000);
		
		
		
	}

}
