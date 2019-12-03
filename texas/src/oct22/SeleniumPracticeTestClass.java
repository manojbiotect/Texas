package oct22;

public class SeleniumPracticeTestClass {

	public static void main(String[] args) throws InterruptedException {		
		
		LogInPage login = new LogInPage();
		login.init();
		login.signInTest();
		
		
	}

}
