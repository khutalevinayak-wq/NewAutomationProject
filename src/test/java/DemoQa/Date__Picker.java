package DemoQa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Date__Picker {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//h5[contains(text(),'Widgets')]")).click();
		js.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//span[contains(text(),'Date Picker')]")).click();
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,400)");
		
		
		
		
		// Method 1
		
		
		 
		 driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(3000);
		
		// Year
		WebElement year=driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
		Select s = new Select(year);
	     s.selectByVisibleText("2020");
		
		// Month
		WebElement month=driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("February");
		
		//Days
		
	
		driver.findElement(By.xpath("//div[contains(text(),'23')]")).click();
		
		
		
		
		// Method 2
		
		
		 /*
		WebElement dateTimeInput1 = driver.findElement(By.id("datePickerMonthYearInput"));

		dateTimeInput1.clear();
		dateTimeInput1.sendKeys("January 1, 2026");
		dateTimeInput1.sendKeys(Keys.ENTER);
		
		*/
		
		// Second Operations
	
		
		
		 
		WebElement dateTimeInput1 = driver.findElement(By.id("datePickerMonthYearInput"));

		dateTimeInput1.clear();
		dateTimeInput1.sendKeys("January 1, 2026");
		dateTimeInput1.sendKeys(Keys.ENTER);
		
		
		
	}

}
