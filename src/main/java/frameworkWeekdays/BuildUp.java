package frameworkWeekdays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class BuildUp 
{  
	   public static WebDriver driver;
	   public static WebDriver webDriverInit() throws IOException
	   {
		 Properties properties= new Properties();
		 FileInputStream object=new FileInputStream("browser.properties");
		properties.load(object);
		
		//String browserValue="chrome";
		   if(properties.getProperty("browser").equalsIgnoreCase("chrome"))
		   {
			   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			   driver=new ChromeDriver();
		   }
		   else
		   {
			   System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			   driver=new FirefoxDriver();
		   
		   }
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   System.out.println("Inside Buildiup"+driver);
		   return driver;
		   
}
	   
	   public void testScreenshot(WebDriver driver) throws IOException
	   {
	      TakesScreenshot ts= (TakesScreenshot)driver;
	      File file=ts.getScreenshotAs(OutputType.FILE);
	      String destination=System.getProperty("user.dir")+"\\screenshots";
	      FileUtils.copyFile(file,new File(destination));

	   }

	   
	   
}