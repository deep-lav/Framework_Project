package Generic_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Gmail_Inbox 
{
	@FindBy(xpath = "//span[@class='gb_Ia gbii']")
	private WebElement icon;
	
	@FindBy(xpath = "//a[.='Sign out']")
	private WebElement SO;
	
	@FindBy(xpath = "(//div[@role='button' and @tabindex='0'])[7]")
	private WebElement compose;
	
	@FindBy(xpath = "//textarea[@class='vO' and @role='combobox']")
	private WebElement To_add;
	
	@FindBy(xpath = "//input[@name='subjectbox']")
	private WebElement subject;
	
	@FindBy(xpath = "//div[@aria-label='Message Body']")
	private WebElement Body;
	
	@FindBy(xpath = "//div[.='Send' and @class= 'T-I J-J5-Ji aoO v7 T-I-atl L3']")
	private WebElement send_button;
	
	@FindBy(xpath="//a[@title='Sent']")
	private WebElement Sent_Link;
	
	
	//-----------------------------------------------------------
	public POM_Gmail_Inbox(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------------------------------------------------------
	public void clickIcon() 
	{
		icon.click();
	}
	
	public void clickLogout()
	{
		SO.click();
	}
	
	public void clickCompose() 
	{
		compose.click();
	}
	
	public void Setmailto(String mail_add) 
	{
		To_add.sendKeys(mail_add);
	}
	
	public void SetSubject(String sub) 
	{
		subject.sendKeys(sub);
	}
	
	public void SetBody(String msg) 
	{
		Body.sendKeys(msg);
	}
	public void clickSend() 
	{
		send_button.click();
	}

	public void SentLink()
	{
		Sent_Link.click();
	}
	
}
