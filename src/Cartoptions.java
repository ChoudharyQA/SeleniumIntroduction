import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Cartoptions {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// Implicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));// Explicit wait
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		
		String [] itemsneeded = {"Brocolli","Cucumber","Cauliflower","Tomato"}; // Product names saved into an array
		
		
		addItems(driver,itemsneeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))); // Explicit wait
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshetty");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));// Explicit wait
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
			
		
		
		
		
		
		
		
		
		
	}		
	
	//Create an method for customizing the code
	public static void addItems(WebDriver driver,String [] itemsneeded) {
		int j=0;
List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name")); // Converted list of products into list
		
		for(int i=0;i<products.size();i++) {
			
			String[] name= products.get(i).getText().split("-"); // Get the text and spit to get the exact product name
			String formattedName =name[0].trim(); // To avoid the space after split to get the exact product name
			
			List<String> itemsneededList= Arrays.asList(itemsneeded); // Converted array into array list
				
				
				if(itemsneededList.contains(formattedName)) {
					
					j++; // To get the count, how many time, we entered into the loop
					
					driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click(); // Get the text and the index to click
					
					if(j==itemsneeded.length) { // Once we entered 3 time into the loop will come out to avoid the extra iteration or cycle of the products as we have only 3 products to check then why we should we came into the loop more than 3 time
						
						break;
}
	
}
}
	

}
}
