package org.doubleclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement dbclick = driver.findElement(By.xpath("//input[@name='q']"));
		dbclick.sendKeys("greens");
		Actions ac = new Actions(driver);
		ac.doubleClick(dbclick).perform();
		driver.close();
		
	}
}
