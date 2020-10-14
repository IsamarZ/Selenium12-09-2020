package navPages;

import java.awt.print.Pageable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//permite ingresar y buscar el driver para inicializar los objetos en el constructor
		
	}
	
	//login PageObjects o WebElements
	@FindBy(id ="txtUsername")
	private WebElement userNameTxt;
	@FindBy(id ="txtPassword")
	private WebElement passwordTxt;
	@FindBy(id ="btnLogin")
	private WebElement btnLogin;
	@FindBy(xpath ="//*[@id=\"spanMessage\"]")
	private WebElement errorMsj;
	
	
	public void login (String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
	
	public boolean loginIncorrect (String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
		
		boolean errMsj = errorMsj.getText().contentEquals("Invalid credentials");
		System.out.println("el error es"+ errorMsj.getText());
		return errMsj;
		//return errorMsj.getText().contains("Invalid credentials");//otra forma de devolver el return
		
	}

}
