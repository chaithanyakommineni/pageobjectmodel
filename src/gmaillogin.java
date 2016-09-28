import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class gmaillogin {
	WebDriver driver=Login.driver;
	@Test
	public void gmaillogin()
	{
		driver.findElement(By.id("Email")).sendKeys("chaithanya061993@gmail.com");
		driver.findElement(By.id("next")).click();
	}

}
