//38. Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento de B deverá ser o seguinte
//somatório: Bi = Somatório de Aj, para todo j variando de i até 10.

import java.util.Scanner;

public class Exercicio38 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		for (int j = 0; j < vetorA.length; j++) {
			System.out.println("Informe o valor do elemento:");
			vetorA[j] = leia.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = i; j < 10; j++) {
				vetorB[i] = vetorB[i] + vetorA[j];
			}
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor B[" + i + "] = " + vetorB[i]);
		}
		leia.close();
	}

}
