package Tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DataProvider.DataProviderLoginPage;
import Pages.LoginPage;
import Pages.ManageProductPage;

import TestBase.Base;

public class ManageProductTest extends Base {
	LoginPage loginpage;
	ManageProductPage manageProductPage;
	
	public ManageProductTest() {
		super();
	}
	
	//test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser
	
	@BeforeClass
	public void createBrowserObject() throws IOException {
		initialization();
		loginpage=new LoginPage(driver);
		manageProductPage= new ManageProductPage(driver);
		loginpage.LoginIntoWebsite();
	}
	
    @Test(dataProvider = "getData2", priority = 1,dataProviderClass=DataProviderLoginPage.class)
	public void manageProductTest(String CatName, String Dscription, String Name,String brnd, String Dscptn, String untprce, String qntty, String imagePath, String ProductVerify,String locator)  {
    	//manageProductPage.myctegory(CatName, Dscription);
    	manageProductPage.productName(CatName, Dscription, Name, brnd, Dscptn, untprce, qntty, imagePath, ProductVerify,locator);
	}

}
