import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkdinHome {
WebDriver driver;
By HomeLinkdin=By.linkText(" Home ");

public LinkdinHome(WebDriver driver)
{
	this.driver=driver;
}
public String GetHomePage() {
	driver.findElement(HomeLinkdin).getText();
	return driver.findElement(HomeLinkdin).getText();
	
}

}
