//42. Ler 10 elementos inteiros em um vetor A e colocá-los em ordem
//crescente e apresentar os elementos ordenados.

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio42 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º numero:");
			vetorA[i] = leia.nextInt();

		}

		Arrays.sort(vetorA);

		System.out.println();

		System.out.println("Ordem crescente");
		for (int j = 0; j < vetorA.length; j++) {

			System.out.println(vetorA[j]);
		}

		leia.close();
	}

}
