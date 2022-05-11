package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PaginaPrincipal {

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    private WebElement botonSing;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    private WebElement Tshirt;

    public void irACategoriaTshirt(){
        Tshirt.click();
    }
    public void irASignIn(){
        botonSing.click();
    }

    public PaginaPrincipal(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
}
