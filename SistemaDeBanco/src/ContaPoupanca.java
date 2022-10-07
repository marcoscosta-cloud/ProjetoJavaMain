public class ContaPoupanca extends CriarConta {

	// Construtores

		public ContaPoupanca(String numeroConta, String cliente, String cpf) {
		super(numeroConta, cliente, cpf);
	}
	
	
//Método CalcularRendimento

	public double CalcularRendimento() {

		double rendimentoAoMes = (0.05 * getSaldoAtual());

		return rendimentoAoMes;
	}
}

