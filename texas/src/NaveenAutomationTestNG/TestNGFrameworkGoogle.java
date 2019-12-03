package NaveenAutomationTestNG;

/*
 * Source Please follow
 * https://www.youtube.com/watch?v=0Gew2XOuum8
 * https://www.youtube.com/watch?v=NqN3JNpZZiY
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFrameworkGoogle {
	WebDriver driver;

	@BeforeMethod // This is a pre-condition
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Adhikari\\eclipse-workspace\\libs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.com");

	}

	/*
	 * If we want Test cases on priority basis 1, 2, 3 and so on, then we have to
	 * mention (priority = ...) after writing @Test. If we want it in a group, we
	 * can mention 'groups' also
	 */

	@Test(priority = 2, groups = "Title page") // Test case
	public void googleTitleTest() {
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Google", "Title is not matched"); /*
																		 * intentionally failing by adding 123 in Google
																		 */
	}

	@Test(priority = 3, groups = "Title page")
	public void googleLogo() {
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b);
		// Assert.assertEquals(b, true); // we can either use assertequals instead of
		// AssertTrue
	}

	@Test(priority = 5, groups = "Test completed")
	public void testCheck2() {
		System.out.println("Test 5");

	}

	@Test(priority = 4, groups = "Test completed")
	public void testCheck1() {
		System.out.println("Test 4");
	}

	@Test(priority = 1, groups = "Links")
	public void googleMailTest() {
		driver.findElement(By.linkText("Gmail")).click();
	}

	@AfterMethod // Post-condition
	public void tearDown() {
		driver.quit();
	}

}
