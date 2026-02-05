package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcademy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement verify = driver.findElement(By.xpath("//h1[text()='Sign in']"));
		if(verify.isDisplayed()) {
			System.out.println("Sucessfully nevigated to login page");
		}
		driver.findElement(By.id("inputUsername")).sendKeys("Sarthak");
		driver.findElement(By.name("inputPassword")).sendKeys("sar12345");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.partialLinkText("Forgot ")).click();
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}
	public static String getPass(WebDriver driver) {
		WebElement pass= driver.findElement(By.className("rahulshettyacademy"));
		String password = pass.getText();
		String [] p = password.split("'");
		return password;
		
	}

}
