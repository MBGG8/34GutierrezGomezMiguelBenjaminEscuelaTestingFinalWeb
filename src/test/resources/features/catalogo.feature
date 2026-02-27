#language: es
@Regression @Catalogo
Característica: Busquedad de productos en el catálogo de SauceDemo
  Como usuario
  Quiero aplicar filtros de búsquedad en el catálogo de productos
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