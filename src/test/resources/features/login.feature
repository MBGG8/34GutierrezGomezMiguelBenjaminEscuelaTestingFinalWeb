#language: es

@Regression
Característica: Inicio de sesión en SauceDemo
  Como usuario
  Quiero iniciar sesión en la tienda de SauceDemo
  Para acceder al catálogo de productos

  Antecedentes:
    Dado que el usuario navega a la pagina de SauceDemo

  @LoginExitoso @HappyPath
  Escenario: Inicio de sesión exitoso con usuario estandar
    Cuando ingresa sus credenciales de "standard_user"
    Entonces deberia ver el catálogo de productos

  @UsuarioBloqueado @UnHappyPath
  Escenario: Inicio de sesión con usuario bloqueado
    Cuando ingresa sus credenciales de "locked_out_user"
    Entonces debería ver un mensaje de error de usuario bloqueado

  @UsuarioInexistente @UnHappyPath
  Escenario: Inicio de sesión con usuario no registrado
    Cuando ingresa sus credenciales de "invalid_user"
    Entonces debería ver un mensaje de error de credenciales invalidas

