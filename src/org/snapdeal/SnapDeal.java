package org.snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumFacebook\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"));
		signin.click();
		WebElement register = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		register.click();
		Thread.sleep(4000);
		WebElement mobileno =driver.findElement(By.id("userName"));
		mobileno.sendKeys("987654321");
	}
	

}
