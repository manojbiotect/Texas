package oct17;
// Selenium practice login - tells how to select radio button and birthdate
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import net.jcip.annotations.ThreadSafe;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\eclipse-workspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		//Test Case 1 : check sign in link
		driver.findElement(By.className("login")).click();
		String pageTitle = driver.getTitle();
		System.out.println("my title of page is: " + pageTitle);
		Assert.assertEquals("Login - My Store", pageTitle);
		
		
		//Test Case 2 : check blank user name feild		
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		Thread.sleep(3000);
		String errorMessage = driver.findElement(By.xpath("//*[@id='create_account_error']/ol/li")).getText();
		System.out.println("Without email id error message: " + errorMessage);
		Assert.assertEquals("Invalid email address.", errorMessage);
		
		// create account
		driver.findElement(By.id("email_create")).sendKeys("myemailidisinvalid@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		
		Thread.sleep(3000);
		
		//Selected  Mr- result is true
		//isSelected( ) predefined method returns true if the radio 
		//button or the check box is selected else it will return false.

		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		
		
		boolean result = driver.findElement(By.xpath("//input[@id='id_gender1']")).isSelected();
		System.out.println("Result : " + result);
		Assert.assertTrue(result);
		
		// not selected Mrs - so result is false
		boolean result1 = driver.findElement(By.xpath("//input[@id='id_gender2']")).isSelected();
		System.out.println("Result-1 : " + result1);
		Assert.assertFalse(result1);
		
		
		//Test Case 3 :
		//Select DOB : 22 day, jun, 1980
		
		WebElement day = driver.findElement(By.id("days"));
		Select daySelect = new Select(day);
		daySelect.selectByValue("19");
		
		WebElement month = driver.findElement(By.id("months"));
		Select monthSelect = new Select(month);
		monthSelect.selectByValue("6");
		
		WebElement years = driver.findElement(By.id("years"));
		Select yearsSelect = new Select(years);
		yearsSelect.selectByValue("1986");
				
		Thread.sleep(2000);
		//driver.close();
		
		

	}

}
