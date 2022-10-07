import java.util.Scanner;

public class TesteTemperatura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor;
		char medida;
		
		System.out.println("Digite a temperatura: ");
		valor = scanner.nextDouble();
		System.out.println("Insira a unidade de medida: ");
		medida = scanner.next().charAt(0);
		
		Temperatura temperatura = new Temperatura(valor, medida);
		
		temperatura.exibe();
		
		temperatura.converter();
		
		temperatura.exibe();
	}
}
