package Generic_Methods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_WebElement
{
	//getText()
	public String getTheText(WebElement ele)
	{
		String text = ele.getText();
		System.out.println(text);
		return text;
	}

	//getAttribute
	public String getTheAttribute(WebElement ele, String Att)
	{
		String Attval = ele.getAttribute(Att);
		System.out.println(Attval);
		return Attval;
	}
	
	//getCssValue
		public String getCSS(WebDriver driver, String path)
		{
			WebElement ele = driver.findElement(By.xpath(path));
			String font = ele.getCssValue("font-size");
			System.out.println(font);
			return font;		
				
		}
	
		//getHeight()
		public int getHeight(WebDriver driver, String path)
		{
			WebElement ele = driver.findElement(By.xpath(path));
			int height = ele.getSize().getHeight();
			System.out.println(height);
			return height;		
		}
		
		//getWidth()
		public int getWidth(WebDriver driver, String path)
		{
			WebElement ele = driver.findElement(By.xpath(path));
			int width = ele.getSize().getWidth();
			System.out.println(width);
			return width;		
		}
	
		//getLocation
		public Point getLocation(WebDriver driver, String path)
		{
				WebElement ele=driver.findElement(By.xpath(path));
				Point loc = ele.getLocation();
				System.out.println(loc);
				return loc;
		}
		
		//getLocationX()
		public int getLocationX(WebDriver driver, String path)
		{
			WebElement ele = driver.findElement(By.xpath(path));
			int x = ele.getLocation().getX();
			System.out.println(x);
			return x;
		}
		
		//getLocationY()
				public int getLocationY(WebDriver driver, String path)
				{
					WebElement ele = driver.findElement(By.xpath(path));
					int y=ele.getLocation().getY();
					System.out.println(y);
					return y;
				}	
		
		
	//findElement & //click
	public WebElement findEle(WebElement ele,String str)
	{
		WebElement Fele  = ele.findElement(By.id(str));
		Fele.click();
		System.out.println(Fele);
		return Fele;
	}
	
	//findElements 
		public void findEles(WebDriver driver, WebElement ele,String path)
		{
			List<WebElement> Fele  = driver.findElements(By.xpath(path));
			   int count=Fele.size();
			   System.out.println(count);
			   
			   ArrayList<String> al=new ArrayList<String>();
			  for(WebElement we : Fele)
			  {
				  String text = we.getText();
				  al.add(text);
				  System.out.println(text);
			  }
		}
	 
	//click
	public void clickTheEle(WebElement ele)
	{
		ele.click();
	}
	
	//clear
		public void clearTheEle(WebElement ele)
		{
			ele.clear();
		}

		
}
