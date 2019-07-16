package gasct;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browser {

	static WebDriver driver=null;
	
public static WebElement username;
public static WebElement password;
@FindBy(xpath="/html/body/div/div[2]/form/div[3]/img")
public static WebElement image;
public static WebElement captcha;
@FindBy(xpath="/html/body/div/div[2]/form/div[5]/div[1]/button")
public static WebElement submit;

@BeforeTest
public static void beforelogin(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GatedONTech\\Downloads\\Imp\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
}

@Test
	public static void homepage() {
	driver.get("http://gatedontechnologies.com/college/gtadmin/login/");
		PageFactory.initElements(driver, Browser.class);
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		//WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("/html/body/div/div[2]/form/div[4]/input"),"?"));
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[5]/div[1]/button")).sendKeys(Keys.ENTER);
		//File images = image.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(images, new File("d:\\cap.jpg"));
		
		
	
	}
}
