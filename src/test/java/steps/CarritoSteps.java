package steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import page.CarritoPage;

public class CarritoSteps {
    @Steps
    LoginSteps loginSteps;

    @Steps
    CatalogoSteps catalogoSteps;

    @Steps
    CarritoPage carritoPage;

    @Step
    public void iniciarSesion(String tipoUsuario) {
        loginSteps.abrirSauceDemo();
        loginSteps.ingresarCredenciales(tipoUsuario);
        loginSteps.presionarClicLogin();
    }

    @Step
    public void agregarProducto(String producto) {
        catalogoSteps.agregarProducto(producto);
    }

    @Step
    public void validarCantidadCarrito(String cantidad) {
        Assert.assertEquals("La cantidad en el carrito no es la esperada",
                cantidad, carritoPage.obtenerCantidadCarrito());
    }

    @Step
    public void validarProductoEnCarrito(String producto) {
        carritoPage.clickIconoCarrito();
        Assert.assertTrue("El producto no se encuentra en el carrito",
                carritoPage.validarProductoEnCarrito(producto));
    }

    @Step
    public void validarCarritoVacio() {
        Assert.assertTrue("El icono del carrito aún muestra una cantidad",
                carritoPage.esCarritoVacio());
    }

    @Step
    public void removerProductoDesdeCatalogo(String producto) {
        catalogoSteps.removerProducto(producto);
    }

    @Step
    public void removerProductoDesdeCarrito(String producto) {
        carritoPage.removerProducto(producto);
    }

    @Step
    public void irPaginaCarrito(){
        carritoPage.clickIconoCarrito();
    }

}
