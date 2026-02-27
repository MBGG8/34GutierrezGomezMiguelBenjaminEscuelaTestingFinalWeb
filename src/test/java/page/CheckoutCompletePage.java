package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.saucedemo.com/checkout-complete.html")
public class CheckoutCompletePage extends PageObject {
    @FindBy(className = "complete-header")
    WebElementFacade mensajeConfirmacion;

    public void validarMensajeConfirmacion(String mensaje) {
        assert(mensajeConfirmacion.getText().contains(mensaje));
    }
}
