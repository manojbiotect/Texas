package oct15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.testng.Assert;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\eclipse-workspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String homePageTitle = driver.getTitle();
		System.out.println("My Home page title is: " + homePageTitle);
		
		if(homePageTitle.contains("Facebook"))
		{
			System.out.println("Test case 1: Home Page Title Passed");
		}
		else
		{
			System.out.println("Test case 1 Failed");
		}
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("User1");
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("User1");
		driver.findElement(By.id("email")).sendKeys("User1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.name("email")).sendKeys("User2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 By text =  By.linkText("Forgot account?");
		 driver.findElement(text).click();
		 System.out.println("my last title is: "+ text);
		 
		 String te = driver.getTitle();
		 System.out.println("page title is: "+ te);
		 
		 if ( te.equals("Forgot Password | Can't Log In | Facebook")) {
			 System.out.println(" test case is passed");
		 }
			 else {
				 System.out.println("test case is failed");
				 
			 }
			 
		 

         driver.close();

	}

}
