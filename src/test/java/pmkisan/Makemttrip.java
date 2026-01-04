package pmkisan;

import javax.security.auth.Subject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemttrip {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&ef_id=:G:s");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class=\"chNavIcon appendBottom2 chSprite chTrains inactive\"]")).click();
		driver.findElement(By.linkText("Book Train Tickets")).click();
	
		driver.findElement(By.id("Check PNR Status")).click();
		
	}

}
