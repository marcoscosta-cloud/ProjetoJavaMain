import java.util.Scanner;

public class TesteSalario {

	public static void main(String[] args) {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		String nome = leia.nextLine();

		System.out.println("Digite o número do seu cargo: ");
		System.out.println("1-DBA");
		System.out.println("2-DESENVOLVEDOR");
		System.out.println("3-TESTER");
		System.out.println("4-ESTAGIARIO");
		int cargo = leia.nextInt();

		System.out.println("Informe seu salário: ");
		double salario = leia.nextDouble();

		leia.close();

		Funcionario funcionario = new Funcionario();

		funcionario.setNome(nome);
		funcionario.setSalarioBase(salario);

		switch (cargo) {
		case 1: {
			funcionario.setCargo(Cargo.DBA);
			break;
		}
		case 2: {
			funcionario.setCargo(Cargo.DESENVOLVEDOR);
			break;
		}
		case 3: {
			funcionario.setCargo(Cargo.TESTER);
			break;
		}
		case 4: {
			funcionario.setCargo(Cargo.ESTAGIARIO);
			break;
		}
		default: {
			throw new IllegalArgumentException("Cargo inexistente");
		}
		}

		double salarioReajustado = calculadora.calcula(funcionario);
		System.out.println(nome + ". Seu novo salário é: R$ " + salarioReajustado);
	}
}

