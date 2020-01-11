//driver setup , url, quit
package Generic_TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import Generic_Methods.Framework_constants;

public class Genric_test implements Framework_constants
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openAppln()
	{
	
		System.setProperty(Gecko_Key, Gecko_Value);
		 driver = new FirefoxDriver();
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
	}
}
