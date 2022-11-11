package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement btclick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		js.executeScript("arguments[0].click()", btclick);
//click.click();
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		js.executeScript("arguments[0].setAttribute('value','iphone14')", search);
		WebElement searchbar = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", searchbar);

		// driver.quit();
	}

}
