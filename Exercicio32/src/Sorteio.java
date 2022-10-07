//[DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
//jogador vai tentar descobrir qual foi o valor sorteado.

import java.util.Scanner;
import java.util.Random;

public class Sorteio {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random sorteia = new Random();

		boolean acertou = false;
		int tentativas = 2;
		int segredo = sorteia.nextInt(5) + 1;
		long chute = 0;

		while (tentativas > 0 && acertou == false) {
			System.out.println("Qual o seu chute?");
			chute = leia.nextLong();
			if (segredo == chute) {
				System.out.println("Parabéns, você acertou!");
				acertou = true;
			} else if (chute < segredo) {
				--tentativas;
				System.out.println("Número muito pequeno!" + tentativas + " tentativas restantes");
			} else {
				--tentativas;
				System.out.println("Número muito grande!" + tentativas + " tentativas restantes");
			}
			leia.close();
		}
	}
}
