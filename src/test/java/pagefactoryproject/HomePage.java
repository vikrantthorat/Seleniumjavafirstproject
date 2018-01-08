package pagefactoryproject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageActions.HomePagePOM;
import TestBase.CommonFunctionalities;

public class HomePage extends CommonFunctionalities {
	HomePagePOM homepagepom ;
	
	@BeforeMethod
	public void initialAction()
	{
		openBrowser();
	}
	@Test
	public void searchCity()
	{
		homepagepom = new HomePagePOM(CommonFunctionalities.driver);
		homepagepom.navigateToHomePage();
		homepagepom.enterCity();
		/*Set<String> tabs = driver.getWindowHandles();
		int sizetab = tabs.size();
		driver.switchTo().window(sizetab.get(0));
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		ExpectedConditions.visibilityOfElementLocated(null))*/
	}

	@AfterMethod
	public void LastAction()
	{
		closeBrowser();
	}
}
