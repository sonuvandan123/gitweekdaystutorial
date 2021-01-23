package contactformtestCases;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import frameworkWeekdays.BuildUp;
import pageobjects.ContactFormObjects;
public class ContactFormTest extends BuildUp
{
	public WebDriver driver;
	@BeforeClass
	void initDriver() throws IOException
	{
		driver=BuildUp.webDriverInit();
	}
	@Test
	void emailField()
	{
		//System.out.println(driver);
		ContactFormObjects cfo=new ContactFormObjects(driver);
		driver.get("http://automationpractice.com/index.php?controller=contact");
		cfo.email().sendKeys("vandan@gmail.com");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vandan@gmail.com");
	}
	@Test
	public void checkTitle()
	{
		driver.get("http://automationpractice.com");
		String websiteTitle=driver.getTitle();
		Assert.assertEquals(websiteTitle,"abc.com");
	}
	

	
}
