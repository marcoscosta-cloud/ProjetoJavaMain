//8) Desenvolva um programa que leia uma distância em metros e mostre os valores
//relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 185.72
//A distância de 85.7m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//
//1857.2dm
//18572.0cm
//185720.0mm

import java.util.Scanner;
public class Medidas {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("LEIA A DISTÃNCIA EM METROS");
		System.out.println("--------------------------");
		System.out.println("Digite uma distância em metros;");
		float metros = leia.nextFloat();
		float km = metros / 1000f;
		float hm = metros / 100f;
		float dam = metros / 10f;
		float dm = metros * 10f;
		float cm = metros * 100f;
		float mm = metros * 1000f;
		System.out.println("A distância de "+metros+" corresponde a "+km+ " KM");
		System.out.println("A distância de "+metros+" corresponde a "+hm+ " HM");
		System.out.println("A distância de "+metros+" corresponde a "+dam+ " DAM");
		System.out.println("A distância de "+metros+" corresponde a "+dm+ " DM");
		System.out.println("A distância de "+metros+" corresponde a "+cm+ " CM");
		System.out.println("A distância de "+metros+" corresponde a "+mm+ " MM");
		leia.close();
	}
}
