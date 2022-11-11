package org.selenium1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Contains {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumConcept1\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toppr.com/guides/essays/kalpana-chawla-essay/#:~:text=It%20was%20the%20dream%20that,great%20patience%20and%20hard%20work.");
		
		//Thread.sleep(5000);
		WebElement textEssayPage=driver.findElement(By.xpath("//p[contains(text(),'Kalpana was the First')]"));
		
		String text =textEssayPage.getText();
		System.out.println(text);

	}
	}

