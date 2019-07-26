package gasct;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Browser {

	static WebDriver driver;
	
public static WebElement username;
public static WebElement password;
@FindBy(xpath="/html/body/div/div[2]/form/div[3]/img")
public static WebElement image;
public static WebElement captcha;
@FindBy(xpath="/html/body/div/div[2]/form/div[5]/div[1]/button")
public static WebElement submit;

@BeforeSuite
public static void beforelogin(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GatedONTech\\Downloads\\Imp\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("http://gatedontechnologies.com/college/gtadmin/login/");
	
}

@Test
	public static void homepage() {
	//beforelogin();
	
		PageFactory.initElements(driver, Browser.class);
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		//WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		wait.until(ExpectedConditions.textToBe(By.xpath("html/body/div/div[2]/form/div[4]/input"), "?"));
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[5]/div[1]/button")).sendKeys(Keys.ENTER);
		//File images = image.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(images, new File("d:\\cap.jpg"));
		
		
	
	}
}
