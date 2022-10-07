//18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//dela e depois mostre se ela pode ou não votar.
import java.util.Scanner;
public class AnoDeNascimento {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("-------------");
		System.out.println("TESTA VOTAÇÃO");
		System.out.println("-------------");
		System.out.println("Informe o seu ano de nascimento:");
		int anoNascimento = leia.nextInt();
		int anoAtual = 2022;
		int calculo = anoAtual - anoNascimento;
		System.out.println("A sua idade atual é "+calculo+" anos.");
			if(calculo >= 16) {
				System.out.println("Parabéns, você está apto a votar.");
			}else {
				System.out.println("Infelizmente você não está apto a votar.");
				leia.close();
				}
			}
	}

