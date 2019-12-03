
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utility.TestUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEbadayTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Adhikari\\eclipse-workspace\\libs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com/reg/PartialReg?rv4=1");

	}
	
	@DataProvider
	public Iterator<Object[]>getTestData() {
		ArrayList<Object[]>testData = TestUtil.getDataFromExcel();
		return testData.iterator();
		
		
	}
	
	@Test(dataProvider="getTestData", priority =1)
	public void halfEbayRegPageTest(String firstName, String lastName, String email, String password) {
		//enter data
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(password);	
		driver.findElement(By.xpath("//*[@class='btn btn--primary']")).click();


		
		
	}
	

	@AfterMethod // Post-condition
	public void tearDown() {
		driver.quit();
	
	
	}

}
