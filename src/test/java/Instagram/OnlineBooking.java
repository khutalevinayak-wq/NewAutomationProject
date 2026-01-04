package Instagram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineBooking {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/offers/no-convenience-fee.html?msclkid=fb1840f1ba031120700829b183435311&utm_source=bing&utm_medium=cpc&utm_campaign=Bing_PMAX_Domestic_Flights_NonBrand_ALLAudienceE_Feb&utm_term=www.easemytrip.com&utm_content=EMT_Flight");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class=\"meuicowidth busmenuico\"]")).click();
		
		
	//	Alert a=driver.switchTo().alert();
		
	//	a.accept();
		
	
		driver.findElement(By.id("txtSrcCity")).sendKeys("MUMBAI");
		driver.findElement(By.name("txtSrcCity")).click();
		driver.findElement(By.id("txtDesCity")).sendKeys("PUNE");
     //   driver.findElement(By.id("txtDesCity")).click();
        driver.findElement(By.xpath("//div[@class=\"date-controls-sec\"]")).click();
        //driver.findElement(By.xpath("//a[@id=\"showseat56727\"]")).click();
   //     driver.findElement(By.id("selSeatL4")).click();
        driver.findElement(By.linkText("Select Seats")).click();
        Thread.sleep(5000);
     driver.close();
     
  
        
   
        
		
	}

	

}
