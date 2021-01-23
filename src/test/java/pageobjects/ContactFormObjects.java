package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactFormObjects
{
	public WebDriver driver;
	public ContactFormObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By email=By.xpath("//input[@id='email']");
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
}
