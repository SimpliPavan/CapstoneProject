package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String destFile;
	

	public void initialization() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		wait = new WebDriverWait(driver, 10);
		driver.get("http://localhost:8090/medicare/");
		driver.manage().window().maximize();
		System.out.println("Create Browser Obj");
		

	}

}
