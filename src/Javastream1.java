import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Javastream1 {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//For sorting
		//Clicked on the column
		//Capture all web elements into list
		//Capture text of all the web elements into new(Original) list 
		//Sort on the original list
		//Now we have new sorted list
		//Now compare original list vs new sorted list 
		
		driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();
		List <WebElement> elementList= driver.findElements(By.cssSelector("tr td:nth-child(1)"));
		
		List <String> original = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List <String> sorted = original.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(original.equals(sorted));
		
		
		// Now we need to scan the coulmn with "Beans" text  and then show the price of "Beans"
		List<Object> price;
		
		
		do {
			
			List <WebElement> rows= driver.findElements(By.cssSelector("tr td:nth-child(1)"));
		 price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVegiee(s)).collect(Collectors.toList());
				price.forEach(s->System.out.println(s));
		
		if(price.size()<1) {
				
			driver.findElement(By.cssSelector("a[aria-label=\"Next\"]")).click();
			
		}
		}while(price.size()<1);
			
			
			
		
		
		
		
		
	
		
		
	}

	private static Object getPriceVegiee(WebElement s) {
		
		String pricevalues = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalues;
	}

}
