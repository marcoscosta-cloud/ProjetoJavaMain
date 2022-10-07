//ContaPoupanca

//• atributo diaRendimento
//• método calcularNovoSaldo, recebe taxa de rendimento da poupaça e 
//atualiza o saldo

package Exercicio1;

public class ContaPoupanca extends ContaBancaria {

	private String diaRendimento;

	// Construtores


			public ContaPoupanca(String numeroConta, String cliente, String cpf) {
			super(numeroConta, cliente, cpf);
		}


	// Métodos Getters and Setters

	public String getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(String diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	// Método CalcularNovoSaldo

	public double CalcularNovoSaldo() {

		double diaRendimento = (0.002 * getSaldoAtual());

		return diaRendimento;
	}

}
