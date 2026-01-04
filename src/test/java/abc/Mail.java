package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/?hl=en#inbox");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("identifier")).sendKeys("vinayakkhutale0006@gmail.com");
	
	driver.findElement(By.xpath("//div[@jsname=\"Njthtb\"]")).click();
}
}
