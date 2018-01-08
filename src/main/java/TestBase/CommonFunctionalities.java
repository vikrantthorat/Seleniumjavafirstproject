package TestBase;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommonFunctionalities {
	public static WebDriver driver = null;
	public static final Logger log = Logger.getLogger(CommonFunctionalities.class.getName());
	
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/drivers/geckodriver.exe");
		
		log.info("******************Opening Browser******************");
		driver = new FirefoxDriver();
		driver.get("https://www.accuweather.com/");
		String log4jpath = "log4j.properties";
		PropertyConfigurator.configure(log4jpath);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
}
