package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.*;


public class LandingPage extends Base{
	
	@FindBy(linkText = "Login")
	private WebElement login;
	
	//driver.findElement(By.linkText("Manage Product")).click();
	//@FindBy(linkText = "Manage Product")
	//private WebElement Manage_Product;
	
	//driver.findElement(By.id("a_Antibiotics")).click();
	/*@FindBy(id="a_Antibiotics")
	private WebElement Antibiotics;*/
	
	//driver.findElement(By.id("a_Analgesics")).click();
	/*@FindBy(id="a_Analgesics")
	private WebElement Analgesics;*/
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickLogin() {
		login.click();
	}
	
	//public void clickManageProduct() {
		//Manage_Product.click();
	//}

	/*public void clickAntibiotics() {
		Antibiotics.click();
	}
	
	public void clickAnalgesics() {
		Analgesics.click();
		
	}*/
}
