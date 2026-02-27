package steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import page.CatalogoPage;

public class CatalogoSteps {
    @Steps
    LoginSteps loginSteps;

    @Steps
    CatalogoPage catalogoPage;

    @Step
    public void iniciarSesion(String tipoUsuario) {
        loginSteps.abrirSauceDemo();
        loginSteps.ingresarCredenciales(tipoUsuario);
        loginSteps.presionarClicLogin();
    }

    @Step
    public void seleccionarFiltro(String filtro) {
        catalogoPage.seleccionarFiltro(filtro);
    }

    @Step
    public void validarPreciosAscendente() {
        Assert.assertTrue("Los productos NO están ordenados de menor a mayor",
                catalogoPage.validarPreciosAscendentes());
    }

    @Step
    public void validarPreciosDescendente() {
        Assert.assertTrue("Los productos NO están ordenados de mayor a menor",
                catalogoPage.validarPreciosDescendentes());
    }
    @Step
    public void agregarProducto(String producto) {
        catalogoPage.agregarProducto(producto);
    }

    @Step
    public void removerProducto(String producto) {
        catalogoPage.removerProducto(producto);
    }
}
