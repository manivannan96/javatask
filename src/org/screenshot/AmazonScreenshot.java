package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonScreenshot {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		sign.click();
	TakesScreenshot ts = (TakesScreenshot)driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File screen = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\sceenshot\\amazon.png");
		System.out.println(screen);
		FileUtils.copyFile(image, screen);
		driver.close();
	}
}
 