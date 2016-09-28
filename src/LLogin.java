import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LLogin {
	WebDriver driver;
	By Lusername=By.id("login-email");
	By Lpassword=By.id("login-password");
	By Signin=By.xpath(".//*[@id='pagekey-uno-reg-guest-home']/div[1]/div/form/input[6]");
	
	
	public LLogin(WebDriver driver)
	{
		this.driver=driver;
	}

	public void SetUserName(String SetUserName)
	{
		driver.findElement(Lusername).sendKeys(SetUserName);
	
	}
	public void SetPassword(String SetPassword)
	{
		driver.findElement(Lpassword).sendKeys(SetPassword);
	}
	public void Signin() 
	{
		driver.findElement(Signin).click();
		
	}
	public void LoginToLinkdin(String SetUserName,String SetPassword)
	{
		this.SetUserName(SetUserName);
		this.SetPassword(SetPassword);
		this.LoginToLinkdin(SetUserName, SetPassword);
	}
	
}

