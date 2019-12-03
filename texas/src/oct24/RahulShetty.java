package oct24;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShetty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\eclipse-workspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String name = "Romo";
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//********** Alert *******************
		
//		driver.findElement(By.name("enter-name")).sendKeys(name);
//		driver.findElement(By.id("alertbtn")).click();
//		
//		Alert alert  = driver.switchTo().alert();
//		
//		Thread.sleep(5000);
//		//alert.accept();
//		
//		String alertMessage = alert.getText();
//		//alert.dismiss();
//		
//		Assert.assertEquals("Hello "+name+", share this practice page and share your knowledge", alertMessage);
//		Thread.sleep(2000);
		//alert.accept();
		//alert.dismiss();
		
		////////********************* Switch Tab *******************
		//Thread.sleep(2000);
		driver.findElement(By.id("openwindow")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("Courses")).click();
		String oldHandle = driver.getWindowHandle();
		System.out.println("oldHandle : " + oldHandle);
		
		List<String> windowHandles = new ArrayList(driver.getWindowHandles());
		
//		for(String handle : windowHandles)
//		{
//			System.out.println("Handles : " + handle);
//		}
		
	
//		for(String handle : windowHandles)
//		{
//			System.out.println("Handle :  " + handle);
//			if(!handle.equals(oldHandle))
//			{
//				driver.switchTo().window(handle);
//			}
//		}
		
		driver.switchTo().window(windowHandles.get(1));
		
		//driver.switchTo().window("CDwindow-39F133C0B3DF53EA28378BE3282ED064");
		driver.findElement(By.linkText("COURSES")).click();
		Thread.sleep(2000);
		driver.switchTo().window(windowHandles.get(0));
		driver.findElement(By.linkText("Open Tab")).click();
		driver.close();
	}

}
