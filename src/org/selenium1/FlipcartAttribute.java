package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement login = driver.findElement(By.xpath("(//label[@class='_1fqY3P'])[1]"));
		String name = login.getText();
		System.out.println(name);
		WebElement password =driver.findElement(By.xpath("//span[text()='Forgot?']"));
		WebElement passwordtxt = driver.findElement(By.xpath("//input[@type='password']"));
		passwordtxt.sendKeys("123456782");
		String text = passwordtxt.getAttribute("value");
		System.out.println(text);
		String forgot = password.getText();
		System.out.println(forgot);
		driver.close();
		
	}

}
