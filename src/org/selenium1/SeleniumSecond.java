package org.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSecond {
	public static void main(String[]args)
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/intl/en-GB/gmail/about/");
}
	

}
