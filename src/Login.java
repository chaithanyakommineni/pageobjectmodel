import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	public static WebDriver driver=new FirefoxDriver();
@Test(priority=0)

	public void Signin(String username,String password)
	{
	WebElement element=	driver.findElement(By.id("login-email"));
	
	element.sendKeys(username);
	driver.findElement(By.id("login-password")).clear();
	driver.findElement(By.id("login-password")).sendKeys(password);
	
	driver.findElement(By.xpath(".//*[@value='Sign in']")).click();
	
	}
}
/*@Test(priority=1)
public void gmaillogin()
{
	driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("chaithanya061993@gmail.com");
	driver.findElement(By.id("next")).click();
}
@Test(priority=2)
public void Password()
{
	driver.findElement(By.id("Passwd")).sendKeys("9492055182k");
	driver.findElement(By.id("signIn")).click();
}*/

