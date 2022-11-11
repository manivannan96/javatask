package org.automationtask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement auto = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	auto.click();
	WebElement popup = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	popup.click();
	Alert al = driver.switchTo().alert();
	al.accept();
	WebElement auto2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	auto2.click();
	WebElement popup2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	popup2.click();
	al.accept();
	WebElement auto3 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	auto3.click();
	WebElement popup3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	popup3.click();
	al.accept();
	
}
}
