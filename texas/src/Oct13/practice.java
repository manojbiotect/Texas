package Oct13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class practice {

	public static void main(String[] args) {

		By searchBar = By.id("twotabsearchtextbox");
		By searchButtom = By.cssSelector("input.nav-input");

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Adhikari\\eclipse-workspace\\libs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.amazon.com/");

		// print my website page title
		String pageTitle = driver.getTitle();
		System.out.println("My page title is: " + pageTitle);
       //equals means exactly same
		if (pageTitle.equals("Southwest Airlines | Book Flights & More - Wanna Get Away?")) {
			System.out.println("Test case 1 - Passed");
		} else {
			System.out.println("Test case 1 - Failed");
		}

		// search book on my amazon
		driver.findElement(searchBar).sendKeys("Books");
		driver.findElement(searchButtom).click();
		pageTitle = driver.getTitle();
		System.out.println("My search title is: " + pageTitle);
		driver.close();

		if (pageTitle.contains("Book")) {
			System.out.println("Test case 2 - Passed");
		} else {
			System.out.println("Test case 2 - Failed");
		}

	}

}
