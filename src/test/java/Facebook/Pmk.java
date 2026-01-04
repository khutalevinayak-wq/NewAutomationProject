package Facebook;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import javax.security.auth.Subject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pmk {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.pmkisan.gov.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.MILLISECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(2000);
		
	   driver.findElement(By.xpath("//span[contains(text(),'Beneficiary List')]")).click();
	   
	   WebElement state =driver.findElement(By.id("ContentPlaceHolder1_DropDownState"));
	    Select s = new Select(state);
	   s.selectByValue("27");
	   Thread.sleep(4000);
	   
	   WebElement district =driver.findElement(By.name("ctl00$ContentPlaceHolder1$DropDownDistrict"));
	   Select s1 = new Select(district);
	   s1.selectByValue("480");
	   Thread.sleep(4000);
	   
	   WebElement subdistrict = driver.findElement(By.id("ContentPlaceHolder1_DropDownSubDistrict"));
	   Select s2 = new Select(subdistrict);
	   s2.selectByValue("4283");
	   Thread.sleep(4000);
	   
	   WebElement village =driver.findElement(By.id("ContentPlaceHolder1_DropDownVillage"));
	   Select s3 = new Select(village);
	   s3.selectByValue("567103");
	   Thread.sleep(4000);
	   
	   driver.findElement(By.id("ContentPlaceHolder1_btnsubmit")).click();
	   

	   JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("window.scrollBy(0,20000)");
		Thread.sleep(2000);
	   
	   
		driver.findElement(By.linkText("6")).click();
		Thread.sleep(2000);
		
		   JavascriptExecutor j3 = (JavascriptExecutor) driver;
			j3.executeScript("window.scrollBy(0,-250)");
			Thread.sleep(2000);
	   
	   driver.close();                                   // new method
		
		
		System.out.println("pass");
		
		
	}

}
