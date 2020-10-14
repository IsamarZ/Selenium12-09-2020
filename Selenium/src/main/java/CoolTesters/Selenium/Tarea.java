package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tarea {

	public static void main(String[] args) throws InterruptedException {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" +File.separator;//tomando path del driver es decir el sistema en que carpeta debe buscar el driver
        System.setProperty("webdriver.chrome.driver", exePath+ "chromedriver.exe");// seteando o establecer la propiedaddel .exe
        WebDriver driver = new ChromeDriver();//inicializando el driver del navegador
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();//maximizar ventana
        
        //obteniendo objetos/elementos de la pagna del login
        WebElement txtuserName = driver.findElement(By.id("txtUsername"));
        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        
      //haciendo login
        txtuserName.sendKeys("Admin");
        Thread.sleep(1000);//espera de 3 segundos despues de ingresar datos
        txtPassword.sendKeys("admin123");
        Thread.sleep(1000);
        btnLogin.click();
        Thread.sleep(2000);
        
        WebElement menuDirectory = driver.findElement(By.id("menu_directory_viewDirectory"));
        menuDirectory.click();
        Thread.sleep(2000);
        
        WebElement txtNameDirectory = driver.findElement(By.id("searchDirectory_emp_name_empName"));
        txtNameDirectory.sendKeys("Robert");
        Thread.sleep(1000);
        
        Select selectJobTittle = new Select(driver.findElement(By.id("searchDirectory_job_title")));
        selectJobTittle.selectByVisibleText("Sales Manager");
        Thread.sleep(1000);
        
        Select selectLocation = new Select(driver.findElement(By.id("searchDirectory_location")));
        selectLocation.selectByVisibleText("  United States");
        Thread.sleep(1000);
        
        WebElement btnSearch = driver.findElement(By.id("searchBtn"));
        btnSearch.click();
        Thread.sleep(1000);
        
        
        //ahora intentar con arreglos y utilizando xpath
        /*String mostrarDatos = driver.findElement(By.className("odd")).getText();
        if(mostrarDatos.contains("Robert")) {
        	System.out.println("Enconcontro a Roberto");
        }else {
        	System.out.println("encontro a otra persona");
        }*/
        
        String mostrarDatos = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")).getText();
        System.out.println("este es: "+mostrarDatos);
        if(mostrarDatos.contains("Robert Craig")) {
        	System.out.println("Enconcontro a Roberto");
        }else {
        	System.out.println("encontro a otra persona");
        }
    
        driver.close();

	}

}
