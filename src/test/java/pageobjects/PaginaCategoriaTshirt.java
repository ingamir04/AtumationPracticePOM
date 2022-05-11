package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCategoriaTshirt {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    WebElement imagenProducto;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement botonAgregarACarrito;

    @FindBy(xpath = "//span[contains(text(), 'Proceed to checkout')]")
    WebElement botonProceedCheckout;

    public void comprarTshirt() throws InterruptedException {
        Thread.sleep(1000);
        Actions actions = new Actions(this.driver);
        actions.moveToElement(imagenProducto).perform();
        actions.moveToElement(imagenProducto).moveToElement(botonAgregarACarrito).click().build().perform(); //Funciona
        botonProceedCheckout.click();

    }


    public PaginaCategoriaTshirt(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
