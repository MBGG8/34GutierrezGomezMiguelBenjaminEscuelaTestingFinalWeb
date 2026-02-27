package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class CatalogoPage extends PageObject {

    @FindBy(xpath = "//select[@data-test='product-sort-container']")
    WebElementFacade filtroDropdown;

    @FindBy(xpath = "//div[@data-test='inventory-item-price']")
    List<WebElementFacade> listaDePrecios;

    public void seleccionarFiltro(String filtro) {
        filtroDropdown.waitUntilVisible().click();
        filtroDropdown.selectByVisibleText(filtro);
    }

    public List<Double> obtenerPrecioDeProductos() {
        return listaDePrecios.stream()
                .map(price -> Double.parseDouble(price.waitUntilVisible().getText().replace("$", "")))
                .collect(Collectors.toList());
    }

    public boolean validarPreciosAscendentes() {
        List<Double> prices = obtenerPrecioDeProductos();
        List<Double> listaAscendente = new ArrayList<>(prices);
        Collections.sort(listaAscendente);
        return prices.equals(listaAscendente);
    }

    public boolean validarPreciosDescendentes() {
        List<Double> prices = obtenerPrecioDeProductos();
        List<Double> listaDescendente = new ArrayList<>(prices);
        Collections.sort(listaDescendente, Collections.reverseOrder());
        return prices.equals(listaDescendente);
    }

    public void agregarProducto(String nombreProducto) {
        String botonDataTest = "add-to-cart-" +
                nombreProducto.toLowerCase().replace(" ", "-");
        find(org.openqa.selenium.By.cssSelector("[data-test='" + botonDataTest + "']"))
                .waitUntilClickable()
                .click();
    }

    public void removerProducto(String nombreProducto) {
        String botonDataTest = "remove-" + nombreProducto.toLowerCase().replace(" ", "-");
        find(org.openqa.selenium.By.cssSelector("[data-test='" + botonDataTest + "']"))
                .waitUntilClickable()
                .click();
    }
}
