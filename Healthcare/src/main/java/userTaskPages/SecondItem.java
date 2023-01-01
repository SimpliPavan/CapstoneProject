package userTaskPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondItem {
	
	//driver.findElement(By.xpath("//input[contains(@class, 'form-control text-center')]")).clear();
	//driver.findElement(By.xpath("//input[contains(@class, 'form-control text-center')]")).sendKeys("2");
	@FindBy(xpath="//input[contains(@class, 'form-control text-center')]")
	private WebElement number;
	
	//driver.findElement(By.name("refreshCart")).click();
	@FindBy(name="refreshCart")
	private WebElement RefreshCart;
	
	//driver.findElement(By.xpath("//a[contains(@class, 'btn btn-success btn-block')]")).click();
	@FindBy(xpath="//a[contains(@href,'/medicare/cart/validate')]") 
	private WebElement checkOut;
	
	public SecondItem(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterNumber(String user_name) {
		number.clear();
		number.sendKeys("2");
	}
	
	public void clickRefresh() {
		RefreshCart.click();
	}
	
	public void clickCheckout() {
		checkOut.click();
	}
}
