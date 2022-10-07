//19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//não um bom aproveitamento (se ficou acima da média 7.0).

import java.util.Scanner;
public class MediaNotas {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o seu nome:");
		String nome = leia.nextLine();
		
		System.out.println("Informe a primeira nota:");
		float primeiraNota = leia.nextFloat();
		
		System.out.println("Informe a segunda nota:");
		float segundaNota = leia.nextFloat();
		
		float media = (primeiraNota+segundaNota)/2;
		System.out.println("O aluno(a) "+nome+ 
			" teve a sua média "+media+ " entre as duas notas.");
		if((media >=7) && (media <=10)){
			System.out.println("Aprovado, teve bom aproveitamento.");
		}
		else if((media >=5)&&(media <=6)) {
			System.out.println("Em recuperação, estude mais!");
	}
		else {
		System.out.println("Reprovado(a)");
		leia.close();
		}
	}
}
