package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.List;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CarritoPage extends PageObject {
    @FindBy(xpath = "//span[@data-test='shopping-cart-badge']")
    WebElementFacade iconoCarritoBadge;

    @FindBy(xpath = "//a[@data-test='shopping-cart-link']")
    WebElementFacade botonCarrito;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    List<WebElementFacade> listaProductosCarrito;

    public String obtenerCantidadCarrito() {
        return iconoCarritoBadge.getText();
    }

    public void clickIconoCarrito() {
        botonCarrito.click();
    }

    public boolean validarProductoEnCarrito(String Producto) {
        return listaProductosCarrito.stream()
                .anyMatch(elemento -> elemento.getText().equalsIgnoreCase(Producto));
    }

    public boolean esCarritoVacio() {
        return !iconoCarritoBadge.isPresent() || !iconoCarritoBadge.isVisible();
    }

    public void removerProducto(String nombreProducto) {
        String botonDataTest = "remove-" + nombreProducto.toLowerCase().replace(" ", "-");
        find(org.openqa.selenium.By.cssSelector("[data-test='" + botonDataTest + "']")).waitUntilClickable().click();
    }
}
