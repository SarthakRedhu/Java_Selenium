package orangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
		@BeforeTest
		public void setUp() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
		@Test
		public void loginTest() {
			LoginPage Login = new LoginPage(driver);
			Login.sendUn("Admin");
			Login.sendPass("admin123");
			Login.submitDetails();
		}
		
		@AfterTest
		public void end() {
			driver.quit();
		}

	}


