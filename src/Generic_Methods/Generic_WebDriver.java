package Generic_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_WebDriver
{
	//getTitle
	public String getTheTitle(WebDriver driver)
	{
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	//getCurrentUrl
	public String getTheurl(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	//getPageSource()
	public String getpage(WebDriver driver)
	{
		String pagesrc = driver.getPageSource();
		System.out.println(pagesrc);
		return pagesrc;
	}
	
	//findElement()
		public WebElement findEle(WebElement ele,String str)
		{
			WebElement Fele  = ele.findElement(By.id(str));
			System.out.println(Fele);
			return Fele;
		}
		
	//manage()
		public void Manage_maxi(WebDriver driver)
		{
			driver.manage().window().maximize();
		}
	
		//navigate()
		public void Navi(WebDriver driver,String URL)
		{
					driver.navigate().refresh();
					driver.navigate().back();
					driver.navigate().forward();
					driver.navigate().to(URL);
		}
		
		//get()
		public  String getmethod(WebDriver driver,String url)
		{
			  driver.get(url);
			System.out.println(url);
			return url;
		}

		//close()
		public  void closeall(WebDriver driver)
		{
		  driver.close();
		}	
		
		//quit()
		public  void quitall(WebDriver driver)
		{
		  driver.quit();
		}	
		
		//getWindowHandle()
		public String getWinHand(WebDriver driver)
		{
			String winhad = driver.getWindowHandle();
			System.out.println(winhad);
			return winhad;
		}
		
		//getWindowHandles() & Switch to
		public void getWinHands(WebDriver driver)
		{
			Set<String> winhads = driver.getWindowHandles();
			int count =winhads.size();
			System.out.println(count);
			for(String wh:winhads)
			{
				driver.switchTo().window(wh);
				String title=driver.getTitle();
				System.out.println(title);
			}
	}
		
		
	
}
