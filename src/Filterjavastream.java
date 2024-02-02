import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filterjavastream {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Here we want to get the vegetable which is having "Rice" as a text after providing "Rice" in the search text box
		
		driver.findElement(By.cssSelector("input[id=\"search-field\"]")).sendKeys("Rice"); // Entering "Rice" in the search field 
		
		List <WebElement> veggies =driver.findElements(By.cssSelector("tr td:nth-child(1)")); // Storing all the elements after entering "Rice" in the search text 
		
		List <WebElement> filteredVeggies = veggies.stream().filter(v->v.getText().contains("Rice")).collect(Collectors.toList()); // Now on the present results, we applied filter as "Rice"
		
		Assert.assertEquals(veggies.size(), filteredVeggies.size()); // Now we are matching the results/count/size of the elements before and after applying the filter so they should match.
		
		
		
		
		
		
		
		
		
		

	}

}
