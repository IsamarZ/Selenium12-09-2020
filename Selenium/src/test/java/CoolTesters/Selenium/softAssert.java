package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	//sorftAssert requiere la contruccion deun objeto
	SoftAssert softAssert = new SoftAssert();
  @Test
  public void softAsserEquals() {
	  int a =5;
	  int b = 10;
	  int x = 8;
	  int y = 8;
	  
	  softAssert.assertEquals(a, b);
	  softAssert.assertEquals(x, y);
	  
	  softAssert.assertAll();// para estar seguros de que hara un assert en todos ejempplo verificacion las 5 lineas de String
	  
  }
  
  @Test
  public void softAssertDriver() {
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" +File.separator;//tomando path del driver es decir el sistema en que carpeta debe buscar el driver
      System.setProperty("webdriver.chrome.driver", exePath+ "chromedriver.exe");// seteando o establecer la propiedaddel .exe
      WebDriver driver = new ChromeDriver();//inicializando el driver del navegador
      //driver.get("http://www.cooltesters.com/tienda-de-cursos/selenium-con-java");//iniciar chrome en la URL especifica
      driver.get("https://opensource-demo.orangehrmlive.com/");
      driver.manage().window().maximize();//maximizar ventana
      
      String actualTitle = driver.getTitle();
      String expectedTiTle = "OrangeHRM";
      String badTitle = "ads";
            
      softAssert.assertEquals(actualTitle, expectedTiTle);
      softAssert.assertEquals(actualTitle, badTitle);
      softAssert.assertAll();
      
      }
  
}
