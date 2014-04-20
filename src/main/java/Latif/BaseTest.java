package Latif;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	FirefoxDriver driver=new FirefoxDriver();
	
	@Before
	public void open()
	{
		driver.get("http://www.bluefly.com");
	}
	
	@After
	public void quit()
	{
		
	}
}
