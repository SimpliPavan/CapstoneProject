package userTaskPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Antibiotics {
	
	//driver.findElement(By.xpath("(//a[contains(@class, 'btn btn-success')])[1]")).click();
	@FindBy(xpath="//a[contains(@href, '/medicare/cart/add/5/product')]")
	private WebElement clickcartFirst;
	

	public Antibiotics(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickcartButton() {
		clickcartFirst.click();
	}
	
}