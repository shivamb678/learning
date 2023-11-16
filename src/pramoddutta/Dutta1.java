package pramoddutta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dutta1 {

	@Test
	public void NegativeTC()
	{
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		 option.addArguments("start-maximized"); 
		WebDriver driver = new ChromeDriver(option);
		
		//loading the url
		driver.get("https://app.vwo.com/");
		//input UN
		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("abc@gmail.com");
		//input PW
		WebElement pw = driver.findElement(By.id("login-password"));
		pw.sendKeys("123");
		//click button
		WebElement button = driver.findElement(By.id("js-login-btn"));
		button.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//printing error
		WebElement error_print = driver.findElement(By.id("js-notification-box-msg"));
		System.out.println(error_print.getText());
		
		//Assert
		Assert.assertEquals(error_print.getText(), "Your email, password, IP address or location did not match");
		driver.quit();
		
		

	}

}
