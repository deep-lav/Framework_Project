package Generic_TestScripts;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_Methods.Excel_input;
import Generic_POM.POM_Gmail_Inbox;
import Generic_POM.POM_Gmail_Pwd;
import Generic_POM.POM_Gmail_UserName;


public class TS_Gmail_Login extends  Genric_test
{
	@Test
	public void GmailLogin()  throws InterruptedException
	{
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/"); */
		
		Thread.sleep(5000);
		
		//fetches data from excel sheet
		String un = Excel_input.getdata("Sheet1", 1, 0);
		String pwd = Excel_input.getdata("Sheet1", 1, 1);
		
		//Create object of  Username POM class
		POM_Gmail_UserName UN =new POM_Gmail_UserName(driver);
		UN.setEmail(un);
		UN.clickLogin();
		
		Thread.sleep(10000);
		
		//Create object of password POM class
		POM_Gmail_Pwd PWD = new POM_Gmail_Pwd(driver);
		PWD.setpwd(pwd);
		PWD.clickLogin();
		Thread.sleep(10000);
		driver.manage().window().maximize();
		
		//Create object for inbox class
		POM_Gmail_Inbox LO = new POM_Gmail_Inbox(driver);
		LO.clickIcon();
		LO.clickLogout();
		
	
		//driver.quit();
	}

}
