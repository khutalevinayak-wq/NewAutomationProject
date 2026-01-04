package Booking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BankForm{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		driver.findElement(By.id("email")).sendKeys("Abc@123gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("1234@ss");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.id("firstName")).sendKeys("Dinga");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Dingi");
		Thread.sleep(2000);
		driver.findElement(By.id("middleName")).sendKeys("Manga");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement g=driver.findElement(By.id("sex"));
		Select s = new Select(g);
		s.selectByValue("male");
		Thread.sleep(2000);
		
		WebElement id=driver.findElement(By.id("title"));
		Select s1=new Select(id);
		s1.selectByValue("mr");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)"); 
		
		WebElement emp=driver.findElement(By.id("employmentStatus"));
		Select s2=new Select(emp);
		s2.selectByValue("Full-time");
		Thread.sleep(2000);
		
		driver.findElement(By.id("age")).sendKeys("12/23/2021");
		Thread.sleep(2000);
		
		WebElement sts=driver.findElement(By.id("maritalStatus"));
		Select s3=new Select(sts);
		s3.selectByValue("Single");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.id("numberOfDependents")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("Dinga-Dingi");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.id("agreeCheckbox")).click();
		Thread.sleep(2000);
		
	String ab=	driver.findElement(By.xpath("//label[contains(text(),' I confirm that I agree to the ')]")).getText();
		System.out.println(ab);
		
		driver.findElement(By.id("agreeCheckbox")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}
