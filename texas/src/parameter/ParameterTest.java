package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@Test
	@Parameters({ "env","browser", "url", "emailId" })
	public void yahooLoginTest(String env, String browser, String url, String emailId) throws Throwable {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Manoj Adhikari\\eclipse-workspace\\libs\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
//			driver = new FirefoxDriver();
		}else if(browser.contentEquals("firefox")) {
			System.setProperty("webdriver.gico.driver",
					"C:\\Users\\Manoj Adhikari\\eclipse-workspace\\libs\\chromedriver_win32\\geckodriver.exe");
			
		}
		driver.get(url);

		driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys(emailId);
		driver.findElement(By.xpath("//*[@class=\"orko-button-primary orko-button\"]")).click();

	}
}
