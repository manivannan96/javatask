package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensPara2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement trainer = driver.findElement(By.id("home-tab"));
		trainer.click();
		WebElement para = driver.findElement(By.xpath("//b[contains(text(),'Velmurugan')]"));
		String text = para.getText();
		System.out.println(text);
	}

}
