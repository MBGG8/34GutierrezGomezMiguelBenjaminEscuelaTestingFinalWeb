package steps;

import net.serenitybdd.annotations.Steps;
import page.*;

public class CheckoutSteps {
    @Steps
    LoginSteps loginSteps;

    @Steps
    CheckoutOnePage checkoutOnePage;

    @Steps
    CheckoutTwoPage checkoutTwoPage;

    @Steps
    CheckoutCompletePage checkoutCompletePage;

    @Steps
    CatalogoSteps catalogoSteps;

    @Steps
    CarritoSteps carritoSteps;

    public void iniciarSesion(String tipoUsuario) {
        loginSteps.abrirSauceDemo();
        loginSteps.ingresarCredenciales(tipoUsuario);
        loginSteps.presionarClicLogin();
    }

    public void agregarProductoAlCarrito(String producto) {
        catalogoSteps.agregarProducto(producto);
    }

    public void irAlCheckout() {
        carritoSteps.irPaginaCarrito();
        checkoutOnePage.irCheckout();
    }

    public void completarDatosEnvio(String nombre, String apellido, String codigoPostal) {
        checkoutOnePage.completarFormulario(nombre,apellido,codigoPostal);
    }

    public void irAlCheckoutTwo() {
        checkoutTwoPage.irCheckoutTwo();
    }

    public void finalizarCompra() {
        checkoutTwoPage.finalizarCompra();
    }

    public void validarMensajeConfirmacion(String mensaje ){
        checkoutCompletePage.validarMensajeConfirmacion(mensaje);
    }

    public void continuarSinDatos(){
        checkoutTwoPage.continuarSinDatos();
    }

    public void validarMensajeError(String mensajeError){
      checkoutOnePage.validarMensajeError(mensajeError);
    }

    public void llenarCampoNombre(String nombre){
        checkoutOnePage.llenarNombre(nombre);
    }

    public void llenarCampoApellido(String apellido){
        checkoutOnePage.llenarApellido(apellido);
    }

}