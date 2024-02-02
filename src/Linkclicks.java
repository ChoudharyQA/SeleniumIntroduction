import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkclicks {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size()); //Total number of links on the page having tag name "a"
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); //Defining a mini driver to get the count of links on the footer only
		System.out.println(footerDriver.findElements(By.tagName("a")).size());//Total number of links on the footer having tag name "a"
		
		
		WebElement columnDriver = footerDriver.findElement(By.cssSelector("table tbody tr td:nth-child(1) ul")); //Defining a mini driver to get the count of links first column of the footer only
		System.out.println(columnDriver.findElements(By.tagName("a")).size());//Total number of links on the footer having tag name "a"
		int linkSize = columnDriver.findElements(By.tagName("a")).size();
		
		for(int i=1; i<linkSize;i++) { // Clicked each and every link in a column if its working or not
			
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			
			Thread.sleep(5000L);
			
		}
			
			Set <String> pagesLink = driver.getWindowHandles(); // To catch the ID's of new windows or tab
			Iterator <String> save = pagesLink.iterator(); // Use this iterator to switch to the different windows or tabs
			
			
			while(save.hasNext()) {
				
				driver.switchTo().window(save.next());
				System.out.println(driver.getTitle());
			}
			
			
			
		
		
		

	}

}
