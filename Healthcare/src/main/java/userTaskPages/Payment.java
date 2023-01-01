package userTaskPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	//driver.findElement(By.id("cardNumber")).sendKeys("5321475986452178");
	@FindBy(id="cardNumber")
	private WebElement CardNumber;
	
	//driver.findElement(By.id("expityMonth")).sendKeys("12");
	@FindBy(id="expityMonth")
	private WebElement ExpMonth;
	
	//driver.findElement(By.id("expityYear")).sendKeys("2024");
	@FindBy(id="expityYear")
	private WebElement ExpYear;
	
	//driver.findElement(By.id("cvCode")).sendKeys("987");
	@FindBy(id="cvCode")
	private WebElement Code;
	
	//driver.findElement(By.xpath("//a[contains(@role, 'button')]")).click();
	@FindBy(xpath="//a[contains(@role, 'button')]")
	private WebElement pay;
	
	public Payment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterCardNumber(String user_name) {
		CardNumber.clear();
		CardNumber.sendKeys("5321475986452178");
	}
	
	public void enterexpMonth(String user_name) {
		ExpMonth.clear();
		ExpMonth.sendKeys("12");
	}
	
	public void enterexpYear(String user_name) {
		ExpYear.clear();
		ExpYear.sendKeys("2024");
	}
	
	public void entercvCode(String user_name) {
		Code.clear();
		Code.sendKeys("987");
	}
	public void clickPay() {
		pay.click();
	}
}
