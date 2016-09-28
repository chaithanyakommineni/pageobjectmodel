import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkdinSigninPage {
	WebDriver driver;
	public LinkdinSigninPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Signin(String username,String password)
	{
	WebElement element=	driver.findElement(By.id("login-email"));
	
	element.sendKeys(username);
	driver.findElement(By.id("login-password")).clear();
	driver.findElement(By.id("login-password")).sendKeys(password);
	
	driver.findElement(By.xpath(".//*[@value='Sign in']")).click();
	
	}

}
