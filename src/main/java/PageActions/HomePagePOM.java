	package PageActions;
	import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	
	public class HomePagePOM {
		public static Logger log = Logger.getLogger(HomePagePOM.class.getName());
		
		WebDriver driver =null;
		WebDriverWait wait = null;
		@FindBy(xpath = "//*[@id=\"header-logo\"]/a")
		WebElement Logo;
		@FindBy(xpath = "//*[@id=\"s\"]")
		WebElement cityText;
		@FindBy (xpath = "//*[@id=\"findcity\"]/button")
		WebElement searchCityButton;
		@FindBy (xpath = "//*[@id=\"current-city-tab\"]/a")
		WebElement selectedCity;
		
		public HomePagePOM(final WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			wait = new WebDriverWait(driver,20);
		}
		
		public void navigateToHomePage()
		{
			log.info("****************Navigating to Home Page***************");
			wait.until(ExpectedConditions.visibilityOf(Logo));
		}
		public void enterCity()
		{
			Actions action = new Actions(driver);
			action.moveToElement(selectedCity).build().perform();
			//(JavascriptExecutor(driver)).executeScript("arguments[0].click();",element); 
			cityText.clear();
			cityText.sendKeys("Pune, India");
			searchCityButton.click();
			//driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String[] cityName = (selectedCity.getText().split(","));
			Assert.assertEquals(cityName[0], "Pune","found CIty - "+cityName[0]+". ");
		}

	}

