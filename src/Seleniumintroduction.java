import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Seleniumintroduction {

	public static  void main(String[] args) {
		
		
		
		// Chrome browser launch
		//Need to access the WebDriver
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
		
		/*Firefox lauch
		Need to access the  Gecko driver

		System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

		WebDriver driver1 = new FirefoxDriver(); 
		
		
		
		Microsoft Edge
		 Need to access the edge driver

		System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		WebDriver driver2 = new EdgeDriver(); */
		

	}

}
