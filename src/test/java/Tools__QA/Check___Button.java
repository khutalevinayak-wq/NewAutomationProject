package Tools__QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Check___Button {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Check Box')]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']")).click();
	//	driver.findElement(By.xpath("//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[3]//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[3]//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[3]")).click();
		Thread.sleep(2000);
		
	}

}
