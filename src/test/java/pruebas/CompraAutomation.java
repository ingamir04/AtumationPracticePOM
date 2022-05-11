package pruebas;

import org.junit.Assert;
import org.junit.Test;


public class CompraAutomation  extends TestSuite{

    @Test
    public void comprarRopa() throws InterruptedException {

        paginaPrincipal.irASignIn();
        signIn.Loguearse("amirr10c@gmail.com","0123456789");
        paginaPrincipal.irACategoriaTshirt();
        paginaCategoriaTshirt.comprarTshirt();
        paginaCarritoCompra.CarritoCompra();
        Assert.assertTrue(paginaCarritoCompra.resultadoOrden("Your order on My Store is complete."));

        /*
        WebElement validacionCompra = driver.findElement(By.xpath("//p[contains (text(),'Your order on My Store is complete.')]"));
        Assert.assertTrue(validacionCompra.isDisplayed());
         */


    }

}
