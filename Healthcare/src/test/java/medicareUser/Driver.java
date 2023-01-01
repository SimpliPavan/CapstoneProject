package medicareUser;

import org.openqa.selenium.chrome.ChromeDriver;

import userTaskPages.Address;
import userTaskPages.Analgesics;
import userTaskPages.Antibiotics;
import userTaskPages.FirstItem;
import userTaskPages.LandingPage;
import userTaskPages.LoginPage;
import userTaskPages.Payment;
import userTaskPages.SecondItem;

public class Driver extends Tools {
	
	protected static LandingPage landingPage;
	protected static LoginPage loginPage;
	protected static Antibiotics antibiotics;
	protected static FirstItem firstItem;
	protected static Analgesics analgesics;
	protected static SecondItem secondItem;
	protected static Address address;
	protected static Payment payment;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver =new ChromeDriver();
		landingPage = new LandingPage(driver);
		loginPage = new LoginPage(driver);
		antibiotics = new Antibiotics(driver);
		firstItem = new FirstItem(driver);
		analgesics = new Analgesics(driver);
		secondItem = new SecondItem(driver);
		address = new Address(driver);
		payment = new Payment(driver);
		
	}

}
