//17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

import java.util.Scanner;
public class Velocidade {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("VERIFICAR VELOCIDADE");
		System.out.println("--------------------");
		System.out.println("Informe a sua velocidade");
		float velocidadeCarro = leia.nextFloat();
		float multa = (velocidadeCarro - 80) * 5;
		if (velocidadeCarro > 80){
			System.out.println("Sua velocidade é de "+velocidadeCarro+ 
					" está acima do permitido.");
			System.out.println("Você deve pagar uma multa de R$ " 
					+String.format("%.2f", multa));
		}else {
			System.out.println("Parabéns, você foi prudente e não foi multado nesta viagem.");
		}
		leia.close();
	}
}
