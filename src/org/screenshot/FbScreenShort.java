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

public class FbScreenShort {
	public static void main(String[] args) throws IOException 	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("mani@123");
	//	WebElement pwd = driver.findElement(By.id("pass"));
	//	pwd.sendKeys("12345");
	//	TakesScreenshot fb = (TakesScreenshot)driver;
		File screen =txt.getScreenshotAs(OutputType.FILE);
		File image = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\sceenshot\\uname.png");
		System.out.println(screen);
		FileUtils.copyFile(screen, image);
		driver.close();
		
	
	}
	

}

