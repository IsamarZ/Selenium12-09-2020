package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
//import java.util.NoSuchElementException;//esta no debe ser si no la de selenium
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;//esta si!!
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //System.out.println( "Curso de septiembre " );
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" +File.separator;//tomando path del driver es decir el sistema en que carpeta debe buscar el driver
        System.setProperty("webdriver.chrome.driver", exePath+ "chromedriver.exe");// seteando o establecer la propiedaddel .exe
        WebDriver driver = new ChromeDriver();//inicializando el driver del navegador
        //driver.get("http://www.cooltesters.com/tienda-de-cursos/selenium-con-java");//iniciar chrome en la URL especifica
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();//maximizar ventana
        
        //tiempos de espera 
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// con esta sola instruccion funciona para toda la app el mismo tiempo
        //WebElement txtuserName = driver.findElement(By.id("txtUsername"));
        
        //explicit wait usa la espera junto con una actividad en este ejemplo to be clic y se utiliza un objeto DriverWait de la siguiente manera
        //WebElement txtUserName = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("txtUsername")));
       // txtUserName.sendKeys("Admin");
        
        
        //Fluent wait cada cuanto va esperar y verificar un elemento
        //en el siguiente ejemplo: esperar  20 segundos y revisar cada 2 seg, este se encarga de verificar el elemento
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(20))
        		.pollingEvery(Duration.ofSeconds(2))
        		.ignoring(NoSuchElementException.class);//esto es lo que wait ignora durante los 20 segundos debe provenir de selenium
        WebElement txtUsername = wait.until(new Function<WebDriver, WebElement>() {
        	public WebElement apply(WebDriver driver) {
        		driver.navigate().refresh();//lo de esta parte
        		return driver.findElement(By.id("txtUsername"));// y esta parte, es lo que s eva averificar
				
			}
		});
        txtUsername.sendKeys("Admin");
        
	}

}
