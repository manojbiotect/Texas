package NaveenAutomationTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
 * TestNG annotation - prerequisite , test case and post condition annotation.
 * that you can design your test cases in a sequecing manner
 * sequence of design testNG
1 @BeforeSuite -- setup property for chrome 
2 @BeforeTest  --login to  app
3 @BeforeClass -- launch a browser

@BeforeMethod -- enter url
@Test -- google logo
@AfterMehtod -logout from app

@BeforeMethod --enter url
@Test -- Google logo test
@AfterMethod --logout from app

@BeforeMethod -- enter url
@Test search test
@AfterMethod -- logout from app

@AfterClass --Close Browser
@AfterTest -- deleteAllCookies

 */
public class TestNGBasicFirstTutorial {
	// annotation 
	//precondition annotation- starting before
	//.....................................
	@BeforeSuite //1
	public void setUP() {
		System.out.println("setup property for chrome ");
	}
	@BeforeTest //2
	public void login() {
		System.out.println("login to  app");
	}
	
	@BeforeClass //3
	public void launchBrowser() {
		System.out.println("launch a browser");
		
	}
	/*
	 * @BeforeMethod
	 * @Test -1
	 * AfterMethod
	 * 
	 * @BeforeMethod
	 * @Teset - 2
	 * @AfterMehtod
	 * 
	 * @BeforeMethod
	 * @Test - 2
	 * @AfterMehod
	 */

	@BeforeMethod //4
	 public void enterURL() {
		System.out.println("enter url");
	}
	
	

	// test cases - starting with @Test
	//...................................
	@Test //5  - ONLY ONE TEST CASES.
	public void googleTitleTest() {
		System.out.println(" Google logo test");
	}
	@Test 
	public void searchTest() {
		System.out.println("search test");
	}

	@Test
	public void googleLogo() {
		System.out.println("google logo");
	}
	// post conditions -- starting with @After
	@AfterMethod //6 
	public void logOut() {
		System.out.println("logout from app");
	}
	@AfterClass//7
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}

	@AfterSuite //9
	public void TestReport() {
		System.out.println("generate test report");
	}

}
