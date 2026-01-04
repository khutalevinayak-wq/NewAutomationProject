package TesterBud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BankForm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.finapi.io/en/developers/demobank/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Free trial')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("wpforms-14814-field_1")).sendKeys("AjayKumar");
		Thread.sleep(2000);
		
		driver.findElement(By.id("wpforms-14814-field_1-last")).sendKeys("Khan");
		Thread.sleep(2000);
		
		driver.findElement(By.id("wpforms-14814-field_15")).sendKeys("Doctor in Hospital");
		Thread.sleep(2000);
		
		driver.findElement(By.id("wpforms-14814-field_2")).sendKeys("Doctor@gmail.com");
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//span[contains(text(),'Faroe Islands +298')]")).click();
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.id("wpforms-14814-field_3")).sendKeys("9876567891");
	//	Thread.sleep(2000);
		
		driver.findElement(By.id("wpforms-14814-field_5")).sendKeys("Please note: Be sure to enter your personal business email address. Private email addresses, such as gmail, gmx or yahoo, are not allowed! Likewise, role-based general company addresses, such as info@, admin@ or webmaster@, are not possible. If you do not have a personal business email address, please send us a message to kontakt@finapi.io.");
		Thread.sleep(2000);
		
		driver.findElement(By.id("wpforms-14814-field_14")).sendKeys("https://www.finapi.io/en/free-trial/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@id='wpforms-14814-field_9']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@id='wpforms-14814-field_6']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@id='wpforms-14814-field_7']")).sendKeys("Medical Instruments");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@id='wpforms-14814-field_12']//li[@class='choice-2 depth-1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='wpforms-14814-field_12-container']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='wpforms-14814-field_13']")).sendKeys("16");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='wpforms-submit-container']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
