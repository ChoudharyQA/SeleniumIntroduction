import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());//Here we are using assertions to check the conditions
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); //To make sure that check box is not selected in the initial stage
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click(); //Select the check boxes
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); //To find out if the check box is selected or not 
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());//Here we are using assertions to check the conditions
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // To find out the number of check boxes on the page 
		
		
		
		
		
		
		
		
		

	}

}
