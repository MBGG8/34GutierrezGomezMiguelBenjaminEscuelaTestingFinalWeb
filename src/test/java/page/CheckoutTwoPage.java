package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.saucedemo.com/checkout-step-two.html")
public class CheckoutTwoPage extends PageObject {
    @FindBy(id = "finish")
    WebElementFacade botonFinalizar;

    @FindBy(id = "continue")
    WebElementFacade botonContinuar;

    public void irCheckoutTwo() {
        botonFinalizar.waitUntilClickable().click();
    }

    public void finalizarCompra() {
        botonFinalizar.waitUntilClickable().click();
    }

    public void continuarSinDatos() {
        botonContinuar.click();
    }

}
