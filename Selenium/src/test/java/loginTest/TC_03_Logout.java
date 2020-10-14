package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.VariablesGlobales;
import driverSetup.DriverSetup;

import navPages.DashboardPage;
import navPages.LoginPage;

public class TC_03_Logout {
	
	WebDriver driver = DriverSetup.setupDriver();

	// Login PageObject
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(VariablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_03() {
	  System.out.println("Step 1: Login to the App");
	  login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.PASSWORD_ADMIN);
	  
	  System.out.println("Step 2: Logout");
	  boolean dashboarPage = dashboard.logout();
	  Assert.assertTrue(dashboarPage);
	  
  }
  
  @AfterTest
 	public void closeDriver() {
 		driver.quit();
 	}
}
