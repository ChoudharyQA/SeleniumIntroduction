import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {

		String email = "pratishtha@mailinator.com";

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// String password = getPassword(driver); (Here we have used our below created dynamic password method and for that we need to pass the same driver I have used in the method and then need to store  in a variable to use)
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("userPassword")).sendKeys("Welcome@123");// Here instead if real password, we will use "password" text which we have declare above 2 steps - (driver.findElement(By.id("userPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("section p b:nth-child(1)")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("section p b:nth-child(1)")).getText(), "Search");
		driver.findElement(By.cssSelector("Button i[class='fa fa-sign-out']")).click();
		System.out.println(driver.findElement(By.cssSelector("p.login-wrapper-footer-text")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("p.login-wrapper-footer-text")).getText(),"Don't have an account? Register here");

	}

	/*
	 * Creating an method to use password dynamically coming on the successful
	 * message while resetting the password through forgot password functionality
	 * 
	 * 
	 * 
	 * 
	 * public static String getPassword(WebDriver driver) throws                       (Here we used static because we will use this method in the same class)
	 * InterruptedException
	 * 
	 * 
	 * 
	 * {
	 * 
	 * driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 * 
	 * driver.findElement(By.linkText("Forgot your password?")).click();
	 * 
	 * Thread.sleep(1000);
	 * 
	 * driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	 * 
	 * String passwordText =driver.findElement(By.cssSelector("form p")).getText(); (Save successful message text in a String variable)
	 * 
	 * //Please use temporary password 'rahulshettyacademy' to Login.
	 * 
	 * String[] passwordArray = passwordText.split("'"); (Now split that successful message text which we saved in String variable and then save that in a array)
	 * 
	 * // String[] passwordArray2 = passwordArray[1].split("'");
	 * 
	 * // passwordArray2[0]
	 * 
	 * String password = passwordArray[1].split("'")[0]; (Now after solitting the, the password is coming in 1st array index so we choose the same 1st index then split that again and then saved in another new String variable)
	 * 
	 * return password; (Here we have returned  our password after all the operations)
	 * 
	 * //0th index - Please use temporary password
	 * 
	 * //1st index - rahulshettyacademy' to Login.
	 * 
	 * 
	 * 
	 * //0th index - rahulshettyacademy
	 * 
	 * //1st index - to Login. }
	 * 
	 */

}
