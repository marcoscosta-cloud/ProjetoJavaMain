//31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)

import java.util.Scanner;
public class JokenPo {
	public static void main(String[] args) {
		int jogador,computador;
		Scanner leia = new Scanner(System.in);
		System.out.println("------------");
		System.out.println("JOGO JOKENPO");
		System.out.println("------------");
		System.out.println();
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("Digite a opção desejada:");
//		Lógica do jogador.
		jogador = leia.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("O jogador escolheu Pedra.");
			break;
		case 2:
			System.out.println("O jogador escolheu Papel.");
			break;
		case 3:
			System.out.println("O jogador escolheu Tesoura.");
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
		//lógica do computador
		computador = (int)(Math.random()*3+1);
		System.out.println();
		if (jogador <0 && jogador>4) {
		switch (computador) {
	case 1:
		System.out.println("O computador escolheu Pedra.");
		break;
	case 2:
		System.out.println("O computador escolheu Papel.");
		break;
	case 3:
		System.out.println("O computador escolheu Tesoura.");
		break;
		}
		//Lógica para determinar o vencedor
		System.out.println();
		if (jogador == computador) {
			System.out.println("EMPATE!");
			
		}else if((jogador == 1 && computador==3)||(jogador == 2 && computador == 1)||(jogador == 3 && computador ==2)){
			System.out.println("JOGADOR VENCEU!");
			
		}else {
			System.out.println("COMPUTADOR VENCEU!");
		}
		leia.close();	
	}
}
}
	
