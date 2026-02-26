package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.SauceSteps;
import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class SauceStepsDefinitions {

    @Steps
    SauceSteps sauceSteps;

    @Dado("que el usuario abre la pagina de SauceDemo")
    public void abrirSauceDemo() {
        sauceSteps.abrirSauceDemo();
    }

    @Cuando("escribo el usuario {string}")
    public void escriboElUsuario(String username){
        sauceSteps.escriboElUsuario(username);
    }

    @Y("escribo la contraseña {string}")
    public void escriboLaContraseña(String passwordT) {
        sauceSteps.escriboLaContraseña(passwordT);
    }

    @Y("hago clic en el boton Login")
    public void hagoClicenEnElBotonLogin() {
        sauceSteps.clickLogin();
    }

    @Entonces("debo ver la pagina de productos")
    public void validoLoginExitoso() {
        sauceSteps.validarIngresoExitoso();
    }
}
