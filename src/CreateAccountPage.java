import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class CreateAccountPage {
WebDriver driver;
public CreateAccountPage(WebDriver driver)
{
	this.driver=driver;
}
public void CreateAccount(String firstname,String lastname,String joinemail,String joinpassword,String zipcode,String company,String phonenumber,String challengeinput)
{
	driver.findElement(By.id("first-name")).sendKeys(firstname);
	driver.findElement(By.id("last-name")).sendKeys(lastname);
	driver.findElement(By.id("join-email")).sendKeys(joinemail);
	driver.findElement(By.id("join-password")).sendKeys(joinpassword);
	driver.findElement(By.xpath(".//*[@id='pagekey-uno-reg-guest-home']/div[2]/div[2]/div/div[2]/div/div/div/form/fieldset/button")).click();
WebElement el=	driver.findElement(By.id("country-select"));
el.click();
Select select1=new Select(el);
select1.selectByVisibleText("India");
driver.findElement(By.id("phoneNumber")).sendKeys(phonenumber);
driver.findElement(By.id("submitChallenge")).click();
driver.findElement(By.id("challenge-input")).sendKeys(challengeinput);
driver.findElement(By.id("submitChallenge")).click();
	//driver.findElement(By.xpath(".//*[@id='rc-imageselect-target']/table/tbody/tr[2]/td[1]/div/div[1]/img")).click();
	//driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();
	WebElement select2=driver.findElement(By.id("country"));
    Select select=new Select(select2);
    select.selectByVisibleText("Hong Kong");
    driver.findElement(By.id("zip-code")).clear();
    driver.findElement(By.id("zip-code")).sendKeys(zipcode);
    driver.findElement(By.xpath(".//*[@class='save-profile']")).click();
    driver.findElement(By.xpath(".//*[@id='nux-basic-profile']/div/div/div[2]/form/fieldset/div[1]/div[2]/ul/li[2]/fieldset/div/label[2]")).click();
    driver.findElement(By.id("job-title")).click();
    driver.findElement(By.id("company")).sendKeys(company);
    driver.findElement(By.xpath(".//*[@id='nux-basic-profile']/div/div/div[2]/form/fieldset/div[2]/ul/li[2]/input")).click();
    driver.findElement(By.xpath(".//*[@id='uno-goals-options']/li[5]/button")).click();
    driver.findElement(By.id("abk-skip-btn")).click();
    Alert alert=driver.switchTo().alert();
    System.out.println("alert");
    alert.accept();
    driver.findElement(By.xpath(".//*[@id='uno-confirm-email']/div/div/div[2]/div/div/ul/li/button")).click();
	
	 
     
}
}
