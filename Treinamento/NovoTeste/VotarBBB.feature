@VotarBBB
Feature: BBB
           
@VotarBBB1
 Scenario: BBB - Votar na saida da Manu
Given estou na pagina principal de votacao
|CT		                   	|Cenário				|topico	|  
|CTBBB01									|Votando Manu		|BBB		|
When clico no icone da Manu

#And clico no botao de pesquisa
#Then um novo browser é aberto com a resposta
And browser finaliza 