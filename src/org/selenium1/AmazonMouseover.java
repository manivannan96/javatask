package org.selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseover {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement mouseover = driver.findElement(By.id("nav-link-amazonprime"));
		Actions ac = new Actions(driver);
		ac.moveToElement(mouseover).perform();
		//ac.click(mouseover).perform();
	//	WebElement click = driver.findElement(By.xpath("(//h1[@class='a-spacing-base a-spacing-top-medium'])[1]"));
	//	ac.click(click).perform();
		
		
		
	}

}
