package oct17;

public class SeleniumPracticeTestClass {

	public static void main(String[] args) throws InterruptedException {		
		
		LogInPage login = new LogInPage();
		login.init();
		login.errorMessageTest();
		
	//	login.signInTest();
		
		
	}

}
