package oct24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumPracticeLogIn {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\eclipse-workspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		//Thread.sleep(3000);
		
		//Test Case 1 : check sign in link
		driver.findElement(By.className("login")).click();
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Login - My Store", pageTitle);
		
		//Test Case 2 : check blank user name feild		
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		//Thread.sleep(3000);
		String errorMessage = driver.findElement(By.xpath("//*[@id='create_account_error']/ol/li")).getText();
		Assert.assertEquals("Invalid email address.", errorMessage);
		
		driver.findElement(By.id("email_create")).sendKeys("sdfdsfsdfsdf@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		Thread.sleep(3000);
		
		//Test Case 2 : 
		//click Mrs.
		//verfiy female is  selected
		//verify Mr. is not selected
		driver.findElement(By.id("id_gender2")).click();
		
		boolean result = driver.findElement(By.id("id_gender2")).isSelected();
		System.out.println("Result : " + result);
		Assert.assertTrue(result);
		
		boolean result1 = driver.findElement(By.id("id_gender1")).isSelected();
		System.out.println("Result-1 : " + result1);
		Assert.assertFalse(result1);
		
	
		
		
		//Test Case 3 :
		//Select DOB : 22 day, feb, 1988
		
		WebElement day =  driver.findElement(By.id("days"));
		Select daySelect = new Select(day);
		daySelect.selectByValue("22");
		
		WebElement month =  driver.findElement(By.id("months"));
		Select monthSelect = new Select(month);
		monthSelect.selectByValue("2");
		
		WebElement years =  driver.findElement(By.id("years"));
		Select yearsSelect = new Select(years);
		yearsSelect.selectByValue("1988");
		
		Thread.sleep(2000);
		//driver.close();

	}

}
