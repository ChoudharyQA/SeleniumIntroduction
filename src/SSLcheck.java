import java.util.HashMap;

import java.util.Map;



import org.openqa.selenium.Proxy;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

//import org.openqa.selenium.edge.EdgeOptions;

//import org.openqa.selenium.firefox.FirefoxOptions;



public class SSLcheck {



public static void main(String[] args) {

// TODO Auto-generated method stub

ChromeOptions options = new ChromeOptions();

Proxy proxy = new Proxy();// How to set Proxy in launched browser

proxy.setHttpProxy("ipaddress:4444");

options.setCapability("proxy", proxy);

Map<String, Object> prefs = new HashMap<String, Object>(); // How to change the default path of downloaded file in browser



prefs.put("download.default_directory", "/directory/path");



options.setExperimentalOption("prefs", prefs);

// FirefoxOptions options1 = new FirefoxOptions();

// options1.setAcceptInsecureCerts(true);

// EdgeOptions options2 = new EdgeOptions();

options.setAcceptInsecureCerts(true); // From ChromeOptions class we can bypass the insure URL like HTTP instead of HTTPS

WebDriver driver = new ChromeDriver(options);

driver.get("https://expired.badssl.com/");

System.out.println(driver.getTitle());

// All the above actions can be done thrugh ChromeOptions class

}



}