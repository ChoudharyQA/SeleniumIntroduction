import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relativelocator {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		WebElement nameEditBox =driver.findElement(By.cssSelector("input[name=\"name\"]"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText()); // Here we are using relative path to identify the name edit field title text
		
		
		WebElement dateOfBirth = driver.findElement(By.cssSelector("label[for=\"dateofBirth\"]"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		
		WebElement iceCreamText = driver.findElement(By.cssSelector("label[for=\"exampleCheck1\"]"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamText)).click();
		
		
		WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
		

	}

}
