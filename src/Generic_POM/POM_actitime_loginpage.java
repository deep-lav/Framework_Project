package Generic_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_actitime_loginpage 
{
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name = "pwd")
	private WebElement password;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login_btn;
	
	public POM_actitime_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
