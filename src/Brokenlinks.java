import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();// Implementing soft assertion class
		for ( WebElement link : links) {
			
			// Below is the complete process to extract the URL from the link option so that we don't need to clicked on the link to get the URL present inside the link
			String url = link.getAttribute("href");
			HttpURLConnection conn =(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			System.out.println(resCode);
			a.assertTrue(resCode<400,"The link with text"+ link.getText() + "is broken with statuscode"+ resCode);
			
//			if(resCode>400) {   (We can use this if condition as well instead of soft assertion
//				
//				Thread.sleep(5000);
//				System.out.println("The link with text"+ link.getText() + "is broken with statuscode"+ resCode);
//				Assert.assertTrue(false);
//				
//			}
				}
		
			a.assertAll();
		

	}

}
