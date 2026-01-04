package pmkisan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PM_kisan_Alleerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pmkisan.gov.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("e-KYC")).click();
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtAadhar")).sendKeys("123456789988");
	driver.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$Btnget\"]")).click();
	driver.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$Btnget\"]")).click();
	
	        	Alert a= driver.switchTo().alert();
				String alert=a.getText();
				Thread.sleep(5000);
		   System.out.println(alert);
        	a.accept();

		
		
		
	
		System.out.println("pass");
		 driver.close();
	}

}
