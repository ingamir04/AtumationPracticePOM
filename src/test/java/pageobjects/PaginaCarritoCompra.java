package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCarritoCompra {

    @FindBy(id = "uniform-cgv")
    WebElement botonTerminosCondiciones;
    @FindBy(name = "processCarrier")
    WebElement botonProccesCarrier;
    @FindBy(xpath = "//a[contains (text(),'Pay by check')]")
    WebElement botonCheckPay;
    @FindBy(xpath = "//span[contains (text(),'I confirm my order')]")
    WebElement botonConfirmarOrden;

    @FindBy(xpath = "//p//a[@title='Proceed to checkout']")
    WebElement botonSumary;

    @FindBy(name = "processAddress")
    WebElement botonAddres;
    @FindBy(xpath = "//p[contains (text(),'Your order on My Store is complete.')]")
    WebElement validacionCompraCompleta;

        //Assert.assertTrue(validacionCompra.isDisplayed());

    public void CarritoCompra() {
        botonSumary.click();
        botonAddres.click();
        botonTerminosCondiciones.click();
        botonProccesCarrier.click();
        botonCheckPay.click();
        botonConfirmarOrden.click();
    }
    public boolean resultadoOrden(String mensaje){
        System.out.println(mensaje);
        System.out.println(validacionCompraCompleta.getText());
        return mensaje.equals(validacionCompraCompleta.getText());
    }

    public PaginaCarritoCompra(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
