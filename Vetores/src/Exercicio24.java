//24. Números palíndromos são aqueles que escritos da direita para a
//esquerda têm o mesmo valor quando escritos da esquerda para a
//direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
//programa que verifique se um dado vetor A de 10 elementos inteiros é
//um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
//último, se o segundo elemento do vetor é igual ao penúltimo e assim
//por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.

public class Exercicio24 {
	public static void main(String[] args) {

		int[] vetorA = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };
		boolean palindromo = true;

		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;

				break;

			}
		}

		if (palindromo) {

			System.out.println("É palíndromo.");
		} else {

			System.out.println("Não é palíndromo.");
		}
	}
}
