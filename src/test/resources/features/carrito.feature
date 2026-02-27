#language: es
@Regression @Carrito
Característica: Selección de productos a comprar en SauceDemo
  Como usuario
  Quiero agregar y remover productos del carrito
  Para realizar una compra

  Antecedentes:
    Dado que el usuario ha iniciado sesion con "standard_user"

  @AgregarProducto @HappyPath
  Escenario: Agregar un producto al carrito exitosamente
    Cuando el usuario agrega el producto "Sauce Labs Backpack" al carrito
    Entonces el icono del carrito debe mostrar "1"
    Y el producto "Sauce Labs Backpack" debe visualizarse en la pagina del carrito

  @RemoverProducto @HappyPath
  Escenario: Remover un producto previamente agregado
    Dado que el usuario agrega el producto "Sauce Labs Bike Light" al carrito
    Cuando el usuario remueve el producto "Sauce Labs Bike Light" desde el catalogo
    Entonces el icono del carrito no debe mostrar ninguna cantidad

  @RemoverProducto @HappyPath
  Escenario: Remover un producto previamente agregado
    Dado que el usuario agrega el producto "Sauce Labs Bolt T-Shirt" al carrito
    Y presiona clic en el ícono de carrito
    Cuando el usuario remueve el producto "Sauce Labs Bolt T-Shirt" desde el carrito
    Entonces el icono del carrito no debe mostrar ninguna cantidad