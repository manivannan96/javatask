package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensAddress {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement name = driver.findElement(By.xpath("(//h6[@class='widget-title '])[1]"));
		String text = name.getText();
		System.out.println(text);
		WebElement address = driver.findElement(By.xpath("//ul[@class='address'][1]"));
		String text1 = address.getText();
		System.out.println(text1);
		WebElement contact = driver.findElement(By.xpath("(//p[@class='center-contact'])[1]"));
		String text2 = contact.getText();
		System.out.println(text2);
		WebElement mail = driver.findElement(By.xpath("(//p[@class='mail-info'])[2]"));
		String text3 = mail.getText();
		System.out.println(text3);
	}

}
