import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximizeandcookies {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // It will delete all the cookies of the browser or we can say delete pre populated data like on login page.
		driver.manage().deleteCookieNamed("sessionkey");// If we want to delete any specific cookies then we need to provide the name of that cookie.
		//so in this when we delete the session key cookie then after deleting when we clicked on any of the option on the page then we should logout
		
		driver.get("https://www.google.com/");
		
		
		
		
		
		
		
		
		

	}

}
