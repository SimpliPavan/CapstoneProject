package userTaskPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//driver.findElement(By.id("username")).sendKeys("kn@gmail.com");
	@FindBy(id = "username")
	private WebElement username;
	
	
	//driver.findElement(By.id("password")).sendKeys("12345");
	@FindBy(id ="password")
	private WebElement password;
	
	
	//driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
	@FindBy(xpath = "//input[contains(@value,'Login')]")
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void enterUsername(String user_name) {
		username.clear();
		username.sendKeys("kn@gmail.com");
		}
	
	public void enterPassword(String user_password) {
		password.clear();
		password.sendKeys("12345");
		}
	public void clickLoginButton() {
		LoginButton.click();
	}
		
	}

