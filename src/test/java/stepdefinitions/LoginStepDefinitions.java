package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.LoginSteps;

public class LoginStepDefinitions {
    @Steps
    LoginSteps loginSteps;

    @Dado("que el usuario navega a la pagina de SauceDemo")
    public void navegarASauceDemoPage(){
        loginSteps.abrirSauceDemo();
    }

    @Cuando("ingresa sus credenciales de {string}")
    public void ingresarCredenciales(String tipoUsuario){
        loginSteps.ingresarCredenciales(tipoUsuario);
    }

    @Cuando("ingresa el usuario {string}")
    public void ingresarUsuario(String string) {
        loginSteps.ingresarUsername(string);
    }

    @Y("ingresa la contraseña {string}")
    public void ingresarPassword(String password) {
        loginSteps.ingresarPassword(password);
    }

    @Y("hago clic en el boton Login")
    public void hacerClicLogin(){
        loginSteps.presionarClicLogin();
    }

    @Y("presiona clic en el ícono de menú")
    public void hacerClicMenu(){
        loginSteps.presionarClicMenu();
    }

    @Y("hace clic en Logout")
    public void hacerClicLogout(){
        loginSteps.presionarClicLogout();
    }

    @Entonces("debería ver el título de la página catálogo {string}")
    public void validarIngresoExitoso(String title){
        loginSteps.validarIngresoExitoso(title);
    }

    @Entonces("debería ver el titulo de la página de Login {string}")
    public void validarLogoutExitoso(String title){
        loginSteps.validarLogoutExitoso(title);
    }

    @Entonces("debería ver un mensaje de error de usuario bloqueado")
    public void validarUsuarioBloqueado(){
        loginSteps.validarUsuarioBloqueado();
    }

    @Entonces("debería ver un mensaje de error de credenciales invalidas")
    public void validarUsuarioInexistente(){
        loginSteps.validarUsuarioInexistente();
    }

    @Entonces("debería ver un mensaje de error {string}")
    public void validarCamposVacios(String mensajeError){
        loginSteps.validarCamposVacios(mensajeError);
    }
}
