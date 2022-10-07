//Para todos os exercícios, não esqueça de encapsular os atributos com métodos getters e setter, criar os construtores apropriados e também o método toString.
//
//Exercício)01)– Conta)Bancária

//Elabore uma classe ContaBancaria com os seguintes atributos:

//• nomeCliente
//• numConta
//• saldo

//E os seguintes métodos:
//• sacar (o saldo não pode ficar negativo)
//• depositar

//Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as seguintes características:

package Exercicio1;


import java.util.Scanner;

public abstract class ContaBancaria {
	Scanner leia = new Scanner(System.in);

	// Atributos

	private String agencia = "0001";
	private String numeroConta;
	private String cliente;
	private String cpf;
	private double saldoAtual = 0.00;

	// Construtores

	public ContaBancaria(String numeroConta, String cliente, String cpf) {
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.cpf = cpf;
	}

	// Métodos Getters and Setters

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	// Método Sacar

	public void sacar() {
		System.out.println("Quanto você gostaria de sacar? ");
		double valor = leia.nextDouble();

		if (saldoAtual >= valor) {
			this.saldoAtual = this.saldoAtual - valor;
			System.out.println("Saque de R$ " + valor + " efetuado com sucesso! ");
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	// Método depositar

	public void depositar(double valor) {
		this.saldoAtual = this.saldoAtual + valor;
		System.out.println("Depósito efetuado com sucesso!");
	}

	// Método Saldo

	public double saldoAtual() {

		System.out.println("O seu saldo é de R$ " + String.format("%.2f", this.saldoAtual));

		return saldoAtual;

	}

}
