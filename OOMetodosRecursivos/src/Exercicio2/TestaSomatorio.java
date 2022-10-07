package Exercicio2;

import java.util.Scanner;

public class TestaSomatorio {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe até qual número deseja que chegue a soma:");
		int numero = leia.nextInt();

		System.out.println("A somatória será:" + Somatorio.somar(numero));

		System.out.println();

		for (int i = 1; i <= numero; i++) {
			if (i != numero) {
				System.out.print(i + " + ");

			} else {
				System.out.println(i);
			}
			leia.close();
		}

	}
}
