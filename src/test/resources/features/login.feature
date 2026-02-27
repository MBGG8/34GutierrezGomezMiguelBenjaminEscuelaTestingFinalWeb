#language: es

@Regression @login
Característica: Inicio de sesión en SauceDemo
  Como usuario
  Quiero iniciar sesión en la tienda de SauceDemo
  Para acceder al catálogo de productos

  Antecedentes:
    Dado que el usuario navega a la pagina de SauceDemo

  @Login @HappyPath
  Escenario: Inicio de sesión exitoso con usuario estandar
    Cuando ingresa sus credenciales de "standard_user"
    Y hago clic en el boton Login
    Entonces debería ver el título de la página catálogo "Products"

  @Logout @HappyPath
  Escenario: Cerrar mi sesión en SauceDemo
    Cuando ingresa sus credenciales de "standard_user"
    Y hago clic en el boton Login
    Y presiona clic en el ícono de menú
    Y hace clic en Logout
    Entonces debería ver el titulo de la página de Login "Swag Labs"

  @UsuarioBloqueado @UnHappyPath
  Escenario: Inicio de sesión con usuario bloqueado
    Cuando ingresa sus credenciales de "locked_out_user"
    Y hago clic en el boton Login
    Entonces debería ver un mensaje de error de usuario bloqueado

  @UsuarioInexistente @UnHappyPath
  Escenario: Inicio de sesión con credenciales inválidas
    Cuando ingresa sus credenciales de "invalid_user"
    Y hago clic en el boton Login
    Entonces debería ver un mensaje de error de credenciales invalidas

  @CamposVacios @UnHappyPath
  Esquema del escenario: Validación de campos vacíos en login
    Dado que el usuario navega a la pagina de SauceDemo
    Cuando ingresa el usuario "<username>"
    Y ingresa la contraseña "<password>"
    Y hago clic en el boton Login
    Entonces debería ver un mensaje de error "<mensajeError>"

    Ejemplos:
      | username        | password      | mensajeError          |
      |                 |               | Username is required  |
      |                 | password      | Username is required  |
      | user            |               | Password is required  |