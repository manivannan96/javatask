package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensParagraph {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement para = driver.findElement(By.xpath("(//span[@class='blue_text'])[1]"));
String text = para.getText();
System.out.println(text);
WebElement paragraph = driver.findElement(By.xpath("//p[contains(text(),'We undertake ')]"));
String text1 = paragraph.getText();
System.out.println(text1);

}

}
