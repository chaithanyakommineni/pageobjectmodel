import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shopclueslogin {
	WebDriver driver;
	public Shopclueslogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public  void logintoshopclues(String email,String password)
	{
		driver.findElement(By.xpath(".//*[@id='login_user_data']/a")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[6]/div[3]/div/div[2]/div[1]/div/form/div/div[3]/div[4]/input[1]")).click();
		driver.findElement(By.xpath(".//*[@id='left-pnl']/div[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[6]/div[3]/div/div[2]/div/div/div[3]/div[4]/input")).click();
		
	}

}
