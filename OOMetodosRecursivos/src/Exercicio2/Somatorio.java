//2. Escreva um método recursivo e estático que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N

package Exercicio2;

public class Somatorio {

	public static int somar(int num) {
		if(num < 1) {
			return 0;
			
		}
			return num + somar(num - 1);
		}

	}


