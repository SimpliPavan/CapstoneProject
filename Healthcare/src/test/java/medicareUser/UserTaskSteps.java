package medicareUser;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserTaskSteps extends Driver{
	
	@Given("open the healthcare website")
	public void open_the_healthcare_website() {
		Assert.assertTrue(driver.getTitle().equals("Medicare - Home"));
	}

	@When("click on the login")
	public void click_on_the_login() {
		 landingPage.clickLogin();
	}

	@When("put E-mail and the password")
	public void put_e_mail_and_the_password() {
		loginPage.enterUsername("kn@gmail.com");
		loginPage.enterPassword("12345");
		loginPage.clickLoginButton();
	}

	@When("click on Antibiotics")
	public void click_on_antibiotics() {
		landingPage.clickAntibiotics();
		antibiotics.clickcartButton();
	}

	@When("add first item to cart")
	public void add_first_item_to_cart() {
		firstItem.enterNumber("3");
		firstItem.clickRefresh();
	}

	@When("click to continueShopping")
	public void click_to_continue_shopping() {
		firstItem.clickContinueShopping();
	}

	@When("click on Analgesics")
	public void click_on_analgesics() {
		landingPage.clickAnalgesics();
		analgesics.clickcartButton();
	}

	@When("add second item to cart")
	public void add_second_item_to_cart() {
		secondItem.enterNumber("2");
		secondItem.clickRefresh();
	}

	@When("click checkOut")
	public void click_check_out() {
		secondItem.clickCheckout();
	}

	@When("select Address")
	public void select_address() {
		address.clickAddress();
	}

	@When("Make a payment")
	public void make_a_payment() {
		payment.enterCardNumber("5321475986452178");
		payment.enterexpMonth("12");
		payment.enterexpYear("2024");
		payment.entercvCode("987");
		payment.clickPay();
	}

	@Then("close the browser")
	public void close_the_browser() {
		String expectedTitle = "Your Order is Confirmed!!";
		String actualTitle = driver.findElement(By.xpath("//div[contains(@class, 'alert alert-success')]")).getText();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
