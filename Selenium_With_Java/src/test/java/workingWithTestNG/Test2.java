package workingWithTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	@Parameters({"URL"})
	@Test
	public void login(String uname) {
		System.out.println("test case1");
		System.out.println(uname);
	}
	
	@AfterTest
	public void signUp(){
		System.out.println("after test");
	}
	
	@BeforeTest
	public void createAcc() {
		System.out.println("before test");
	}
	 
	@BeforeSuite
	public void addToCart() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void add() {
		System.out.println("after suite");
	}
	
	@BeforeMethod
	public void logOut() {
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void buttonCLick() {
		System.out.println("aftereMethod");
	}
	
	@BeforeClass
	public void move() {
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public void moveTo() {
		System.out.println("afterclass");
	}
	
}
