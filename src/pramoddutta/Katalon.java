package pramoddutta;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class Katalon 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		 option.addArguments("start-maximized"); 
		WebDriver driver = new ChromeDriver(option);
		
		//loading the url
		
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		WebElement button = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
		button.click();
	}

}
