package TesterBud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_Form {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testerbud.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'Practice Sites')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("📋 Web Form Automation")).click();
		

	WebElement ab=driver.findElement(By.xpath("//div[@id='root']"));
	Select s = new Select(ab);
	s.selectByValue("India");
	Thread.sleep(2000);
	
	WebElement a=driver.findElement(By.xpath("//div[@id='root']"));
	Select s1 = new Select(a);
	s1.selectByValue("Mr.");
	Thread.sleep(2000);
	
	
	
		
		
	}

}
