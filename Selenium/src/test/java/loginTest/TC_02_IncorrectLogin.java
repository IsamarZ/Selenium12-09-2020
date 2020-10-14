package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.VariablesGlobales;
import driverSetup.DriverSetup;
import navPages.LoginPage;

public class TC_02_IncorrectLogin {
	
WebDriver driver = DriverSetup.setupDriver();
	
	
	//LOGIN PAGEOBJECT
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(VariablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
		
	}
	
  @Test
  public void TC_02() {
	  boolean isIncorrect = login.loginIncorrect(VariablesGlobales.USER_ADMIN, "badPasswords");
	  Assert.assertTrue(isIncorrect);
	  
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.quit();
	  
  }
}
