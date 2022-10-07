import java.util.Scanner;

public class Remuneracao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o seu nome:");
		String nome = leia.nextLine();
		System.out.println("Informe o seu salário:");
		float salario = leia.nextFloat();
		leia.nextLine();
		System.out.println("Informe qual o mês:");
		String mes = leia.nextLine();
		System.out.println("O funcionário " + nome + " tem um salário de " + salario + " no mês de " + mes + ".");
		leia.close();
	}
}
