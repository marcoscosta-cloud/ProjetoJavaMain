package Exercicio1;

import java.util.Scanner;

public class TestaFibonacci {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe até qual número deseja chegar com a sequência Fibonacci:");
		int numero = leia.nextInt();
		
		System.out.println();

		System.out.println("A sequência Fibonacci será conforme abaixo:");

		for (int i = 0; i < numero; i++) {

			System.out.println(Fibonacci.calculaFibonacci(i) + " ");

		}
		leia.close();
	}

}
