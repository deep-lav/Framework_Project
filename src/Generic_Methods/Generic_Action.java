package Generic_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_Action
{
	//doubleClick()
	public void double_click(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	//mouseHover()
	public void mouse_hover(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele);
	}
	
	//Right Click
	public void right_Click(WebDriver driver,WebElement ele,String path)
	{
	 ele = driver.findElement(By.xpath(path));
	
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	}
	
	//drag & drop 
	public void drag_drop(WebDriver driver,WebElement ele1,WebElement ele2,String path1,String path2)
	{
		driver.manage().window().maximize();
		 ele1 = driver.findElement(By.xpath(path1));
		 ele2 = driver.findElement(By.xpath(path2));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1,ele2).perform();
	}
}
