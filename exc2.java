package PrimeiroExercicio;

import java.util.Scanner;

public class exc2 { 
	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int numero,impar=0,pares=0;
		
		int a,b,c;
		Scanner leia = new Scanner(System.in);
		for(a=1;a<=10;a++) {
			
			System.out.println("\nDigite um numero: ");
			numero = leia.nextInt();
			
			if(numero%2==0) {
				pares++;
			}
				else {
					impar++;
					
				}
			}
			System.out.println("Numeros pares: " +pares);
			System.out.println("Numeros impares " +impar);
			
		}
	
}




