# language: es
@Regression @Checkout
Característica: Proceso de pago (Checkout) de productos

  Antecedentes:
    Dado que el usuario ha iniciado sesion "standard_user"
    Y tiene el producto "Sauce Labs Backpack" en el carrito
    Y navega a la pagina de checkout

  @CompraExitosa @HappyPath
  Escenario: Realizar una compra exitosa con datos de envio validos
    Cuando ingresa sus datos de envio: Nombre "Miguel", Apellido "Gutierrez", Codigo Postal "13001"
    Y finaliza el proceso de compra
    Entonces deberia ver el mensaje de confirmacion "Thank you for your order!"

  @CheckoutSinDatos @UnhappyPath
  Escenario: Intentar continuar el checkout dejando los campos vacios
    Cuando el usuario intenta continuar sin ingresar sus datos de envio
    Entonces deberia ver el mensaje de error "Error: First Name is required" en el formulario
    Y llenamos el campo de nombre "Miguel"
    Entonces deberia ver el mensaje de error "Error: Last Name is required" en el formulario
    Y llenamos el campo de Apellido "Gutierrez"
    Entonces deberia ver el mensaje de error "Error: Postal Code is required" en el formulario
