#language: es
@Regression @Catalogo
Característica: Filtros del catálogo de productos de SauceDemo
  Como cliente
  Quiero aplicar filtros de búsqueda en el catálogo de productos
  Para localizar el producto que estoy buscando

  Antecedentes:
    Dado que el usuario ha iniciado sesion exitosamente con "standard_user"

  @FiltrarPrecioAscendente @Happypath
  Escenario: Filtrar productos por precio de menor a mayor
    Cuando el usuario selecciona el filtro "Price (low to high)"
    Entonces los productos deben mostrarse ordenados por precio de menor a mayor


  @FiltrarPrecioDescendente @Happypath
  Escenario: Filtrar productos por precio de mayor a menor
    Cuando el usuario selecciona el filtro "Price (high to low)"
    Entonces los productos deben mostrarse ordenados por precio de mayor a menor

