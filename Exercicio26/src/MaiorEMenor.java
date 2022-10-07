//26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
//- O primeiro valor é o maior
//- O segundo valor é o maior
//- Não existe valor maior, os dois são iguais

import java.util.Scanner;
public class MaiorEMenor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o primeiro número");
		int primeiro = leia.nextInt();
		System.out.println("Informe o segundo número");
		int segundo = leia.nextInt();
		
		boolean numero1 = primeiro>segundo;
		boolean numero2 = segundo>primeiro;
		boolean semelhantes = primeiro==segundo;
		
		if(numero1){
			System.out.println("O primeiro número que é "+primeiro+" é o maior número.");
		}
	else if(numero2){
		System.out.println("O segundo número que é "+segundo+" é o maior número.");
	}else {
		System.out.println("O nummero "+primeiro+" e o outro número "+segundo+" são iguais");
	}
}
}
