package oct22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\eclipse-workspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String name = "Romo";
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.name("enter-name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert  = driver.switchTo().alert();
		
		Thread.sleep(5000);
		//alert.accept();
		
		String alertMessage = alert.getText();
		//alert.dismiss();
		
		Assert.assertEquals("Hello "+name+", share this practice page and share your knowledge", alertMessage);
		Thread.sleep(2000);
		//alert.accept();
		alert.dismiss();
		driver.close();
	}

}
