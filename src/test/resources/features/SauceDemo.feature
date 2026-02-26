#language: es

Característica: Como QE quiero automatizar la pagina
                  SauceDemo para poder entender y hacer
                  una automatizacion web

  @SAUCE-1 @HappyPath
  Escenario: Verificar el logeo correcto en la pagina SauceDemo - OK
    Dado que el usuario abre la pagina de SauceDemo
    Cuando escribo el usuario "standard_user"
    Y escribo la contraseña "secret_sauce"
    Y hago clic en el boton Login
    Entonces debo ver la pagina de productos


