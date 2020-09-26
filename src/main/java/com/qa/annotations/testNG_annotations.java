package com.qa.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_annotations {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("launch the browser");
	}
	@BeforeTest
	public void enter_credentials() {
		System.out.println("enters the credentials");
	}
	@BeforeClass
	public void login() {
		System.out.println( "enters username and password");
	}
	@BeforeMethod
	public void click() {
		System.out.println("clicks on login button");
	}
	@Test(priority=2,groups="Test")
	public void home_page() {
		System.out.println("navigates to homepage");
	}
	@Test(priority=1,groups="Test")
	public void login_page() {
		System.out.println("user is on login page");
	}
	@Test(priority=3,groups="Test")
	public void deals_page() {
		System.out.println("navigates to deals page");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}
	@AfterClass
	public void mouse_hover_on_contacts() {
		System.out.println("mousehover action is performed");
	}
	@AfterTest
	public void click_new_contact() {
		System.out.println("performs new contact link");
	}
	@AfterSuite
	public void save() {
		System.out.println("click on save button");
	}
}
