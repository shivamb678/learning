package pramoddutta;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Atbfx 
{

	public static void main(String[] args) 
	{
		 //System.out.println("Hello world");
		ChromeOptions option = new ChromeOptions();
		 option.addArguments("start-maximized"); 
		WebDriver driver = new ChromeDriver(option);
		 
		 //option.addArguments(null)
		 //option.setPageLoadStrategy(PageLoadStrategy.)
		 driver.get("https://sdet.live");
		 //driver.close();
		 System.out.println(driver.getTitle());
		 
		 
		 
		 
		 

	}

}
