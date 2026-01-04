package TesterBud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_Automation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testerbud.com/practice-page-selection");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Practice Sites')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("🔐 Login Automation")).click();
		Thread.sleep(2000);
		
	//	JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeAsyncScript("window.scrollBy(0,1500)");
	//	Thread.sleep(2000);
		
		driver.findElement(By.id("formBasicEmail")).sendKeys("Abcd@123gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"formBasicPassword\"]")).sendKeys("1234@abc");
		Thread.sleep(2000);
		
	
	driver.findElement(By.xpath("//input[@id=\"formBasicCheckbox\"]")).click();

		driver.close();
		
	}

}
