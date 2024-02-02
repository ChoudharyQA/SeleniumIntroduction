import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)", "");
		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));  (This is the format of explicit wait, just trying to use this wait here but didn't work)
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form input[id='form-field-travel_comp_date']")));		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("form input[id='form-field-travel_comp_date']")).click();
		
		
		WebElement month = driver.findElement(By.cssSelector("div[class=\"flatpickr-month\"]"));
		
		while(!month.getText().contains("March")) { // ! means true becomes false and vice versa
			// while loop continue when condition is true but when false, it comes out of the loop
			
			WebElement nextButton= driver.findElement(By.cssSelector("div [class=\"flatpickr-month\"] [class=\"flatpickr-next-month\"]"));
			
			
			nextButton.click();
			Thread.sleep(5000);
			
			
		}
		
		
		List<WebElement> dates=driver.findElements(By.cssSelector("span[class='flatpickr-day ']")); //Catch the common attribute and then save into list
		
		int count = driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).size(); // Catch the count of the dates
		
		for(int i=0;i<count;i++) {
			
			String text = dates.get(i).getText(); // From all the dates, get the index and the text or value
			WebElement exactText = dates.get(i); // Assigning variable  to all the date indexes 
			if(text.equalsIgnoreCase("25")) {
				
				exactText.click(); // Once we got our desired date just select and clicked
				break; // Once we got our result, just come out of the loop
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
