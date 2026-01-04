package Instagram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyEasytrip {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/offers/no-convenience-fee.html?msclkid=fb1840f1ba031120700829b183435311&utm_source=bing&utm_medium=cpc&utm_campaign=Bing_PMAX_Domestic_Flights_NonBrand_ALLAudienceE_Feb&utm_term=www.easemytrip.com&utm_content=EMT_Flight");
		driver.manage().window().maximize();
driver.findElement(By.linkText("Login or Signup")).click();
driver.findElement(By.id("shwlogn")).click();//.sendKeys("abc@123");
//driver.findElement(By.id("Email ID or Mobile Number")).sendKeys("123");
driver.findElement(By.id("txtEmail")).sendKeys("khutalevinayak@gmail.com");
driver.findElement(By.id("shwotp")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

driver.findElement(By.id("otpRsnd")).click();  // resend otp

driver.findElement(By.name("btn_Login")).click();
		
		
	}

}
