package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.CarritoSteps;

public class CarritoDefinitions {
    @Steps
    CarritoSteps carritoSteps;

    @Dado("que el usuario ha iniciado sesion con {string}")
    public void loginExitoso(String tipoUsuario) {
        carritoSteps.iniciarSesion(tipoUsuario);
    }

    @Dado("que el usuario agrega el producto {string} al carrito")
    @Cuando("el usuario agrega el producto {string} al carrito")
    public void agregarProducto(String producto) {
        carritoSteps.agregarProducto(producto);
    }

    @Entonces("el icono del carrito debe mostrar {string}")
    public void validarCantidadCarrito(String cantidad) {
        carritoSteps.validarCantidadCarrito(cantidad);
    }

    @Y("el producto {string} debe visualizarse en la pagina del carrito")
    public void validarProductoEnCarrito(String producto) {
        carritoSteps.validarProductoEnCarrito(producto);
    }

    @Cuando("el usuario remueve el producto {string} desde el catalogo")
    public void removerProductoDesdeCatalogo(String producto) {
        carritoSteps.removerProductoDesdeCatalogo(producto);
    }

    @Cuando("el usuario remueve el producto {string} desde el carrito")
    public void removerProductoDesdeCarrito(String producto) {
        carritoSteps.removerProductoDesdeCarrito(producto);
    }

    @Entonces("el icono del carrito no debe mostrar ninguna cantidad")
    public void validarCarritoVacio() {
        carritoSteps.validarCarritoVacio();
    }

    @Y("presiona clic en el ícono de carrito")
    public void irPaginaCarrito(){
        carritoSteps.irPaginaCarrito();
    }
}
