//13.Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.

import java.util.Random;

public class Exercicio13 {
	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int soma = 0;
		Random random = new Random();

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(100);

			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];

			}

		}
		System.out.println("A soma dos elementos do vetor A é: " + soma);
	}
}
