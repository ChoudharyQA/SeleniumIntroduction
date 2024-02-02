import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			
			
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
			
		}
		
		else {
			
			System.out.println("Its Disabled");
			Assert.assertTrue(false);
		}
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='ATQ']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTNR a[value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
	
		
	}

}
