//28) Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m2. O programa também
//deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
//- Abaixo de 100m2 = TERRENO POPULAR
//- Entre 100m2 e 500m2 = TERRENO MASTER
//- Acima de 500m2 = TERRENO VIP

import java.util.Scanner;
public class Terreno {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a largura do terreno em metros:");
		int largura = leia.nextInt();
		if (largura <=0) {
			System.out.println("Largura inválida, tente novamente.");
		}else { 
		
		System.out.println("Informe o comprimento do terreno em metros:");
		int comprimento = leia.nextInt();
		if (comprimento <=0) {
			System.out.println("Comprimento inválido, tente novamente.");
		}else {
		
		int tamanho = largura*comprimento;
		
		if( (tamanho <= 100)) {
			System.out.println("Este terreno tem " +tamanho+" metros e é POPULAR");
		}
		else if((tamanho >= 101) && (tamanho<=500)) {
			System.out.println("Este terreno tem " +tamanho+" metros e é MASTER");
		}
		else{
			System.out.println("Este terreno tem " +tamanho+" metros e é TERRENO VIP");
		}
			leia.close();
			
		}	
}
}
}

