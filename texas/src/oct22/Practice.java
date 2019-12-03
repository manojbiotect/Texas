package oct22;
//Handling Alert and select
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\eclipse-workspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	/*	//select bottom 
	    driver.get("https://www.expedia.com/");
		WebElement preferredClass = driver.findElement(By.xpath("//*[@id='package-advanced-preferred-class-hp-package']"));
		Select select = new Select(preferredClass);
		Thread.sleep(3000);
		select.selectByVisibleText("Premium economy");
		Thread.sleep(3000);
		select.selectByValue("f");
		Thread.sleep(3000);
		select.selectByValue("b");
		Thread.sleep(3000);
		*/
		/*//Handling Alert: 
		String name = "Manoj";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		
		//printing Alert message
		String alrtMessage = alert.getText();
		System.out.println("Alert message is : " + alrtMessage);
		
		Assert.assertEquals("Hello "+ name +", share this practice page and share your knowledge", alrtMessage);
		Thread.sleep(2000);
		//alert.accept();
		alert.dismiss();
		driver.close();
		*/
		// Hover and click
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();
		Actions move = new Actions(driver);
		WebElement img = driver.findElement(By.xpath("//img[@class=\"replace-2x img-responsive\"]"));
		move.moveToElement(img).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	}
}
