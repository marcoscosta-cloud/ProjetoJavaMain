package reptil;

import java.util.Scanner;

public class TestaReptil {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Camaleao camaleao = new Camaleao();
		camaleao.setNome("Chamaeleonidae");
		camaleao.setCor("Pode variar");
		camaleao.setTempCorporal("Sangue frio");
		camaleao.setTamanho("Pode variar");
		camaleao.setClassificacao("Vertebrado");
		camaleao.setAlimentacao("Onívoro");
		camaleao.setHabitat("Terrestre");
		camaleao.setLocomocao("Quadrúpede");
		camaleao.setReproducao("Sexuada");

		Serpente serpente = new Serpente();
		serpente.setNome("Serpentes");
		serpente.setCor("Pode variar");
		serpente.setTempCorporal("Sangue frio");
		serpente.setTamanho("Pode variar");
		serpente.setClassificacao("Vertebrada");
		serpente.setAlimentacao("Carnívora");
		serpente.setHabitat("Terrestre");
		serpente.setLocomocao("Rastejante");
		serpente.setReproducao("Sexuada");

		int opcao = 0;

		do {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Camaleão");
			System.out.println("2 - Serpente");
			System.out.println("3 - Sair do programa");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:

				System.out.println("Você escolheu o camaleão!");
				System.out.println();
				System.out.println("O nome científico do camaleão é: " + camaleao.getNome());

				System.out.println("A cor do camaleão é: " + camaleao.getCor());

				System.out.println("A temperatura corporal do camaleão é: " + camaleao.getTempCorporal());

				System.out.println("O tamanho do camaleão é: " + camaleao.getTamanho());

				System.out
						.println("A classificação em que o camaleão está é de animal: " + camaleao.getClassificacao());

				System.out.println("A alimentação do camaleão é do tipo: " + camaleao.getAlimentacao());

				System.out.println("O habitat em que o camaleão vive é: " + camaleao.getHabitat());

				System.out.println("O tipo de locomoção do camaleão é: " + camaleao.getLocomocao());

				System.out.println("A reprodução do camaleão é do tipo: " + camaleao.getReproducao());

				System.out.println();

				camaleao.emitirsom();

				System.out.println();

				System.out.println("Você deseja saber se o camaleão se camufla?");
				System.out.println("0 - Não");
				System.out.println("1 - Sim");
				int opcm = leia.nextInt();

				camaleao.camuflar(opcm);

				break;

			case 2:

				System.out.println("Você escolheu o serpente!");

				System.out.println();

				System.out.println("O nome científico do serpente é: " + serpente.getNome());

				System.out.println("A cor da serpente: " + serpente.getCor());

				System.out.println("A temperatura corporal da serpente é: " + serpente.getTempCorporal());

				System.out.println("O tamanho da serpente é: " + serpente.getTamanho());

				System.out
						.println("A classificação em que a serpente está é de animal: " + serpente.getClassificacao());

				System.out.println("A alimentação da serpente é do tipo: " + serpente.getAlimentacao());

				System.out.println("O habitat em que a serpente vive é: " + serpente.getHabitat());

				System.out.println("O tipo de locomoção da serpente é: " + serpente.getLocomocao());

				System.out.println("A reprodução da serpente é do tipo: " + serpente.getReproducao());

				System.out.println();

				serpente.emitirsom();

				System.out.println();

				System.out.println("Você deseja saber se a serpente dá bote?");
				System.out.println("0 - Não");
				System.out.println("1 - Sim");
				int opcs = leia.nextInt();
				serpente.darbote(opcs);
				
				break;

			case 3:

				System.out.println("Programa finalizado!");

				break;

			default:

				System.out.println("Opção inválida! Por favor tente novamente!");

				break;
			}

		} while (opcao != 3);

		leia.close();

	}
}
