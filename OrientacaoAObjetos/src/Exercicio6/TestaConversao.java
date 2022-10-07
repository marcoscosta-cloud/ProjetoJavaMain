package Exercicio6;

import java.util.Scanner;

public class TestaConversao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;

		System.out.println("Digite um número para executar as conversões abaixo:");
		double numero = leia.nextDouble();

		do {

			System.out.println();

			System.out.println("Escolha a conversão desejada:");
			System.out.println("1 - Minuto(s) para segundo(s)");
			System.out.println("2 - Hora(s) para minuto(s)");
			System.out.println("3 - Dia(s) para hora(s)");
			System.out.println("4 - Semana(s) para dia(s)");
			System.out.println("5 - Mês(es) para dia(s)");
			System.out.println("6 - Ano(s) para dia(s)");
			System.out.println("7 - Sair");
			opcao = leia.nextInt();

			System.out.println();

			switch (opcao) {

			case 1:
				ConversaoDeUnidadesDeTempo.converteMinuto(numero);
				System.out.println("A conversão de " + numero + " minuto(s) para segundo(s) será de: "
						+ ConversaoDeUnidadesDeTempo.converteMinuto(numero) + " segundo(s).");

				break;

			case 2:
				ConversaoDeUnidadesDeTempo.converteHora(numero);
				System.out.println("A conversão de " + numero + " hora(s) para minuto(s) será de: "
						+ ConversaoDeUnidadesDeTempo.converteHora(numero) + " minuto(s).");

				break;

			case 3:
				ConversaoDeUnidadesDeTempo.converteDia(numero);
				System.out.println("A conversão de " + numero + " dia(s) para hora(s) será de: "
						+ ConversaoDeUnidadesDeTempo.converteDia(numero) + " hora(s).");

				break;

			case 4:
				ConversaoDeUnidadesDeTempo.converteSemana(numero);
				System.out.println("A conversão de " + numero + " semana(s) para dia(s) será de: "
						+ ConversaoDeUnidadesDeTempo.converteSemana(numero) + " dia(s).");

				break;

			case 5:
				ConversaoDeUnidadesDeTempo.converteMes(numero);
				System.out.println("A conversão de " + numero + " mês(es) para dia(s) será de: "
						+ ConversaoDeUnidadesDeTempo.converteMes(numero) + " dia(s).");

				break;

			case 6:
				ConversaoDeUnidadesDeTempo.converteAno(numero);
				System.out.println("A conversão de " + numero + " ano(s) para dia(s) será de: "
						+ ConversaoDeUnidadesDeTempo.converteAno(numero) + " dia(s).");

				break;

			case 7:
				System.out.println("Programa encerrado com sucesso, PEIXE!!!!!");

				break;

			default:
				System.out.println("Opção inválida PEIXE, tente novamente");

				break;
			}
		} while (opcao != 7);

		leia.close();
	}
}
