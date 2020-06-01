@ClicarTodosPrimeirosBotoes
Feature: Pagina do cliente clicar nos botoes da primeira linha
           Validar se é possível clicar em todos os botoes na primeira linha da pagina 
           
@ClicarTodosPrimeirosBotoes1
 Scenario: Pagina do cliente scenario - Validar se é possível clicar em todos os paises para trocar a lingua da page
Given estou na pagina do cliente do site da allianz
|Botao                   		|CT								|topico					|  
|Para Voce									|CT112233445566 	|paginacliente	|
|Para Seus Negocios					|									|								|
|Para Corretores						|									|								|
|Para Prestadores						|									|								|
|Sobre a Allianz						|									|								|
|Contato										|									|								|
When clico em todos os 'botoes' na primeira fila validando se esta correto
Then browser se fecha