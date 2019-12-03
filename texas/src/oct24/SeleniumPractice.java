package oct24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\eclipse-workspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://automationpractice.com/index.php");
		//driver.findElement(By.cssSelector("#search_query_top")).sendKeys("Women - Dress");
		driver.findElement(By.cssSelector("input[id=search_query_top]")).sendKeys("Women - Dress");
		
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.cssSelector("#search_query_top"))
		we.clear();
		driver.findElement(By.id("search_query_top")).sendKeys("Men Dress");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.search_query.form-control.ac_input")).clear();
		//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Men hats");
		driver.findElement(By.xpath("//form[@id='searchbox']/input[4]")).sendKeys("Men hats");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("us")).click();
		Thread.sleep(3000);
		driver.close();*/
		
		//*************************** Select Example *****************
		/*driver.get("https://www.expedia.com/");
		WebElement preferredClass = driver.findElement(By.id("package-advanced-preferred-class-hp-package"));		
		Select select = new Select(preferredClass);
		Thread.sleep(3000);
		select.selectByVisibleText("Premium economy");
		Thread.sleep(3000);
		select.selectByVisibleText("First class");
		Thread.sleep(3000);
		select.selectByValue("b");
		Thread.sleep(3000);*/
		

	}

}
