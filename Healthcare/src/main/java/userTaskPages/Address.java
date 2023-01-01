package userTaskPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	
	//driver.findElement(By.xpath("//a[contains(@class, 'btn btn-primary')]")).click();
	@FindBy(xpath="//a[contains(@class, 'btn btn-primary')]")
	private WebElement address;
	
	public Address(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddress() {
		address.click();
	}

}
