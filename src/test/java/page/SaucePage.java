package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com")
public class SaucePage extends PageObject {

    @FindBy(id = "user-name")
    WebElementFacade username;

    @FindBy(id = "password")
    WebElementFacade password;

    @FindBy(id = "login-button")
    WebElementFacade loginButton;

    @FindBy(className = "title")
    WebElementFacade titulo;

    public void enterUsername(String usernameText){
        username.type(usernameText);
    }

    public void enterPassword(String passwordText){
        password.type(passwordText);
    }

    public void clickLogin(){
        loginButton.click();
    }

    public void validarTituloProducts(){
        titulo.shouldContainText("Productos");
    }
}
