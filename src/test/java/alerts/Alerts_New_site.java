package alerts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alerts_New_site {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.MILLISECONDS);
		
		
		driver.findElement(By.linkText("Home")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("ajayb@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("enterimg")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Abhay");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Patil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Asia,India,Maharashtra,Mumbai,Pune,Benglore,Madras,Bombay");
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("MadrasIndia@1230001008.gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern\"]")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("msdd")).click();
	//	driver.findElement(By.linkText("English")).click();
		driver.findElement(By.linkText("Bulgarian")).click();
	//	driver.findElement(By.linkText("English")).click();
		
	//	Thread.sleep(2000);
		
		WebElement skill = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select s = new Select(skill);
		s.selectByValue("Android");
		Thread.sleep(2000);
		
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		
		
		
		
		
		driver.findElement(By.xpath("//select[@id=\"countries\"]")).click();
		driver.findElement(By.xpath("//select[@id=\"countries\"]")).click();
		

		
	//	WebElement country = driver.findElement(By.xpath("//span[@class=\"select2-selection__arrow\"]"));
//		Select s1 = new Select(country);
	//	s1.selectByValue("India");
//		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		Select s2 = new Select(year);
		s2.selectByValue("1925");
		Thread.sleep(2000);
		

		WebElement months = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		Select s3 = new Select(months);
		s3.selectByValue("February");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select s4 = new Select(day);
		s4.selectByValue("29");
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstpassword")).sendKeys("123***");
		Thread.sleep(2000);
		driver.findElement(By.id("secondpassword")).sendKeys("qwerfcvbnuy");
		Thread.sleep(3000);
		driver.findElement(By.id("submitbtn")).click();
		
		System.out.println("pass1");
		
		driver.close();
		}

}
