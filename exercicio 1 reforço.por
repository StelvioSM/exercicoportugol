programa
{
	
	funcao inicio()
	{
	/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.*/
           
            real peso,excesso,multa
            escreva(" qual o valor do peso ")
            leia ( peso) 

            se (peso>50)
            {
            	excesso=peso-50
            	escreva("o valor do excesso e :",excesso,"\n")
            	multa=excesso*4.0
            	escreva("o valor da multa :",multa,"\n")
            	
	       }

	       senao{
	       	excesso=0
	       	escreva("o valor do excesso e :",excesso,"\n")
	          multa=0
	          escreva("multa :",multa,"\n")
	       	
	       }


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1084; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */