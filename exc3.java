package PrimeiroExercicio;
//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de

//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for=-99. (WHILE)

import java.util.Scanner;

public class exc3 {
	public static void main(String[] args) {

		int idade, a21 = 0, b50 = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();

		while (idade != -99) {
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			if (idade < 21) {
				a21++;

			}
			if (idade > 50) {
				b50++;

			}

		}
		System.out.println("\nPessoas com menos de 21 anos: " + a21);
		System.out.println("\nPessoas com mais de 50 anos : " + b50);
	}

}