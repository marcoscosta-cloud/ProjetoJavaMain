//6. Faça um programa para jogar o jogo da velha. O programa deve
//permitir que dois jogadores façam uma partida do jogo da velha,
//usando o computador para ver o tabuleiro. Cada jogador vai
//alternadamente informando a posição onde deseja colocar a sua
//peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
//determinar automaticamente quando o jogo terminou e quem foi o
//vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
//deve atualizar a situação do tabuleiro na tela.

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char[][] jogo = new char[3][3];
		
		System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        
        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;


		boolean linhaValida = false;
		boolean colunaValida = false;
		
while (!ganhou){
            
            if (jogada % 2 == 1){ //jogador 1

		do {
			System.out.println("Sua vez Jogador 1, escolha a posição linha: Opção 1, 2 ou 3");
			sinal = 'X';
			int i = leia.nextInt();
			if (i > 0 && i <= 3) {
				linhaValida = true;

			} else {
				System.out.println("Opção inválida, tente novamente.");
			}
		} while (!linhaValida);


		do {
			System.out.println("Jogador 1, escolha a posição coluna: Opção 1, 2 ou 3");
			sinal = 'X';
			int j = leia.nextInt();
			if (j > 0 && j <= 3) {
				colunaValida = true;

			} else {
				System.out.println("Opção inválida, tente novamente.");
			}

		} while (!colunaValida);

		i--;
		j--;
		
		if (jogo[i][j] == 'X' || jogo[i][j] == 'O') {
			System.out.println("Opção inválida, tente novamente");
		} else {
			jogo[i][j] = 'X';
			
		}

		System.out.println();
		
		

		do {
			System.out.println("Sua vez Jogador 2, escolha a posição da linha: Opção 1, 2 ou 3");
			sinal = 'O';
			int k = leia.nextInt();
			if (k > 0 && k <= 3) {
				linhaValida = true;

			} else {
				System.out.println("Opção inválida, tente novamente.");
			}
		} while (!linhaValida);
		
		
		do {

		System.out.println("Jogador 2, escolha a posição da coluna: Opção 1, 2 ou 3");
		sinal = 'O';
		int l = leia.nextInt();
		if (l > 0 && l <= 3) {
			colunaValida = true;

		} else {
			System.out.println("Opção inválida, tente novamente.");
		}
		} while (!colunaValida);

		k--;
		l--;
		if (jogo[k][l] == 'X' || jogo[k][l] == 'O') {
			System.out.println("Opção inválida, tente novamente");
		} else {
			jogo[k][l] = 'O';
			
		}
		linha--;
        coluna--;
        
        if (jogo[linha][coluna] == 'X' || jogo[linha][coluna] == 'O'){
            System.out.println("Posição já usada, tente novamente");
        } else { //jogada válida
            jogo[linha][coluna] = sinal;
            jogada++;
        }
		 for (int k = 0; k < jogo.length; k++){
             for (int l = 0; l <jogo[k].length; l++){
                 System.out.print(jogo[k][l] + " | ");
             }
             System.out.println();
		
		leia.close();
	}
}
}
	}
