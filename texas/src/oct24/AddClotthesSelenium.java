package oct24;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddClotthesSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("http://automationpractice.com/index.php");
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]")).click();
		
		//ArrayList<WebElement> dressList = driv
//		List<WebElement> dressList = driver.findElements(By.xpath("//ul[@id='homefeatured']/li"));
//		int blouseCounter=0;
//		for(int i = 1;i<=dressList.size();i++)
//		{
//			System.out.println(dressList.get(i-1).getText());
//			if(dressList.get(i-1).getText().contains("Blouse"))
//			{
//				Actions action = new Actions(driver);
//				WebElement image = driver.findElement(By.xpath("//*[@id='homefeatured']/li["+i+"]/div/div[1]/div/a[1]/img"));
//				action.moveToElement(image).perform();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//*[@id='homefeatured']/li["+i+"]/div/div[2]/div[2]/a[1]")).click();
//				Thread.sleep(5000);	
//				//i= i+3;
//				break;
//				
//			}
//
//		}
		
	//******* USing X path ***********
		//WebElement we = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[contains(text(),'Women')]"));
		WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		we.click();
		
		
		
//		System.out.println("Size of Li : " + dressList.size());
//		
//		System.out.println("Text of 1st Li : " + dressList.get(0).getText());
		
		
//		Actions action = new Actions(driver);
//		WebElement image = driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img"));
//		action.moveToElement(image).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]")).click();
//		Thread.sleep(5000);
		
		
	}

}
