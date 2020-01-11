package Generic_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Gmail_Pwd
{
	@FindBy(name="password")
	private WebElement pword;
	
	@FindBy(xpath="(//span[.='Next'])[1]")
	private WebElement next;
	
	public POM_Gmail_Pwd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setpwd(String pwd)
	{
		pword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		next.click();
	}

}
