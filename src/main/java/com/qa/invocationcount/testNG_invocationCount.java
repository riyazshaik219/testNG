package com.qa.invocationcount;

import org.testng.annotations.Test;

public class testNG_invocationCount {
	
	@Test(invocationCount=2)
	public void sum() {
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}

}
