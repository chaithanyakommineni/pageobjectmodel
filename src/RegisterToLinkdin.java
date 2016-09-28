import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterToLinkdin {
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void LinkdinCreate()
	{
		CreateAccountPage page=new CreateAccountPage(driver);
		page.CreateAccount("chaitu", "nani", "smartybecool111@rediffmail.com", "9492055182k", "507208", "microsoft","9492055182","1425876");
		
	}
	

}
