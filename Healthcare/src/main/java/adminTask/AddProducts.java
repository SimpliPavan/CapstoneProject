package adminTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddProducts {
	
public static WebDriver driver;
public static WebDriverWait wait;
	
	@BeforeTest
	
	public void launchApp() {
		
		//1. open the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		//2. maximize it
		driver.manage().window().maximize();
		//3. navigate to the application
		driver.get("http://localhost:8090/medicare/");
	}
	
	@Test
	
	public void addProducts() throws InterruptedException {
		
		 wait = new WebDriverWait(driver , Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
		//4. click on login
		driver.findElement(By.linkText("Login")).click();
		
		//5. enter username and password
		driver.findElement(By.id("username")).sendKeys("vk@gmail.com");
		driver.findElement(By.id("password")).sendKeys("admin");
		
		//6. click on login button
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		
		//7. click on manage product
		driver.findElement(By.linkText("Manage Product")).click();
		
		//8. click on my category , type category name and description and save it(first item)
		driver.findElement(By.xpath("//button[contains(@data-target,'myCategory')]")).click();
		
		//Thread.sleep(5000);
		 wait = new WebDriverWait(driver , Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder, 'Category Name')]")));
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Category Name')]")).sendKeys("Generic_Medicine");
		driver.findElement(By.xpath("//textarea[contains(@placeholder, 'Enter category description here')]")).sendKeys("For Fever, Cold Etc");
		driver.findElement(By.xpath("(//input[contains(@type, 'submit')])[2]")).click();
		
		//9. type required details and save
		
		driver.findElement(By.id("name")).sendKeys("cold-drug");
		driver.findElement(By.id("brand")).sendKeys("kapla");
		driver.findElement(By.id("description")).sendKeys("Best medicine for cold");
		driver.findElement(By.id("unitPrice")).clear();
		driver.findElement(By.id("unitPrice")).sendKeys("10");
		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("50");
		WebElement choosefile = driver.findElement(By.id("file"));
		choosefile.sendKeys("C:\\Users\\PAVANKUMAR\\Desktop\\capestone project\\Med1.jpg");
		//Thread.sleep(2000);
		wait = new WebDriverWait(driver , Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("categoryId")));
		WebElement categoryDropDown = driver.findElement(By.id("categoryId"));
		Select selectCategory = new Select(categoryDropDown);
		selectCategory.selectByVisibleText("Generic_Medicine");
		driver.findElement(By.name("submit")).click();
		
		//10. click on my category , type category name and description and save it(second item)
		driver.findElement(By.xpath("//button[contains(@data-target,'myCategory')]")).click();
		//Thread.sleep(5000);
		wait  = new WebDriverWait(driver , Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder, 'Category Name')]")));
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Category Name')]")).sendKeys("Generic Medicine");
		driver.findElement(By.xpath("//textarea[contains(@placeholder, 'Enter category description here')]")).sendKeys("For Fever, Cold Etc");
		driver.findElement(By.xpath("(//input[contains(@type, 'submit')])[2]")).click();
		driver.findElement(By.id("name")).sendKeys("cold-flu");
		driver.findElement(By.id("brand")).sendKeys("dolo625");
		driver.findElement(By.id("description")).sendKeys("Best medicine for cold and flu");
		driver.findElement(By.id("unitPrice")).clear();
		driver.findElement(By.id("unitPrice")).sendKeys("5");
		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("40");
		WebElement choosefilee = driver.findElement(By.id("file"));
		choosefilee.sendKeys("C:\\Users\\PAVANKUMAR\\Desktop\\capestone project\\Med2.png");
		//Thread.sleep(2000);
		wait  = new WebDriverWait(driver , Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("categoryId")));
		WebElement categoryDropDownn = driver.findElement(By.id("categoryId"));
		Select selectCategoryy = new Select(categoryDropDownn);
		selectCategoryy.selectByVisibleText("Generic_Medicine");
		driver.findElement(By.name("submit")).click();
		
		//11. click on view products
		//Thread.sleep(3000);
		wait  = new WebDriverWait(driver , Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View Products")));
		driver.findElement(By.linkText("View Products")).click();
		
		//12. search "cold-drug" product and click it
		//Thread.sleep(3000);
		wait  = new WebDriverWait(driver , Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type, 'search')]")));
		driver.findElement(By.xpath("//input[contains(@type, 'search')]")).sendKeys("cold-drug");
		driver.findElement(By.xpath("//a[contains(@href, '/medicare/show/7/product')]")).click();
		
		//13. verify "cold-drug" product
		//Thread.sleep(3000);
		wait  = new WebDriverWait(driver , Duration.ofSeconds(5000));
		String ActualFirstName = driver.getTitle();
		Assert.assertEquals(ActualFirstName, "Medicare - cold-drug");
		
		//14. search "cold-flu" product and click it
		//Thread.sleep(3000);
		wait  = new WebDriverWait(driver , Duration.ofSeconds(5000));
		driver.findElement(By.linkText("View Products")).click();
		driver.findElement(By.xpath("//input[contains(@type, 'search')]")).sendKeys("cold-flu");
		driver.findElement(By.xpath("//a[contains(@href, '/medicare/show/13/product')]")).click();
		
		//15. verify "cold-flu" product
		//Thread.sleep(3000);
		wait  = new WebDriverWait(driver , Duration.ofSeconds(5000));
		String ActualSecondName = driver.getTitle();
		Assert.assertEquals(ActualSecondName, "Medicare - cold-flu");
		
	}

	@AfterTest
	
	public void closeBrowser() {
		//16. close browser
		driver.quit();
	}

}
