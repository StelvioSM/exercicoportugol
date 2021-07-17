package PrimeiroExercicio;

import java.util.Scanner;

//Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)

public class exc6 {
	public static void main(String[] args) {

		int x=1, multiplo = 0, media = 0, soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nEscreva um numero: ");
			x = leia.nextInt();

			if (x % 3 == 0.0) {
				soma = soma + x;
				multiplo++;

			}
		} 
		while (x != 0);
                        
		  media = soma / multiplo;
		   System.out.println("\nA media dos multipolos de 3: " +media);
	}

}
