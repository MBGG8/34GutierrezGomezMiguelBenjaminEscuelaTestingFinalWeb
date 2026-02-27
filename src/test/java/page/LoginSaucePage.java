package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com")
public class LoginSaucePage extends PageObject {

    @FindBy(id = "user-name")
    WebElementFacade username;

    @FindBy(id = "password")
    WebElementFacade password;

    @FindBy(id = "login-button")
    WebElementFacade loginButton;

    @FindBy(id = "react-burger-menu-btn")
    WebElementFacade IconMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElementFacade logoutButton;

    @FindBy(className = "title")
    WebElementFacade titulo;

    @FindBy(xpath = "//div[@class='login_logo']")
    WebElementFacade tituloLogoHome;

    @FindBy(xpath =  "//h3[@data-test='error']")
    WebElementFacade error;

    public void enterUsername(String usernameText){
        username.type(usernameText);
    }

    public void enterPassword(String passwordText){
        password.type(passwordText);
    }

    public void clickLogin(){
        loginButton.click();
    }

    public void clickMenu(){
        IconMenu.click();
    }

    public void clickLogout(){
        logoutButton.click();
    }

    public void validarTituloProducts(String title){
        titulo.shouldContainText(title);
    }

    public void validarTituloLogoHome(String title){
        tituloLogoHome.shouldContainText(title);
    }

    public void validarUsuarioBloqueado(){
        error.shouldContainText("locked out");
    }

    public void validarUsuarioInexistente(){
        error.shouldContainText("do not match any user");
    }

    public void validarCamposVacios(String mensajeError){
        error.shouldContainText(mensajeError);
    }
}
