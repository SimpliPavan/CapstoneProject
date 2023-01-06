package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import TestBase.*;

public class LoginPage extends Base {

	// driver.findElement(By.id("username")).sendKeys("kn@gmail.com");
	
	@FindBy(linkText = "Login")
	private WebElement login;
	
	@FindBy(id = "username")
	private WebElement username;

	// driver.findElement(By.id("password")).sendKeys("12345");
	@FindBy(id = "password")
	private WebElement password;

	// driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
	@FindBy(xpath = "//input[contains(@value,'Login')]")
	private WebElement LoginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void LoginIntoWebsite() {
		login.click();
		username.clear();
		username.sendKeys("vk@gmail.com");
		password.clear();
		password.sendKeys("admin");
		LoginButton.click();
	}

}
