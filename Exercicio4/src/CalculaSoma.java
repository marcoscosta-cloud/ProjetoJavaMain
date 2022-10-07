import java.util.Scanner;

public class CalculaSoma {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("INICIANDO A SOMATÓRIA");
		System.out.println("Informe o primeiro número:");
		int primeiroNumero = leia.nextInt();
		System.out.println("Informe o segundo número:");
		int segundoNumero = leia.nextInt();
		int soma = primeiroNumero + segundoNumero;
		System.out.println("A soma entre os dois valores é " + soma + ".");
		leia.close();
	}
}
