package pramoddutta;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Makemytrip 
{
WebDriver driver; 
	
	@BeforeTest
	public void openbrowser() throws InterruptedException
	{
		
		ChromeOptions option = new ChromeOptions();
		 option.addArguments("start-maximized");
		 driver = new ChromeDriver(option);
		driver.get("https://www.makemytrip.com");
		Thread.sleep(5000);
	}
	
	@Owner("Shivam")
	
	@Test
	public void Testcase()
	{
		Actions actions = new Actions(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//WebElement Cross = driver.findElement(By.className("wewidgeticon we_close"));
		//Cross.click();
		WebElement Entery = driver.findElement(By.id("fromCity"));
		actions.moveToElement(Entery).click().sendKeys(" New Delhi, India").build().perform();	//it will click and type (send keys)
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform(); //it will scroll down the page
		
		List<WebElement > li = driver.findElements((By.xpath("//ul[@role=\"listbox\"]/li")));
		for (@SuppressWarnings("unused") WebElement e: li)
		{
			if(e.getText().contains("New Delhi, India"))
			{
				e.click();
			}
			//System.out.println(e.getText()); 
		}
	}

	@AfterTest
	public void closebrowser()
	{
		//driver.quit();
	}

}
