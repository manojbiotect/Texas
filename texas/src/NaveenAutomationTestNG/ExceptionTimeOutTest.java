package NaveenAutomationTestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
// expecting exception	
//	@Test(timeOut=2000, expectedExceptions=NumberFormatException.class)// 2 milisecond
//	public void infiniteLoopTest() {
//		int i = 1;
//		while(i==1) {
//			System.out.println(i);
//		}
		@Test (expectedExceptions=NumberFormatException.class)
		public void test1() {
			String x = "100A";
			Integer.parseInt(x);
			
		}
		
	}


