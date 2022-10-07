//25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo com essas
//retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
//de cada lado deve ser menor que a soma dos outros dois.

import java.util.Scanner;
public class Triangulo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o tamanho do segmento 01:");
		int segmento1 = leia.nextInt();
		
		System.out.println("Informe o tamanho do segmento 02:");
		int segmento2 = leia.nextInt();
		
		System.out.println("Informe o tamanho do segmento 03:");
		int segmento3 = leia.nextInt();
		
		boolean s1 = segmento1 < segmento2 + segmento3;
		boolean s2 = segmento2 < segmento1 + segmento3;
		boolean s3 = segmento3 < segmento1 + segmento2;
		
		
		if ((s1) && (s2) && (s3)) {
			System.out.println("Tudo certo! Os três segmentos podem formar um triângulo.");
		} else {
			System.out.println("Não é possível formar um triângulo a partir dos três segmentos informados.");
		leia.close();
				}
		
	}

}
