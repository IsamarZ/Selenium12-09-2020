package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;




public class HardAssert {
  @Test
  public void assertEquals() {
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(a,b);
	  }
	  @Test
	  public void assertNoEquals() {
	  int a = 10;
	  int b = 9;
	  Assert.assertNotEquals(a, b);
	  }
	  @Test
	  public void assertTrue() {
	  int a = 10;
	  int b = 10;
	  Assert.assertTrue(a==b);
	  }
	  @Test
	  public void assertfalse() {
	  int a = 10;
	  int b = 5;
	  Assert.assertFalse(a==b);
	  }
	  
	  @Test
	  public void verificarTituloDePagina() {
		  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" +File.separator;//tomando path del driver es decir el sistema en que carpeta debe buscar el driver
	        System.setProperty("webdriver.chrome.driver", exePath+ "chromedriver.exe");// seteando o establecer la propiedaddel .exe
	        WebDriver driver = new ChromeDriver();//inicializando el driver del navegador
	        //driver.get("http://www.cooltesters.com/tienda-de-cursos/selenium-con-java");//iniciar chrome en la URL especifica
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();//maximizar ventana
	        
	        String actualTitle = driver.getTitle();
	        String expectedTiTle = "OrangeHRM";
	        
	        Assert.assertEquals(actualTitle, expectedTiTle);
	  }
	  
	  @Test
	  public void verificarTituloDePaginaBooleana() {
		  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" +File.separator;//tomando path del driver es decir el sistema en que carpeta debe buscar el driver
	        System.setProperty("webdriver.chrome.driver", exePath+ "chromedriver.exe");// seteando o establecer la propiedaddel .exe
	        WebDriver driver = new ChromeDriver();//inicializando el driver del navegador
	        //driver.get("http://www.cooltesters.com/tienda-de-cursos/selenium-con-java");//iniciar chrome en la URL especifica
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();//maximizar ventana
	        
	        String actualTitle = driver.getTitle();
	        String expectedTiTle = "OrangeHRM";
	        
	        boolean titulo = actualTitle.contains(expectedTiTle);
	        
	        Assert.assertTrue(titulo);
	  }
	  
}
