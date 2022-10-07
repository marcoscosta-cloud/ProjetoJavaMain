//20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
//ÍMPAR.

import java.util.Scanner;
public class ParOuImpar {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um número inteiro:");
		int numero = leia.nextInt();
		if((numero %2)==0) {
			System.out.println("O número "+numero+" é par");
		}
		else {
			System.out.println("O número "+numero+" é impar");
			leia.close();
		}
	}
}
