package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;

public class CheckoutDefinitions {
    @Steps
    steps.CheckoutSteps checkoutSteps;

    @Dado("que el usuario ha iniciado sesion {string}")
    public void iniciarSesion(String usuario) {
        checkoutSteps.iniciarSesion(usuario);
    }

    @Y("tiene el producto {string} en el carrito")
    public void agregarProductoAlCarrito(String producto) {
        checkoutSteps.agregarProductoAlCarrito(producto);
    }

    @Y("navega a la pagina de checkout")
    public void navegarAlCheckout() {
        checkoutSteps.irAlCheckout();
    }

    @Cuando("ingresa sus datos de envio: Nombre {string}, Apellido {string}, Codigo Postal {string}")
    public void ingresarDatosEnvio(String nombre, String apellido, String codigoPostal) {
        checkoutSteps.completarDatosEnvio(nombre, apellido, codigoPostal);
    }

    @Y("finaliza el proceso de compra")
    public void finalizarCompra() {
        checkoutSteps.finalizarCompra();
    }

    @Entonces("deberia ver el mensaje de confirmacion {string}")
    public void validarMensajeConfirmacion(String mensaje) {
        checkoutSteps.validarMensajeConfirmacion(mensaje);
    }

    @Cuando("el usuario intenta continuar sin ingresar sus datos de envio")
    public void intentarContinuarSinDatos() {
        checkoutSteps.continuarSinDatos();
    }

    @Entonces("deberia ver el mensaje de error {string} en el formulario")
    public void validarMensajeError(String mensajeError) {
        checkoutSteps.validarMensajeError(mensajeError);
    }

    @Y("llenamos el campo de nombre {string}")
    public void llenarCampoNombre(String nombre) {
        checkoutSteps.llenarCampoNombre(nombre);
    }

    @Y("llenamos el campo de Apellido {string}")
    public void llenarCampoApellido(String apellido) {
        checkoutSteps.llenarCampoApellido(apellido);
    }
}
