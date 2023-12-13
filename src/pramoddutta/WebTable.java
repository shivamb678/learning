package pramoddutta;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable 
{

WebDriver driver; 
	
	@BeforeTest
	public void openbrowser()
	{
		
		ChromeOptions option = new ChromeOptions();
		 option.addArguments("start-maximized");
		 driver = new ChromeDriver(option);
		driver.get("https://awesomeqa.com/practice.html");
	}
	
	@Owner("Shivam")
	
	@Test
	public void Testcase()
	{

		WebElement firstName = driver.findElement(By.name("firstname"));
		
		//Actions Class for mouse intracton
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT)
		.sendKeys(firstName,"shivam bhardwaj")
		.keyUp(Keys.SHIFT)
		.build().perform();
		
		WebElement link = driver.findElement(By.xpath("//a[@href='https://github.com/stanfy/behave-rest/blob/master/features/conf.yaml']"));
		actions.contextClick(link).build().perform();
		
	}

	@AfterTest
	public void closebrowser()
	{
		//driver.quit();
	}


}
