package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Instagram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("email")).sendKeys("1359926489");
		driver.findElement(By.name("pass")).sendKeys("SARTK7");
		WebElement button =driver.findElement(By.xpath("//span[text()='Log in']"));
		button.click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement status = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'The')]")));
		Assert.assertEquals(status.getText(), "welcome");
		driver.quit();

	}

}
