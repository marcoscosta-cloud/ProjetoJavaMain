//Por último, crie uma classe teste de forma a ter um jardim zoológico com os seguintes animais: camelo, tubarão, urso-do-canadá.

package zoo;

import java.util.Scanner;

public class TestaZoo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Mamifero camelo = new Mamifero();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2.0);
        camelo.setAlimento("Vegetais");

		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setPatas(0);
		tubarao.setCor("Cinzento");
		tubarao.setAmbiente("Mar");
		tubarao.setVelocidade(1.5);
		tubarao.setCaracteristicas("Barbatana e cauda");

		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(180);
		urso.setPatas(4);
		urso.setCor("Vermelho");
		urso.setAmbiente("Terra");
		urso.setVelocidade(0.5);
		urso.setAlimento("Mel");

		int opcao;
	
		System.out.println("------------------------------");
		System.out.println("-----ZOOLÓGICO ORIENTAÇÃO-----");
		System.out.println("------------------------------");
		System.out.println();
		
		do {
			
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Camelo");
			System.out.println("2 - Tubarão");
			System.out.println("3 - Urso-do-Canadá");
			System.out.println("4 - Sair do programa");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:

				System.out.println("Você escolheu a opção 1!");
				System.out.println();
				System.out.println("O nome do animal é: " + camelo.getNome()+ ".");

				System.out.println("O comprimento do camelo é: " + camelo.getComprimento() + " Cm.");

				System.out.println("O camelo possui: " + camelo.getPatas() + " patas.");

				System.out.println("A cor do camelo é: " + camelo.getCor()+ ".");

				System.out.println("O ambiente em que o camelo vive é em: " + camelo.getAmbiente() + ".");

				System.out.println("A velocidade alcançada pelo  camelo é: " + camelo.getVelocidade() + " m/s.");

				System.out.println("A alimentação do camelo é do tipo: " + camelo.getAlimento() + ".");

				System.out.println();

				break;

			case 2:

				System.out.println("Você escolheu a opção 2!");
				System.out.println();
				System.out.println("O nome do animal é: " + tubarao.getNome()+ ".");

				System.out.println("O comprimento do tubarão é: " + tubarao.getComprimento() + " Cm.");

				System.out.println("O tubarão possui: " + tubarao.getPatas() + " patas.");

				System.out.println("A cor do tubarão é: " + tubarao.getCor() + ".");

				System.out.println("O ambiente em que o tubarão vive é : " + tubarao.getAmbiente() + ".");

				System.out.println("A velocidade alcançada pelo  tubarão é: " + tubarao.getVelocidade() + " m/s.");

				System.out.println("A principal característica do tubarão é possuir: " + tubarao.getCaracteristicas() + ".");

				System.out.println();

				break;

			case 3:

				System.out.println("Você escolheu a opção 3!");
				System.out.println();
				System.out.println("O nome do animal é: " + urso.getNome()+ ".");

				System.out.println("O comprimento do urso é: " + urso.getComprimento() + " Cm.");

				System.out.println("O urso possui: " + urso.getPatas() + " patas.");

				System.out.println("A cor do urso é: " + urso.getCor() + ".");

				System.out.println("O ambiente em que o urso vive é : " + urso.getAmbiente() + ".");

				System.out.println("A velocidade alcançada pelo  urso é: " + urso.getVelocidade() + " m/s.");

				System.out.println("A alimentação do urso é do tipo: " + urso.getAlimento() + ".");

				System.out.println();
				
				break;

			case 4:

				System.out.println("Programa finalizado!");

				break;

			default:

				System.out.println("Opção inválida! Por favor tente novamente!");
				System.out.println();

				break;
			}

		} while (opcao != 4);

		leia.close();
	}

}
