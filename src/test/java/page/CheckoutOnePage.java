package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.saucedemo.com/checkout-step-one.html")
public class CheckoutOnePage extends PageObject {
    @FindBy(id = "checkout")
    WebElementFacade botonCheckout;

    @FindBy(id = "first-name")
    WebElementFacade inputNombre;

    @FindBy(id = "last-name")
    WebElementFacade inputApellido;

    @FindBy(id = "postal-code")
    WebElementFacade inputCodigoPostal;

    @FindBy(id = "continue")
    WebElementFacade botonContinuar;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElementFacade mensajeError;

    public void irCheckout() {
        botonCheckout.waitUntilClickable().click();
    }

    public void completarFormulario(String nombre, String apellido, String codigoPostal) {
        inputNombre.type(nombre);
        inputApellido.type(apellido);
        inputCodigoPostal.type(codigoPostal);
        botonContinuar.click();
    }

    public void validarMensajeError(String mensaje) {
        assert(mensajeError.getText().contains(mensaje));
    }

    public void llenarNombre(String nombre){
        inputNombre.type(nombre);
        botonContinuar.click();
    }

    public void llenarApellido(String apellido){
        inputApellido.type(apellido);
        botonContinuar.click();
    }
}
