//23. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A são pares. Se pelo menos um elemento do vetor não for par o processo de repetição para percorrer os elementos do vetor deve ser encerrado, como sugestão:
//utilize uma variável do tipo flag para atingir este propósito.

import java.util.Random;

public class Exercicio23 {
	public static void main(String[] args) {

		int[] vetorA = new int[10];
		Random random = new Random();
		
//		Segunda forma de setar os valores do vetor.
//		int[] vetorA = { 16, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = random.nextInt(10);
			
			

			if (vetorA[i] % 2 != 0) {
				
				
				break;
				
			}
			System.out.println(vetorA[i]);
		}

	}

}
