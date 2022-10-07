package Exercicio1;

public class TestaContador {


	static void imprimirValor() {
		System.out.println(Contador.retornarValor());
	}
	
	public static void main(String[] args) {
		imprimirValor();

		Contador.incrementar();

		imprimirValor();

		Contador.zerar();

		imprimirValor();

		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();

		imprimirValor();
		Contador.zerar();
		imprimirValor();
		
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
	}
	}
		

