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
    }

    @Step
    public void ingresarUsername(String username){
        loginSaucePage.enterUsername(username);
    }

    @Step
    public void ingresarPassword(String password){
        loginSaucePage.enterPassword(password);
    }

    @Step
    public void presionarClicLogin() {
        loginSaucePage.clickLogin();
    }

    @Step
    public void presionarClicMenu() {
        loginSaucePage.clickMenu();
    }

    @Step
    public void presionarClicLogout() {
        loginSaucePage.clickLogout();
    }


    @Step
    public void validarIngresoExitoso(String title) {
        loginSaucePage.validarTituloProducts(title);
    }

    @Step
    public void validarLogoutExitoso(String title) {
        loginSaucePage.validarTituloLogoHome(title);
    }

    @Step
    public void validarUsuarioBloqueado(){
        loginSaucePage.validarUsuarioBloqueado();
    }

    @Step
    public void validarUsuarioInexistente(){
        loginSaucePage.validarUsuarioInexistente();
    }

    @Step
    public void validarCamposVacios(String mensajeError){
        loginSaucePage.validarCamposVacios(mensajeError);
    }
}
