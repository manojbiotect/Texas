package NaveenAutomationTestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	//invocationCount helps to repitation test cases n times
	@Test (invocationCount=10)
	void sum() {
		int a =10;
		int b =23;
		int c = a+b;
		System.out.println("sum is "+ c);
	}

}
