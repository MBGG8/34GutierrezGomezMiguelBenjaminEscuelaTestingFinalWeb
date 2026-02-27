package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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

        // Creamos una copia de la lista original y la ordenamos de mayor a menor
        List<Double> listaDescendente = new ArrayList<>(prices);
        Collections.sort(listaDescendente, Collections.reverseOrder());

        // Comparamos si la lista original coincide con la lista ordenada ideal
        return prices.equals(listaDescendente);
    }


}
