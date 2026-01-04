package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Vinayak");
		driver.findElement(By.name("lastname")).sendKeys("Khutale");
		
			
	WebElement day=	driver.findElement(By.name("birthday_day"));
	WebElement month=	driver.findElement(By.name("birthday_month"));
	WebElement year=driver.findElement(By.name("birthday_year"));
		
		Select s = new Select(day);
		s.selectByVisibleText("11");
		
		Select s1 = new Select(month);
		s1.selectByVisibleText("Jun");
		
		Select s2 = new Select(year);
		s2.selectByValue("2002");
		
		
		driver.findElement(By.xpath("//input[@id=\"sex\" and @value=\"2\"]")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("vinayakkhutale0006@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Vinayakk@2002");		
		driver.findElement(By.name("websubmit")).click();
		
	//	driver.findElement(By.name("code")).sendKeys("52084");
	//	driver.findElement(By.linkText("Continue")).click();
		
		
	}

}
