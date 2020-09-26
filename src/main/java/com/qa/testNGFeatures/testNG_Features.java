package com.qa.testNGFeatures;

import org.testng.annotations.Test;

public class testNG_Features {
 
	@Test(expectedExceptions=ArithmeticException.class)
	public void login_page() {
		System.out.println("loginpage test");
		int i=1/0;
	}
	@Test(dependsOnMethods="login_page")
	public void home_page() {
		System.out.println("homepage test");
	}
	
}
