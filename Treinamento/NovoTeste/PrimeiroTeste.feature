@AbrirHomePageScrollDownAndUp
Feature: HomePage descer e subir a pagina
           Validar se a a HomePage é aberta e a pagina desce até o final e sobe novamente
           
@AbrirHomePageScrollDownAndUp1
 Scenario: HomePage scenario - Validar se a HomePage é aberta e a pagina desce até o final e sobe novamente
  Given estou na principal
 	Then tela desce até o final
  And tela sobe até o começo
  