package Exercicio2;

import java.util.Scanner;

public class TestaCalculadora {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Informe o primeiro número:");
		double primeiro = leia.nextDouble();

		System.out.println("Informe o segundo número:");
		double segundo = leia.nextDouble();
		
		System.out.println();
		
		
		do {
		System.out.println("Escolha a operação deseaja:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Potenciação");
		System.out.println("6 - Sair");
		opcao = leia.nextInt();
		
		System.out.println();

		switch (opcao) {
		case 1:
			Calculadora.somar(primeiro, segundo);
			System.out.println("A soma de "+ primeiro + " + "+ segundo + " é: "+ Calculadora.somar(primeiro, segundo));

			break;
			
		case 2:
			Calculadora.subtrair(primeiro, segundo);
			System.out.println("A subtração de "+ primeiro + " - "+ segundo + " é: "+ Calculadora.subtrair(primeiro, segundo));
			break;
			
		case 3:
			Calculadora.multiplicar(primeiro, segundo);
			System.out.println("A multiplicação de "+ primeiro + " X "+ segundo + " é: "+ Calculadora.multiplicar(primeiro, segundo));
			break;
			
		case 4:
			Calculadora.dividir(primeiro, segundo);
			System.out.println("A divisão de "+ primeiro + " / "+ segundo + " é: "+ Calculadora.dividir(primeiro, segundo));
			break;
			
		case 5:
			Calculadora.potencia(primeiro, segundo);
			System.out.println("A potência de "+ primeiro + " e "+ segundo + " é: "+ Calculadora.potencia(primeiro, segundo));
			break;
			
		case 6:
			
			System.out.println("Programa encerrado com sucesso, PEIXE!!!!!");
			
			break;

		default:
			
			System.out.println("Opção inválida PEIXE, tente novamente");
			
			break;
		}
		
		System.out.println();
	
	}while(opcao != 6);
		
		leia.close();
}

}


