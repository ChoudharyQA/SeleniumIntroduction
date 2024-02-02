import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.id("userEmail")).sendKeys("pratishtha@mailinator.com");
		driver.findElement(By.id("userPassword")).sendKeys("Welcome@123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		/*Forgot password 
		
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pratishtha@mailinator.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Dots@123");
		driver.findElement(By.cssSelector("input[type='password']")).clear();
		driver.findElement(By.cssSelector("form input#confirmPassword")).sendKeys("Dots@123");
		driver.findElement(By.cssSelector("form button")).click();
		driver.close(); 
		
		
		/Locators from child  to parent and siblings 
		  
		 WebDriver driver = new ChromeDriver();

// Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	


		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());


		 */
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
