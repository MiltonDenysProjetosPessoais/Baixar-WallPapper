@ClicarTodosPaises
Feature: HomePage clicar em todos os paises
           Validar se é possível clicar em todos os paises para trocar a lingua da page
           
@ClicarTodosPaises1
 Scenario: HomePage clicar em todos os paises scenario - Validar se é possível clicar em todos os paises para trocar a lingua da page
Given estou na pagina principal do site da allianz
|Botao                   		|CT								|topico	|  
|Home												|CT1234567891233 	|teste	|
|Espanha										|									|				|
|Portugal										|									|				|
|Colombia										|									|				|
|Brasil											|									|				|

When clico em todos os 'paises' validando se esta correto
Then tela se fecha
 