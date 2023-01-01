package userTaskPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstItem {
	
	//driver.findElement(By.xpath("//input[contains(@type, 'number')]")).clear();
	//driver.findElement(By.xpath("//input[contains(@type, 'number')]")).sendKeys("3");
	
	@FindBy(xpath="//input[contains(@type, 'number')]")
	private WebElement number;
	
	//driver.findElement(By.name("refreshCart")).click();
	@FindBy(name="refreshCart")
	private WebElement RefreshCart;
	
	//driver.findElement(By.xpath("//a[contains(@class, 'btn btn-warning')]")).click();
	@FindBy(xpath="//a[contains(@class, 'btn btn-warning')]")
	private WebElement continueShopping;
	
	public FirstItem(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterNumber(String user_name) {
		number.clear();
		number.sendKeys("3");
	}
	
	public void clickRefresh() {
		RefreshCart.click();
	}
	
	public void clickContinueShopping() {
		continueShopping.click();
	}

}
