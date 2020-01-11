package Generic_TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_POM.POM_Gmail_Inbox;
import Generic_POM.POM_Gmail_Pwd;
import Generic_POM.POM_Gmail_UserName;

public class TS_Gmail_Sent 
{
	@Test
	public void Sent_Links() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		
		Thread.sleep(5000);
		//Create object of  Username POM class
				POM_Gmail_UserName UN =new POM_Gmail_UserName(driver);
				UN.setEmail("lavanya2284@gmail.com");
				UN.clickLogin();
				
				Thread.sleep(10000);
				
				//Create object of password POM class
				POM_Gmail_Pwd PWD = new POM_Gmail_Pwd(driver);
				PWD.setpwd("lavi@2284");
				PWD.clickLogin();
				Thread.sleep(10000);
				driver.manage().window().maximize();
				
				//Create object for inbox class
				POM_Gmail_Inbox LO = new POM_Gmail_Inbox(driver);
				LO.SentLink();
				
				List<WebElement> links = driver.findElements(By.xpath("//a"));
				Thread.sleep(5000);
				int count=links.size();
				System.out.println("Number of links"+count);
				
				for(WebElement we :links)
				{
					String str=we.getText();
					System.out.println(str);
				}
				
				driver.quit();

	}

}
