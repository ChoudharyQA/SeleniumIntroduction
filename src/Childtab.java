import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childtab {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB); // Open a new blank tab in the same window
		// We can also use this to open a new window
		//driver.switchTo().newWindow(WindowType.WINDOW);
		Set <String> handles = driver.getWindowHandles(); // Save the multiple tab's ID
		Iterator <String> it =handles.iterator(); // Save the window tab ID's
		String parentID = it.next(); // Jump to parent ID
		String childID = it.next(); // Jump to child ID
		driver.switchTo().window(childID); // Switch to child tab
		driver.get("https://rahulshettyacademy.com/"); // On child tab, we run this URL
		String courseName= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText(); // Get the 1st course on the child tab
		driver.switchTo().window(parentID);// Switch back to parent tab
		WebElement nameField = driver.findElement(By.cssSelector("input[name=\"name\"]:nth-child(2)"));
		nameField.sendKeys(courseName); // In the name field, we provide the course name collected from the child tab
		
		// Now if we want to take screenshot of a web element not of the complete page
		
		File file = nameField.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(file, new File("logo.png"));
		
		
		// Now if we want to know the height and width of the "name" field 
		System.out.println(nameField.getRect().getDimension().getHeight()); // To know the height of "Name" field
		System.out.println(nameField.getRect().getDimension().getWidth());  // To know the width of "Name" field
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
