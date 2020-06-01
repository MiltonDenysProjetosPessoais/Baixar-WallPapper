@BuscarCepCorreios
Feature: Cep Correios
           
@BuscarCepCorreios1
 Scenario: Cep Correios - Validar a busca de um cep do correio e validar 
Given estou na pagina principal dos correios
|CT		                   		|Cep							|Cenário				|topico	|  
|CT11223344									|		06210070		 	|paginacliente	|CEP		|
|														|									|								|				|
When preencho o campo com um 'cep' valido
And clico no botao de pesquisa
Then um novo browser é aberto com a resposta
And browser finaliza 