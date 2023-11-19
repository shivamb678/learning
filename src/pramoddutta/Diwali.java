package pramoddutta;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Diwali 
{

	
	WebDriver driver; 
	
	@BeforeTest
	public void openbrowser()
	{
		
		ChromeOptions option = new ChromeOptions();
		 option.addArguments("start-maximized");
		 driver = new ChromeDriver(option);
		driver.get("https://app.vwo.com/");
		
	}
	
	@Owner("Shivam")
	
	@Test
	public void Testcase()
	{
		 	
		
		//loading the url
		
		//input UN
		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("shivamb678@gmail.com");
		//input PW
		WebElement pw = driver.findElement(By.id("login-password"));
		pw.sendKeys("Test@123"); 
		//click button
		WebElement button = driver.findElement(By.id("js-login-btn"));
		button.click();
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
		//printing error
		//WebElement error_print = driver.findElement(By.id("js-notification-box-msg"));
		
		//Explicit wait Negative case
		
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBePresentInElement(error_print, "Your email, password, IP address or location did not match"));
		
		System.out.println("2 -->" + error_print.getText());
		*/
		
		//Explicit wait Positive case
		
		//
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBe(By.xpath("//span[@data-qa='lufexuloga']"), "Shivam Bhardwaj"));
		
		WebElement name = driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
		
		System.out.println("2 -->" + name.getText());
		
		
	}
	
	
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}
	

}
