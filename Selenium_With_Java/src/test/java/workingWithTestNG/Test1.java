package workingWithTestNG;

import org.testng.annotations.Test;

public class Test1 {

	//@Test(groups= {"smoke"})
	public void testCase1(){
		System.out.println("hello");

	}
	
	@Test
	public void testCase2() {
		System.out.println("case2");
	}

}
