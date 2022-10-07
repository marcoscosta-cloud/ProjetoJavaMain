import java.util.Scanner;

public class TestaConta {

	public int escolha;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("===================");
		System.out.println("    BEM VINDO(A)   ");
		System.out.println("===================");

		System.out.println("Escolha a opção desejada.");
		System.out.println("1- Criar conta.");
		System.out.println("2- Consultar conta.");

		int escolha = scanner.nextInt();

		int tipoconta;
		if (escolha == 1) {

			System.out.println("Qual o tipo de conta?");
			System.out.println("1-Conta Corrente");
			System.out.println("2-Conta Poupança");
			tipoconta = scanner.nextInt();

			System.out.println("Qual o número da conta?");
			String numeroConta = scanner.next();

			System.out.println("Qual o seu nome?");
			scanner.nextLine();
			String cliente = scanner.nextLine();

			System.out.println("Qual o seu cpf?");
			String cpf = scanner.nextLine();
			
			switch (tipoconta) {
			case 1:
				ContaCorrente cc = new ContaCorrente(numeroConta, cliente, cpf);

				System.out.println("Agência: " + cc.getAgencia());
				System.out.println("Numero da conta: " + cc.getNumeroConta());
				System.out.println("Nome: " + cc.getCliente());
				System.out.println("CPF: " + cc.getCpf());
				System.out.println("Seu saldo atual é: " + String.format("%.2f",cc.getSaldoAtual()));
				System.out.println("Sua conta corrente foi criada com sucesso!");
				int opcao;

				do {

					System.out.println("Que operação deseja executar?");
					System.out.println("1-Sacar");
					System.out.println("2 Depositar");
					System.out.println("3-Ver saldo da conta");
					System.out.println("4-Sair");
					opcao = scanner.nextInt();

					switch (opcao) {
					case 1:

						cc.fazersaque();

						break;

					case 2:

						System.out.println("Quanto você gostaria de depositar? ");
						double quantiaDepositar = scanner.nextDouble();
						cc.fazerdeposito(quantiaDepositar);
						break;

					case 3:
						cc.saldo();

						break;

					case 4:
						System.out.println("Programa encerrado com sucesso");
						break;

					default:
						System.out.println("Opção inválida! Tente novamente! ");
					}

				} while (opcao != 4);

				break;

			case 2:

				ContaPoupanca pp = new ContaPoupanca(numeroConta, cliente, cpf);

				System.out.println("Agência: " + pp.getAgencia());
				System.out.println("Numero da conta: " + pp.getNumeroConta());
				System.out.println("Nome: " + pp.getCliente());
				System.out.println("CPF: " + pp.getCpf());
				System.out.println("Seu saldo atual é: " + pp.getSaldoAtual());

				System.out.println("Sua conta poupança foi criada com sucesso!");

				do {

					System.out.println("Que operação deseja executar?");
					System.out.println("1-Sacar");
					System.out.println("2 Depositar");
					System.out.println("3-Ver saldo da conta");
					System.out.println("4-Ver rendimento da conta");
					System.out.println("5-Sair");
					opcao = scanner.nextInt();

					switch (opcao) {
					case 1:

						pp.fazersaque();
						break;

					case 2:
						System.out.println("Quanto você gostaria de depositar?");
						Double quantiaDepositar = scanner.nextDouble();
						pp.fazerdeposito(quantiaDepositar);
						break;

					case 3:
						pp.saldo();
						break;

					case 4:

						System.out.println("O rendimento da sua conta foi de R$ "
								+ String.format("%.2f", pp.CalcularRendimento()));

						System.out.println("Saldo + rendimento = R$ "
								+ String.format("%.2f", (pp.CalcularRendimento() + pp.saldo())));

						break;

					case 5:
						System.out.println("Programa encerrado com sucesso");
						break;

					default:
						System.out.println("Opção inválida! Tente novamente! ");
					}

				} while (opcao != 5);

				scanner.close();

			}

			// Implementar o armazenamento dos dados criados para consulta
		} else
			System.out.println("Opção em implementação.");

	}
}
