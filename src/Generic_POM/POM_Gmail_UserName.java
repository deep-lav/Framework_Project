package Generic_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Gmail_UserName 
{
	@FindBy(id="identifierId")
	private WebElement email;
	
	@FindBy(xpath="(//span[.='Next'])[1]")
	private WebElement next;
	
	public POM_Gmail_UserName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String em)
	{
		email.sendKeys(em);
	}
	
	public void clickLogin()
	{
		next.click();
	}

}
