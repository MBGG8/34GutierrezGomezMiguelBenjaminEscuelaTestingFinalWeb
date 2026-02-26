package steps;

import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Step;
import page.SaucePage;

public class SauceSteps {
    SaucePage saucePage;

    @Step
    public void abrirSauceDemo() {
        saucePage.open();
    }

    public void escriboElUsuario(String username) {
        saucePage.enterUsername(username);
    }

    public void escriboLaContraseña(String password) {
        saucePage.enterPassword(password);
    }

    public void clickLogin() {
        saucePage.clickLogin();
    }

    @Step
    public void validarIngresoExitoso() {
        saucePage.validarTituloProducts();
    }
}
