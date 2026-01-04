package Instagram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.testautomationstudio.com/demo/actions/#");  // Open Insta.         username

			driver.manage().window().maximize();  // size max 
			
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			Actions a= new Actions(driver);
			
			//a.doubleClick(driver.findElement(By.id("action1A"))).build().perform();
			
			//a.contextClick(driver.findElement(By.id("action3"))).build().perform();
			
			a.moveToElement(driver.findElement(By.id("xpathMenu"))).build().perform();
			
			//WebElement source=driver.findElement(By.xpath("(//*[@class='connectedSortable ui-sortable'])[1]/li[1]"));
			
			//WebElement target=driver.findElement(By.xpath("(//*[@class='connectedSortable ui-sortable'])[2]/li[1]"));
			
			//a.dragAndDrop(source, target).build().perform();
			
			
			
			System.out.println("passed");
			
			
			
			
			
			
	}

}
