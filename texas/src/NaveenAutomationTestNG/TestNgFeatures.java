package NaveenAutomationTestNG;

import org.testng.annotations.Test;

public class TestNgFeatures {
	//if login fail,define (dependsOnMethods="loginTest")
	@Test (priority = 1, groups = "login")
	public void loginTest() {
		System.out.println("login test");
		//int i = 9/0;
	}
	@Test (dependsOnMethods="loginTest") // if login fail and helps to pass loign
	public void HomePageTest() {
		System.out.println("Home Page");
	}
	@Test (dependsOnMethods="loginTest")
	public void SearchPageTest() {
		System.out.println("Search test");
	}
	
	@Test (dependsOnMethods="loginTest")
	public void RegPageTest() {
		System.out.println("Reg test");
	}

}
