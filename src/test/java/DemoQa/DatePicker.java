package DemoQa;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	
	driver.findElement(By.xpath("//h5[contains(text(),'Widgets')]")).click();
	
	
	js.executeScript("window.scrollBy(0,600)");
	
	driver.findElement(By.xpath("//span[contains(text(),'Date Picker')]")).click();
	
	driver.findElement(By.id("datePickerMonthYearInput")).click();
	
	Thread.sleep(5000);
	// Year
	
	WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	Select s= new Select(year);
	s.selectByVisibleText("2002");
	Thread.sleep(5000);
	
	// Month
	
	WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
	Select s1= new Select(month);
	s1.selectByVisibleText("June");
	Thread.sleep(5000);
	
	
	// Day
	
	driver.findElement(By.xpath("//div[contains(text(),'11')]")).click();
	Thread.sleep(5000);

	
	driver.close();
}
}
