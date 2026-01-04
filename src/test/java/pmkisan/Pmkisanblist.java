package pmkisan;

import java.util.concurrent.TimeUnit;

import javax.security.auth.Subject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pmkisanblist {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pmkisan.gov.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.MILLISECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;      //scrole screen.
		 
		//js.executeScript("window.scrollBy(0,2000)");             // scrolle timing
		
		WebElement beneficiaryList=driver.findElement(By.xpath("//span[contains(text(),'Beneficiary List')]"));
		
		WebElement StateTransferRequest=driver.findElement(By.xpath("//span[contains(text(),'State Transfer Request')]"));

		
		js.executeScript("arguments[0].scrollIntoView();", beneficiaryList);     // scrole stop 
		
		Thread.sleep(5000);
	
		beneficiaryList.click();
		
		WebElement state=	driver.findElement(By.name("ctl00$ContentPlaceHolder1$DropDownState"));
	    Select s = new Select(state);
		s.selectByVisibleText("MAHARASHTRA");
		Thread.sleep(2000);

		
		WebElement district = driver.findElement(By.id("ContentPlaceHolder1_DropDownDistrict"));
		Select s1 = new Select(district);
		s1.selectByVisibleText("Kolhapur");
		Thread.sleep(2000);

		
		WebElement subdistrict = driver.findElement(By.id("ContentPlaceHolder1_DropDownSubDistrict"));
		Select s2 = new Select(subdistrict);
		s2.selectByVisibleText("Shahuwadi");
		Thread.sleep(2000);

		WebElement village = driver.findElement(By.name("ctl00$ContentPlaceHolder1$DropDownVillage"));
		Select s3 = new Select(village);
		s3.selectByValue("567103");
		Thread.sleep(2000);

		driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnsubmit")).click();
		Thread.sleep(3000);
		
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,20000)");  
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("6")).click();  //scrole page no =6
		Thread.sleep(2000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-550)");

		Thread.sleep(2000);
		
	
		
		
		System.out.println("pass");
	
	
		
	
		
		
		
		
		
				//td[@colspan="3"]           last line x path
		
		
		
		
	
	
		
		
		
	}

}
