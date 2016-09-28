import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignintoLinkdin {
WebDriver driver;
@BeforeMethod
public void Get()
{
	driver=new FirefoxDriver();
	driver.get("https://in.linkedin.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
@Test
public void ValidSignin()
{
	LinkdinSigninPage Signin=new LinkdinSigninPage(driver);
	Signin.Signin("komminenichaithanya@gmail.com", "9492055182k");
	driver.findElement(By.xpath(".//*[@id='main-site-nav']/ul/li[4]/a")).click();
/*@Test
public void InValidSignin()
{
	LinkdinSigninPage signin=new LinkdinSigninPage(driver);
	signin.Signin("chaitu", "123456789");
	
	try
	{
		driver.findElement(By.linkText("jobs"));
		
	}
	catch(NoSuchElementException e){

	}*/
}
}
