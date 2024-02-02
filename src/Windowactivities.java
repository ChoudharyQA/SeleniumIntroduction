import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowactivities {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.testing.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
