package Generic_Methods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Select
{
	//selectByIndex()
		public void SelIndex(WebElement ele, int i)
		{
			Select s=new Select(ele);
			s.selectByIndex(i);
		}

		//selectByValue()
				public void SelValue(WebElement ele, String str)
				{
					Select s=new Select(ele);
					s.selectByValue(str);
				}
				
				//selectByVisibleText()
				public void SelText(WebElement ele, String txt)
				{
					Select s=new Select(ele);
					s.selectByVisibleText(txt);
				}
				
				
				//deselectByIndex()
				public void DeselIndex(WebElement ele, int i)
				{
					Select s=new Select(ele);
					s.deselectByIndex(i);
				}

				//deselectByValue()
						public void DeselValue(WebElement ele, String str)
						{
							Select s=new Select(ele);
							s.deselectByValue(str);
						}
						
						//deselectByVisibleText()
						public void DeselText(WebElement ele, String txt)
						{
							Select s=new Select(ele);
							s.deselectByVisibleText(txt);
						}
						
						//getOptions()
						public void get_All(WebElement ele)
						{
							Select s=new Select(ele);
							List<WebElement> var = s.getOptions();
							System.out.println(var);
						}
						
						
}
