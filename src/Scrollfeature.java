import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrollfeature {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=5000");
		List<WebElement> value =driver.findElements(By.cssSelector("fieldset div td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<value.size();i++) {
			
			
			sum =sum +Integer.parseInt(value.get(i).getText());
		}
		
		System.out.println(sum);
		
		driver.findElement(By.cssSelector("div[class='totalAmount']")).getText(); // Getting the value of sum of all the numbers
		int total = Integer.parseInt(driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim()); // Split and trim the value to get the exact count and then convert String into integer
		
		
		Assert.assertEquals(sum, total); // To check the sum value we have extracted and actually what is the original sum of the numbers
		
		
		
		
		

	}

}
