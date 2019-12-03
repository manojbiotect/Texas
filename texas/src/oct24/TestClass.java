package oct24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		By searchBar = By.id("twotabsearchtextbox");
		By serachButton = By.cssSelector("input.nav-input");
		By loginElement = By.cssSelector("span.nav-line-1");		

		
		
		
		//Setting system property
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\eclipse-workspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe");
		
		//Creating a driver object
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//String pageTitle;
		//System.out.println("My page title : " + driver.getTitle());
		String pageTitle = driver.getTitle();
		System.out.println("My page title : " + pageTitle);
		if(pageTitle.contains("Amazon.com"))
		{
			System.out.println("Test case 1 : Page title Test passed " );
		}
		else
		{
			System.out.println("Test case 1 : Failed " );
		}
		
		//driver.findElement(loginElement).click();

		
		driver.findElement(searchBar).click();
		driver.findElement(searchBar).sendKeys("books");
		driver.findElement(serachButton).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pageTitle = driver.getTitle();
		
		if(pageTitle.contains("Books"))
		{
			System.out.println("Test case 2 : Books search Test passed " );
		}
		else
		{
			System.out.println("Test case 2 : Failed " );
		}
		
		By bookLink = By.cssSelector("span.nav-a-content");
		
		String bookText = driver.findElement(bookLink).getText();
		//System.out.println("bookText " + bookText );
		if(bookText.contains("Books"))
		{
			System.out.println("Test case 3 : Book Text passed " );
		}
		else
		{
			System.out.println("Test case 3 : Failed " );
		}
		
		driver.quit();
		
	}

}
