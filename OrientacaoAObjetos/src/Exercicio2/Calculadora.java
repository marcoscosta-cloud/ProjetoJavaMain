package Exercicio2;
//2. Escreva uma classe Calculadora que tenha os seguintes métodos: somar, subtrair, multiplicar, dividir (dois números), elevar à potência n. Desenvolva um programa para testar essa classe.

public class Calculadora {

//	Método Somar

	public static double somar(double n1, double n2) {
		return n1 + n2;
	}
//	Método Subtrair

	public static double subtrair(double n1, double n2) {
		return n1 - n2;
	}
//	Método Multiplicar

	public static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}
//	Método Dividir

	public static double dividir(double n1, double n2) {
		return n1 / n2;
		
	}
//	Método Potenciação

	public static double potencia(double n1, double n2) {
		return Math.pow(n1, n2);
	}
}
