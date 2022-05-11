package pruebas;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageobjects.PaginaCategoriaTshirt;
import pageobjects.PaginaCarritoCompra;
import pageobjects.PaginaPrincipal;
import pageobjects.PaginaSignIn;

import java.util.concurrent.TimeUnit;

public class TestSuite {

    protected WebDriver driver;
    protected PaginaPrincipal paginaPrincipal;
    protected PaginaSignIn signIn;
    protected PaginaCategoriaTshirt paginaCategoriaTshirt;
    protected PaginaCarritoCompra paginaCarritoCompra;

    private void inicializarPaginas(WebDriver driver){
        paginaPrincipal = new PaginaPrincipal(driver);
        signIn = new PaginaSignIn(driver);
        paginaCategoriaTshirt = new PaginaCategoriaTshirt(driver);
        paginaCarritoCompra = new PaginaCarritoCompra(driver);
    }

    @Before
    public void configuracionDriver(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("marionette", false);
        //Nueva instacia de ChromeDriver
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //Espera de objetos
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        inicializarPaginas(driver);

        driver.get("http://automationpractice.com/index.php");
    }
    @After
    public void cerrarDriver(){
        driver.quit();
    }
}
