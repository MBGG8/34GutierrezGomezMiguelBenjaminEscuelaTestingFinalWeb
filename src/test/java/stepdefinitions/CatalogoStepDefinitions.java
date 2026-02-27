package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;

public class CatalogoStepDefinitions {
    @Steps
    steps.CatalogoSteps catalogoSteps;

    @Dado("que el usuario ha iniciado sesion exitosamente con {string}")
    public void loginExitoso(String tipoUsuario) {
        catalogoSteps.iniciarSesion(tipoUsuario);
    }

    @Cuando("el usuario selecciona el filtro {string}")
    public void seleccionDeFiltro(String filtro) {
        catalogoSteps.seleccionarFiltro(filtro);
    }

    @Entonces("los productos deben mostrarse ordenados por precio de menor a mayor")
    public void validarOrdenAscendente() {
        catalogoSteps.validarPreciosAscendente();
    }

    @Entonces("los productos deben mostrarse ordenados por precio de mayor a menor")
    public void validarOrdenDescendente() {
        catalogoSteps.validarPreciosDescendente();
    }
}
