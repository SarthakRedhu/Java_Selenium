package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicRevision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("email")).sendKeys("Sarthak@123");
		driver.findElement(By.name("pass")).sendKeys("yoyo1223");
		WebElement button =driver.findElement(By.xpath("//span[text()='Log in']"));
		button.click();
		
		driver.findElement(By.cssSelector("input[name*='p']")); //For handling dynamic element using css selector
		Thread.sleep(3000);
		driver.quit();

	}

}
