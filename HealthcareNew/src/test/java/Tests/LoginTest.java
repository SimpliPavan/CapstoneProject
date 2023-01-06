package Tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import Pages.LoginPage;
import TestBase.Base;

public class LoginTest extends Base {

	LoginPage loginpage;

	public LoginTest() {
		super();
	}
//test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeClass
	public void createBrowserObject() throws IOException {
		initialization();
		loginpage= new LoginPage(driver);

	}
    @Test
	public void logintest() {
		loginpage.LoginIntoWebsite();
	}
}
