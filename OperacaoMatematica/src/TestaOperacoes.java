import java.util.Scanner;

public class TestaOperacoes {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("----CALCULADORA----");
		System.out.println("-------------------");
		System.out.println("Informe o primeiro número:");
		int primeiroNumero = leia.nextInt();
		System.out.println("Informe o segundo número:");
		int segundoNumero = leia.nextInt();
		int opcao = 0;
		do {

			System.out.println("Escolha a operação desejada:");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTRAÇÃO");
			System.out.println("3 - MULTIPLICAÇÃO");
			System.out.println("4 - DIVISÃO");
			System.out.println("5 - SAIR");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				OperacaoMatematica soma = new Soma();
				soma.calcula(primeiroNumero, segundoNumero);

				break;

			case 2:
				OperacaoMatematica subtracao = new Subtracao();
				subtracao.calcula(primeiroNumero, segundoNumero);

				break;

			case 3:
				OperacaoMatematica multiplicacao = new Multiplicacao();
				multiplicacao.calcula(primeiroNumero, segundoNumero);

				break;

			case 4:
				OperacaoMatematica divisao = new Divisao();
				divisao.calcula(primeiroNumero, segundoNumero);

				break;
				
			case 5:
				System.out.println("Sistema finalizado com sucesso!!!!!");

				break;

			default:

				System.out.println("Opção inválida. Tente novamente!!!");

				break;
			}

		} while (opcao != 5);

		leia.close();

	}

}
