import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set <String> windows = driver.getWindowHandles(); //Store parent and child window ID's
		Iterator <String> it=windows.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
		String emailID=driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];	
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(emailID);

	}

}
