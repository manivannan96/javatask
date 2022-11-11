package org.automationtask;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWinHandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone13promax",Keys.ENTER);

	WebElement iphoneGold = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro Max (512GB) - Gold']"));
	iphoneGold.click();
	String parentwindowID = driver.getWindowHandle();
	//System.out.println(parentwindowID);
	Set<String> allwindowID = driver.getWindowHandles();
	//System.out.println(allwindowID);
	
	
     for (String x : allwindowID) {
    	if(!parentwindowID.equals(x)) {
    		driver.switchTo().window(x);
    		WebElement addcart = driver.findElement(By.id("add-to-cart-button"));
    		addcart.click();
		
	}
		
	
		
		
	}
}
}
