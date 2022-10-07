import java.util.Scanner;

public class AntesEDepois {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("ANTECESSOR E SUCESSOR");
		System.out.println("---------------------");
		System.out.println("Informe um número:");
			int numero = leia.nextInt();
			int antecessor = numero -1;
			int sucessor = numero +1;
		System.out.println("O antecessor do número "+numero+ " é "+antecessor+
				" e o seu sucessor é "+sucessor+".");
		leia.close();
		
	}
}
