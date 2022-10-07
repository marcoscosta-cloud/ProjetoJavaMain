import java.util.Scanner;

public class CalculaNotas {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("INICIANDO A MÉDIA DAS NOTAS");
		System.out.println("Informe a disciplina a ser avaliada");
			String disciplina = leia.nextLine();
		System.out.println("Informe a primeira nota:");
			float primeiraNota = leia.nextFloat();
		System.out.println("Informe a segunda nota:");
			float segundaNota = leia.nextFloat();
		float media = (primeiraNota + segundaNota)/2;
		
		System.out.println("Na discplina " + disciplina +", a primeira nota é " 
		+ primeiraNota + " e a segunda nota é " + segundaNota + " que trará uma média de " 
				+ media + ".");
		leia.close();
		
}
}
