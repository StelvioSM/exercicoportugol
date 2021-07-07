package PrimeiroExercicio;

import java.util.Scanner;

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*\
 * 
 */
public class arrys3 {
	
	public static void main(String[] args) {
		  float [][] valor = new float [3][3];
	        int linha=0,coluna=0,cont=0;

	        Scanner leia = new Scanner(System.in);

	        for(linha=0;linha<3;linha++)
	        {

	            for(coluna=0;coluna<3;coluna++)
	            {
	                System.out.println("\n digite um valor: ");
	                valor[linha][coluna] = leia.nextFloat();

	                if(valor[linha][coluna]>10)
	                {
	                    cont++;
	                }
	            }
	        }

	        System.out.println("\n Os valores maiores que 10 serão: "+cont);

	    }

	}
