package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaSignIn {

    @FindBy(id = "email")
    WebElement txtEmail;

    @FindBy(id = "passwd")
    WebElement txtPasswd;

    @FindBy(name = "SubmitLogin")
    WebElement botonLogin;

    private void ingresarEmail(String email){
        txtEmail.sendKeys(email);
    }
    private void ingresarPassword(String password){
        txtPasswd.sendKeys(password);
    }
    private void clickearLogin(){
        botonLogin.click();
    }

    public void Loguearse(String email,String password){
        ingresarEmail(email);
        ingresarPassword(password);
        clickearLogin();
    }

    public PaginaSignIn(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
}
