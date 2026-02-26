package steps;

import net.serenitybdd.annotations.Step;
import net.thucydides.model.util.EnvironmentVariables;
import page.LoginSaucePage;

public class LoginSteps {
    private EnvironmentVariables environmentVariables;
    LoginSaucePage loginSaucePage;

    @Step
    public void abrirSauceDemo() {
        loginSaucePage.open();
    }

    @Step
    public void ingresarCredenciales(String tipoUsuario){
        String username = environmentVariables.getProperty("credentials." + tipoUsuario + ".username");
        String password = environmentVariables.getProperty("credentials." + tipoUsuario + ".password");

        loginSaucePage.enterUsername(username);
        loginSaucePage.enterPassword(password);
        loginSaucePage.clickLogin();

    }

    @Step
    public void validarIngresoExitoso() {
        loginSaucePage.validarTituloProducts();
    }

    @Step
    public void validarUsuarioBloqueado(){
        loginSaucePage.validarUsuarioBloqueado();
    }

    @Step
    public void validarUsuarioInexistente(){
        loginSaucePage.validarUsuarioInexistente();
    }
}
