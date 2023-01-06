package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import TestBase.*;

public class ManageProductPage extends Base {
	
	    //driver.findElement(By.linkText("Manage Product")).click();
		@FindBy(linkText="Manage Product")
		private WebElement manageProduct;
	
	    //driver.findElement(By.xpath("//button[contains(@data-target,'myCategory')]")).click();
		@FindBy(xpath="//button[contains(@data-target,'myCategory')]")
		private WebElement myCategory;
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[contains(@placeholder, 'Category Name')]")).sendKeys("Generic Medicine");
		@FindBy(xpath="//input[contains(@placeholder, 'Category Name')]")
		private WebElement Category_Name;
		
		//driver.findElement(By.xpath("//textarea[contains(@placeholder, 'Enter category description here')]")).sendKeys("For Fever, Cold Etc");
		@FindBy(xpath="//textarea[contains(@placeholder, 'Enter category description here')]")
		private WebElement Enter_Description;
		
		//driver.findElement(By.xpath("(//input[contains(@type, 'submit')])[2]")).click();
		@FindBy(xpath="(//input[contains(@type, 'submit')])[2]")
		private WebElement submit;
		
		//driver.findElement(By.id("name")).sendKeys("cold-drug");
		@FindBy(id="name")
		private WebElement name;
		
		//driver.findElement(By.id("brand")).sendKeys("kapla");
		@FindBy(id="brand")
		private WebElement brand;
		
		//driver.findElement(By.id("description")).sendKeys("Best medicine for cold");
		@FindBy(id="description")
		private WebElement Description;
		
		//driver.findElement(By.id("unitPrice")).clear();
		//driver.findElement(By.id("unitPrice")).sendKeys("10");
		@FindBy(id="unitPrice")
		private WebElement UnitPrice;
		
		//driver.findElement(By.id("quantity")).clear();
		//driver.findElement(By.id("quantity")).sendKeys("50");
		@FindBy(id="quantity")
		private WebElement Quantity;
		
		//WebElement choosefile = driver.findElement(By.id("file"));
		@FindBy(id="file")
		private WebElement choosefile;
		
		//WebElement categoryDropDown = driver.findElement(By.id("categoryId"));
		@FindBy(id="categoryId")
		private WebElement categoryDropDown;
		
		//driver.findElement(By.name("submit")).click();
		@FindBy(name="submit")
		private WebElement save;
		
		//driver.findElement(By.linkText("View Products")).click();
		@FindBy(linkText="View Products")
		private WebElement View_Products;
		
		//driver.findElement(By.xpath("//input[contains(@type, 'search')]"))
		@FindBy(xpath="//input[contains(@type, 'search')]")
		private WebElement search;
		
		//driver.findElement(By.xpath("//a[contains(@href, '/medicare/show/7/product')]"))
		@FindBy(xpath="//a[contains(@href, '/medicare/show/7/product')]")
		private WebElement searchFirst;
		
		//driver.findElement(By.xpath("//a[contains(@href, '/medicare/show/13/product')]"))
		@FindBy(xpath="//a[contains(@href, '/medicare/show/13/product')]")
		private WebElement searchSecond;
		
		public ManageProductPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// Actions

		/*public void myctegory(String CatName, String Dscription) {
			manageProduct.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@data-target,'myCategory')]")));
			myCategory.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder, 'Category Name')]")));
			Category_Name.clear();
			Category_Name.sendKeys(CatName);
			Enter_Description.clear();
			Enter_Description.sendKeys(Dscription);
			submit.click();
		}*/

		public void productName(String CatName, String Dscription, String Name,String brnd, String Dscptn, String untprce, String qntty, String imagePath, String ProductVerify,String locator ) {
			manageProduct.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@data-target,'myCategory')]")));
			myCategory.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder, 'Category Name')]")));
			Category_Name.clear();
			Category_Name.sendKeys(CatName);
			Enter_Description.clear();
			Enter_Description.sendKeys(Dscription);
			submit.click();
			name.clear();
			name.sendKeys(Name);
			brand.clear();
			brand.sendKeys(brnd);
			Description.clear();
			Description.sendKeys(Dscptn);
			UnitPrice.clear();
			UnitPrice.sendKeys(untprce);
			Quantity.clear();
			Quantity.sendKeys(qntty);
			choosefile.sendKeys(imagePath);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("categoryId")));
			Select selectCategory = new Select(categoryDropDown);
			selectCategory.selectByVisibleText(CatName);
			save.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View Products")));
			//driver.findElement(By.linkText("View Products")).click();
			View_Products.click();
			
			//12. search "cold-drug" product and click it
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type, 'search')]")));
			//driver.findElement(By.xpath("//input[contains(@type, 'search')]")).sendKeys("cold-drug");
			search.sendKeys(Name);
			driver.findElement(By.xpath(locator)).click();
		
			//searchFirst.click();
			
			//searchSecond.click();
			
			//13. verify "cold-drug" product
			
			//String ActualFirstName = driver.getTitle();
			//Assert.assertEquals(ActualFirstName, "Medicare - cold-drug");
			
			/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View Products")));
			//driver.findElement(By.linkText("View Products")).click();
			View_Products.click();
			
			//14. search "cold-flu" product and click it
			
			//driver.findElement(By.xpath("//input[contains(@type, 'search')]")).sendKeys("cold-flu");
			search.sendKeys("cold-flu");
			//driver.findElement(By.xpath("//a[contains(@href, '/medicare/show/13/product')]")).click();*/
			//searchSecond.click();
			
			//15. verify "cold-flu" product
			
			String ActualName = driver.getTitle();
			Assert.assertEquals(ActualName, ProductVerify);
			
			
		}
		
}