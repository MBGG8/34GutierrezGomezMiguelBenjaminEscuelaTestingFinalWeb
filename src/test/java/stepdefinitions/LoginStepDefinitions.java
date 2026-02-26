package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
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

    @Entonces("deberia ver el catálogo de productos")
    public void validarIngresoExitoso(){
        loginSteps.validarIngresoExitoso();
    }

    @Entonces("debería ver un mensaje de error de usuario bloqueado")
    public void validarUsuarioBloqueado(){
        loginSteps.validarUsuarioBloqueado();
    }

    @Entonces("debería ver un mensaje de error de credenciales invalidas")
    public void validarUsuarioInexistente(){
        loginSteps.validarUsuarioInexistente();
    }



}
