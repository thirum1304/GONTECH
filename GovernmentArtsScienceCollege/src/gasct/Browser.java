package gasct;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import net.sourceforge.tess4j.Tesseract;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Browser {


public static WebElement username;
public static WebElement password;
@FindBy(xpath="/html/body/div/div[2]/form/div[3]/img")
public static WebElement image;
public static WebElement captcha;
@FindBy(xpath="/html/body/div/div[2]/form/div[5]/div[1]/button")
public static WebElement submit;
@Test
	public static void home() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GatedONTech\\Downloads\\Imp\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://gatedontechnologies.com/college/gtadmin/login/");
		
		PageFactory.initElements(driver, Browser.class);
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		//WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		//Thread.sleep(50000);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[5]/div[1]/button")).sendKeys(Keys.ENTER);
		//File images = image.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(images, new File("d:\\cap.jpg"));
		
		
/*		Tesseract tes = new Tesseract();
		
	//Tesseract tess = new Tesseract(); 
	tes.setLanguage("eng");
	this.result=tes.doOCR(images).trim();
		
	captcha.sendKeys(resultshot of the);
		//captcha.sendKeys(image.getText());
		
		submit.click();
*/		
	}
}
