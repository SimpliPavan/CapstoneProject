package userTaskPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Analgesics {
	
	//driver.findElement(By.xpath(//a[contains(@href, '/medicare/cart/add/3/product')]")).click();
	@FindBy(xpath="//a[contains(@href, '/medicare/cart/add/4/product')]")
	private WebElement clickcartSecond;
	

	public Analgesics(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickcartButton() {
		clickcartSecond.click();
	}

}
