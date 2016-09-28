import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkdinWithValid {
WebDriver driver;
LLogin objlogin;
LinkdinHome objHome;

@BeforeTest
public void LinkdinSetup()
{
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.linkedin.com/");
	
}
@Test
public void Test_Homepage()
{
	objlogin=new LLogin(driver);
	objlogin.LoginToLinkdin("komminenichaithanya@gmail.com", "9492055182k");
	objHome=new LinkdinHome(driver);
	Assert.assertTrue(objHome.equals(objlogin));
}

}
