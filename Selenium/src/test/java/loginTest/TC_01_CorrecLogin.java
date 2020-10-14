package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.VariablesGlobales;
import driverSetup.DriverSetup;
import navPages.LoginPage;


public class TC_01_CorrecLogin {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	//LOGIN PAGEOBJECT
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(VariablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
		
	}
	
  @Test
  public void TC_01() {
	  login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.PASSWORD_ADMIN);
	  
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.quit();
	  
  }
}
