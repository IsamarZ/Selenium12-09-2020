package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" +File.separator;//tomando path del driver es decir el sistema en que carpeta debe buscar el driver
        System.setProperty("webdriver.chrome.driver", exePath+ "chromedriver.exe");// seteando o establecer la propiedaddel .exe
        WebDriver driver = new ChromeDriver();//inicializando el driver del navegador
        //driver.get("http://www.cooltesters.com/tienda-de-cursos/selenium-con-java");//iniciar chrome en la URL especifica
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();//maximizar ventana
        
      //Fluent wait cada cuanto va esperar y verificar un elemento
        //en el siguiente ejemplo: esperar  20 segundos y revisar cada 2 seg, este se encarga de verificar el elemento
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(20))
        		.pollingEvery(Duration.ofSeconds(2))
        		.ignoring(NoSuchElementException.class);//esto es lo que wait ignora durante los 20 segundos 
        
        WebElement txtUsername = wait.until(new Function<WebDriver, WebElement>() {
        	public WebElement apply(WebDriver driver) {
        		driver.navigate().refresh();//lo de esta
        		return driver.findElement(By.id("txtUsername"));// y esta parte es lo que s eva averificar
				
			}
		});
        txtUsername.sendKeys("Admin");
        
	}

}
