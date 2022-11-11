package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	WebElement dragElement = driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[2]"));
	WebElement dropElement = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	WebElement dragElement1 = driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[5]"));
	WebElement dropElement1 = driver.findElement(By.id("bank"));
	WebElement dragElement2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement dropElement2 = driver.findElement(By.id("amt8"));
	WebElement dragElement3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	WebElement dropElement3 = driver.findElement(By.id("loan"));
	
	//Thread.sleep(3000);
	Actions actions =new Actions(driver);
	//Thread.sleep(3000);
	actions.dragAndDrop(dragElement, dropElement);
	actions.dragAndDrop(dragElement1, dropElement1).perform();
	
	actions.dragAndDrop(dragElement2, dropElement2).perform();
	actions.dragAndDrop(dragElement3, dropElement3).perform();
	//driver.close();
	
}
}
