package alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Simple {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/pages/basics/alerts-javascript/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id=\"alertexamples\"]")).click();
		
        Alert a=driver.switchTo().alert();   // handel alert
        
        
   
        
        String ab=a.getText();  // alert notification display
        System.out.println(ab);  // print alert notification
        
        a.accept();    // alert ok
  //      a.dismiss()   alert cancel 
        System.out.println("Passed");
        
        
        
		
	}

}
