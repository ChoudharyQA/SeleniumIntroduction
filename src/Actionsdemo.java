import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("[id='nav-link-accountList-nav-line-1']")); 
		a.moveToElement(move).contextClick().build().perform(); // Mouse hover
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		// In above line, we hover the mouse on search text box and type the letter and then double click on the same letter
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
