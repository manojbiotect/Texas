package oct24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\eclipse-workspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String homePageTitle = driver.getTitle();
		System.out.println("My home page title is :" + homePageTitle);
		
		if(homePageTitle.contains("facebook"))
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
		
		driver.findElement(By.linkText("Forgot account?")).click();
		
//		driver.close();

	}

}
