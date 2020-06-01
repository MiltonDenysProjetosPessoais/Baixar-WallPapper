@ClicarPaises
Feature: HomePage clicar na opcao Espanha
           Validar se é possível clicar na opcao Espanha para trocar a lingua da page
           
@ClicarPaises1
 Scenario: HomePage clicar na opcao Espanha scenario - Validar se é possível clicar na opcao Espanha para trocar a lingua da page
  Given estou na pagina principal
  When clico na opcao Espanha 
 	Then deve me aparecer as opcoes na lingua escolhida
  And tela é fechada
  