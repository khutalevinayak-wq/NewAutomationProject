package DemoQa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New__Date__Time__Set {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");         // open site
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h5[contains(text(),'Widgets')]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");

		driver.findElement(By.xpath("//span[contains(text(),'Date Picker')]")).click();
		Thread.sleep(2000);
		
	                           // First Operation  
		//select Date
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
		Select s = new Select(year);
		s.selectByVisibleText("1947");
		Thread.sleep(1900);
		
		WebElement Month=driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
		Select s1 = new Select(Month);
		s1.selectByVisibleText("August");
		Thread.sleep(1900);
		
		WebElement Day=driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
		Select s2 = new Select(Day);
		s2.selectByVisibleText("August");
		Thread.sleep(1900);
		
		driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
		Thread.sleep(2000);
		
		                                   // Second Operations 
		
	//	driver.findElement(By.id("dateAndTimePickerInput")).click();
		//WebElement datetime=driver.findElement(By.id("dateAndTimePickerInput"));
//		datetime.clear();
	//	datetime.sendKeys("January 26 ,1950 ");
	//	datetime.sendKeys(Keys.ENTER);
		
	
		WebElement datetime = driver.findElement(By.id("dateAndTimePickerInput"));
		datetime.clear();
		datetime.sendKeys("January 26  1950 07:00 PM");
		datetime.sendKeys(Keys.ENTER);   // better than ENTER

		
		
		
		
		
	}

}
