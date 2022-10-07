//Crie uma classe Teste que contenha a seguinte lógica:
//• Criar contas
//• Sacar um valor das contas
//• Depositar
//• Mostrar um novo saldo a partir de um rendimento
//• Mostrar os dados da conta do cliente

package Exercicio1;

import java.util.Scanner;

public class TestaConta {
	
	public int escolha;

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("---------------------");
		System.out.println("---BANCO T-ORIENTA---");
		System.out.println("---------------------");

		System.out.println("Escolha a opção desejada.");
		System.out.println("1- Criar conta.");
		System.out.println("2- Consultar conta.");
		int escolha = leia.nextInt();
		
		System.out.println();

		int tipoconta;
		if (escolha == 1) {

			System.out.println("Qual o tipo de conta?");
			System.out.println("1-Conta Especial");
			System.out.println("2-Conta Poupança");
			tipoconta = leia.nextInt();
			
			System.out.println();

			System.out.println("Qual o número da conta?");
			String numeroConta = leia.next();

			System.out.println("Qual o seu nome?");
			leia.nextLine();
			String cliente = leia.nextLine();

			System.out.println("Qual o seu cpf?");
			String cpf = leia.nextLine();

			System.out.println();
			
			switch (tipoconta) {
			case 1:
				
				ContaEspecial ce = new ContaEspecial(numeroConta, cliente, cpf);

				System.out.println("Agência: " + ce.getAgencia());
				System.out.println("Numero da conta: " + ce.getNumeroConta());
				System.out.println("Nome: " + ce.getCliente());
				System.out.println("CPF: " + ce.getCpf());
				System.out.println("Seu saldo atual é: " + String.format("%.2f",ce.getSaldoAtual()));
				System.out.println("Sua conta corrente foi criada com sucesso!");

				int opcao;
				
				System.out.println();
				
				do {

					System.out.println("Que operação deseja executar?");
					System.out.println("1-Sacar");
					System.out.println("2-Depositar");
					System.out.println("3-Ver saldo da conta");
					System.out.println("4-Sair");
					opcao = leia.nextInt();

					System.out.println();
					
					switch (opcao) {
					case 1:

						ce.sacar();

						break;

					case 2:

						System.out.println("Quanto você gostaria de depositar? ");
						double quantiaDepositar = leia.nextDouble();
						ce.depositar(quantiaDepositar);
						break;

					case 3:
						ce.saldoAtual();

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

				ContaPoupanca cp = new ContaPoupanca(numeroConta, cliente, cpf);

				System.out.println("Agência: " + cp.getAgencia());
				System.out.println("Numero da conta: " + cp.getNumeroConta());
				System.out.println("Nome: " + cp.getCliente());
				System.out.println("CPF: " + cp.getCpf());
				System.out.println("Seu saldo atual é: " + cp.getSaldoAtual());

				System.out.println("Sua conta poupança foi criada com sucesso!");

				System.out.println();
				
				do {

					System.out.println("Que operação deseja executar?");
					System.out.println("1-Sacar");
					System.out.println("2-Depositar");
					System.out.println("3-Ver saldo da conta");
					System.out.println("4-Ver rendimento da conta");
					System.out.println("5-Sair");
					opcao = leia.nextInt();

					switch (opcao) {
					case 1:

						cp.sacar();
						break;

					case 2:
						System.out.println("Quanto você gostaria de depositar?");
						Double quantiaDepositar = leia.nextDouble();
						cp.depositar(quantiaDepositar);
						break;

					case 3:
						cp.saldoAtual();
						break;

					case 4:

						System.out.println("O rendimento da sua conta foi de R$ " + String.format("%.2f", cp.CalcularNovoSaldo()));

						System.out.println("Saldo + rendimento = R$ " + String.format("%.2f", (cp.CalcularNovoSaldo() + cp.saldoAtual())));

						break;

					case 5:
						System.out.println("Programa encerrado com sucesso");
						break;

					default:
						System.out.println("Opção inválida! Tente novamente! ");
					}

				} while (opcao != 5);

				leia.close();

			}

			// Implementar o armazenamento dos dados criados para consulta
		} else
			System.out.println("Opção em implementação.");

	}
}
