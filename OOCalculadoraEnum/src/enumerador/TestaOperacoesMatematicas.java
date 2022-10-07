//Escreva um método main para teste que realize todas as operações do Enum.
//
//Dica: você pode usar o método values para iterar o Enum e executar todas as operações.
//

package enumerador;

import java.util.Scanner;

public class TestaOperacoesMatematicas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("---------------------------------");
		System.out.println("------OPERAÇÕES MATEMÁTICAS------");
		System.out.println("---------------------------------");
		System.out.println("Digite o primeiro número:");
		double primeiroNumero = leia.nextDouble();
		System.out.println("Digite o segundo número:");
		double segundoNumero = leia.nextDouble();
		System.out.println();

		for (OperacoesMatematicas operacoes : OperacoesMatematicas.values()) {
			System.out.println(primeiroNumero + " " + operacoes + " " + segundoNumero + " =" + String.format(" %.2f ", operacoes.executarOperacao(primeiroNumero, segundoNumero)));

		}

		leia.close();
	}
}
