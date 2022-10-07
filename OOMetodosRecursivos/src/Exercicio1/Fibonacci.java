//Escreva um método recursivo e estático que calcule e retorne o N-ésimo termo da sequência Fibonacci. Alguns números desta sequência são: 0, 1,1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

package Exercicio1;

public class Fibonacci {

	public static int calculaFibonacci(int num) {
		if (num < 2) {
			return 1;
		}
		return calculaFibonacci(num - 1) + calculaFibonacci(num - 2);
	}

}
