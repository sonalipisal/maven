package Investment.APR21B_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App {
  
	
	@Test
	public void m1()
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
  }
}
