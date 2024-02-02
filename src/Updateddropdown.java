import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		
		/*int i=1;
		while (i<5) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		} 
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		 */
		
		
		// Now will do the same process from the FOR loop (We can do the same process from While loop as well)
		
		for(int i=1;i<5;i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			
		
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	}
	


}
