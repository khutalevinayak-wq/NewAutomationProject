package pmkisan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pmkisan.gov.in/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("New Farmer Registration")).click();
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtsrch")).sendKeys("123456788765");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtMobileNo")).sendKeys("9889002112");
	
		WebElement state=driver.findElement(By.name("ctl00$ContentPlaceHolder1$DropDownState"));
		
		Select s = new Select(state);
		s.selectByValue("27");
        // s.selectByVisibleText("MAHARASHTRA");
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnSendOTP")).click();
		driver.close();
		System.out.println("passed");

	
	}

}
