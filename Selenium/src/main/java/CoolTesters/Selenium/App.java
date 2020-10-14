package CoolTesters.Selenium;

import java.util.List;
import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //System.out.println( "Curso de septiembre " );
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" +File.separator;//tomando path del driver es decir el sistema en que carpeta debe buscar el driver
        System.setProperty("webdriver.chrome.driver", exePath+ "chromedriver.exe");// seteando o establecer la propiedaddel .exe
        WebDriver driver = new ChromeDriver();//inicializando el driver del navegador
        //driver.get("http://www.cooltesters.com/tienda-de-cursos/selenium-con-java");//iniciar chrome en la URL especifica
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();//maximizar ventana
        
        //obteniendo objetos/elementos de la pagna del login
        WebElement txtuserName = driver.findElement(By.id("txtUsername"));
        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        
        //ejemplo de uso de xpath para llegar al texto propiedad del href
        String forgotPwdMsj = driver.findElement(By.xpath("//*[@id='forgotPasswordLink']/a")).getText();
        if (forgotPwdMsj.contains("Forgot your password?")) {
        	System.out.println("Muestra el mensaje para obtener nueva contraseña");
        } else {
        	System.out.println("No muestra el mensaj esperado");
        }
        
        
        //haciendo login
        txtuserName.sendKeys("Admin");
        Thread.sleep(1000);//espera de 3 segundos despues de ingresar datos
        txtPassword.sendKeys("admin123");
        Thread.sleep(1000);
        btnLogin.click();
        Thread.sleep(2000);
        
        //validacion  Home Page con webdriver
        String urlDashboard = driver.getCurrentUrl();//obtiene el url caragdo en el browser
        System.out.println("URL: "+urlDashboard);
        urlDashboard.contains("/dashboard");//verifica que la url contenga "dashboard" el "contains"es de java y sirve para comparar Strings
        
        //FindElements
        List<WebElement> firstLevelMenu = driver.findElements(By.xpath("//*[@class='firstLevelMenu']/b"));
        System.out.println("Numero de elementos: "+firstLevelMenu.size());
        String primerMenu = firstLevelMenu.get(0).getText();
        System.out.println(primerMenu);
        String segundoMenu = firstLevelMenu.get(1).getText();
        System.out.println(segundoMenu);
        
        for (int i = 0; i < firstLevelMenu.size(); i++) {
			System.out.println("los menus son: "+ firstLevelMenu.get(i).getText());
		}
        
        
        //metodos de navegacion
       /* driver.navigate().back();//regresar a la pagina anterior
        Thread.sleep(3000);
        driver.navigate().forward();//adelantar la pagina
        Thread.sleep(3000);
        driver.navigate().refresh();//regrescar la pagina
        Thread.sleep(3000);
        
        String title= driver.getTitle();
        System.out.println("El titulo es: "+title);*/
        
        //
     /*   WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
        assignLeaveBtn.click();
        Thread.sleep(3000);
        
        //Obtener texto de un webelement de la GUI
        String welcomeMsj = driver.findElement(By.id("welcome")).getText();
        boolean verifyWelcomeMsj = welcomeMsj.contains("Smith");
        if(verifyWelcomeMsj) {
        	System.out.println("El mensaje Contiene Smith");
        }else {
        	System.out.println("Error no contiene el nombre esperado");
        }*/
        
        //Dropdowns
       // Select oSelect = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
      //  oSelect.selectByVisibleText("Maternity US");
        
        
        
        //cerrar navegador web
       /* driver.close();//cierra la ventana actual
        driver.quit();//cierra todas las ventanas creadas por el webdriver*/
    	
    	
    	
    }
}
