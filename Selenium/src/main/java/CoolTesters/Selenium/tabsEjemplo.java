package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsEjemplo {
	public static void main(String[] args) {
		
		 //System.out.println( "Curso de septiembre " );
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" +File.separator;//tomando path del driver es decir el sistema en que carpeta debe buscar el driver
        System.setProperty("webdriver.chrome.driver", exePath+ "chromedriver.exe");// seteando o establecer la propiedaddel .exe
        WebDriver driver = new ChromeDriver();//inicializando el driver del navegador
        //driver.get("http://www.cooltesters.com/tienda-de-cursos/selenium-con-java");//iniciar chrome en la URL especifica
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();//maximizar ventana
        
        //Obtener e imprimir el IDde la ventana/Tab original
        String originalTab = driver.getWindowHandle();//id de la ventana donde esta actualmente selenium
        System.out.println(originalTab);
        
        //clic en el link que abre otra ventana
        WebElement clickHere = driver.findElement(By.xpath("//*[contains(@href,'popup.php')]"));
        clickHere.click();
        
      //set se asegura de que no haya duplicados y list si trae duplicados
        Set<String> ventanasAbiertas = driver.getWindowHandles();//set libreria java que obtiene una lista sin duplicados
        System.out.println(ventanasAbiertas);
        
        for(String tabNueva : driver.getWindowHandles()) {//estrutura for simplificado
        	if(!originalTab.contentEquals(tabNueva)) {//el operador booleano "!"verifica que el equals sea falso
        		driver.switchTo().window(tabNueva);
        		break;
        	}	
        }
        
        //Escribir email en la nueva ventana
        WebElement emailTxt = driver.findElement(By.name("emailid"));
        emailTxt.sendKeys("test@test.com");
       
        //regresar a la ventana original
        driver.switchTo().window(originalTab);
	
		
	}

}
