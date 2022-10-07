//29. Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo este a junção dos dois outros vetores. Os primeiros 10
//elementos de C deverão receber os elementos de A e os últimos
//elementos C deverão receber os elementos de B. Desta forma, C
//deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.

import java.util.Random;

public class Exercicio29 {
	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[20];

		Random random = new Random();

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(100);
			vetorC[i] = vetorA[i];
		}

		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = random.nextInt(100);
			vetorC[vetorA.length + i] = vetorB[i];
		}

		for (int i = 0; i < vetorC.length; i++) {
			System.out.println("VetorC na posição " + (i + 1) + " é:" + vetorC[i]);

		}

	}
}
