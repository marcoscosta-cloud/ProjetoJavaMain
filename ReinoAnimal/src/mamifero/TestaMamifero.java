package mamifero;

import java.util.Scanner;

public class TestaMamifero {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Canis lupus familiaris");
		cachorro.setCor("Pode variar");
		cachorro.setTempCorporal("Sangue quente");
		cachorro.setTamanho("Pode variar");
		cachorro.setClassificacao("Vertebrado");
		cachorro.setAlimentacao("Onívoro");
		cachorro.setHabitat("Terrestre");
		cachorro.setLocomocao("Quadrúpede");
		cachorro.setReproducao("Sexuada");

		Humano humano = new Humano();
		humano.setNome("Homo Sapiens");
		humano.setCor("Pode variar");
		humano.setTempCorporal("Sangue quente");
		humano.setTamanho("Pode variar");
		humano.setClassificacao("Vertebrado");
		humano.setAlimentacao("Onívoro");
		humano.setHabitat("Terrestre");
		humano.setLocomocao("Bípede");
		humano.setReproducao("Sexuada");

		int opcao = 0;

		do {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Cachorro");
			System.out.println("2 - Humano");
			System.out.println("3 - Sair do programa");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:

				System.out.println("Você escolheu o cachorro!");
				System.out.println();
				System.out.println("O nome científico do cachorro é: " + cachorro.getNome());

				System.out.println("A cor do cachorro é: " + cachorro.getCor());

				System.out.println("A temperatura corporal do cachorro é: " + cachorro.getTempCorporal());

				System.out.println("O tamanho do cachorro é: " + cachorro.getTamanho());

				System.out
						.println("A classificação em que o cachorro está é de animal: " + cachorro.getClassificacao());

				System.out.println("A alimentação do cachorro é do tipo: " + cachorro.getAlimentacao());

				System.out.println("O habitat em que o cachorro vive é: " + cachorro.getHabitat());

				System.out.println("O tipo de locomoção do cachorro é: " + cachorro.getLocomocao());

				System.out.println("A reprodução do cachorro é do tipo: " + cachorro.getReproducao());

				System.out.println();

				cachorro.emitirsom();

				System.out.println();

				System.out.println("Você deseja saber se o cachorro cava?");
				System.out.println("0 - Não");
				System.out.println("1 - Sim");
				int opc = leia.nextInt();

				cachorro.cavar(opc);

				break;

			case 2:

				System.out.println("Você escolheu o humano!");

				System.out.println();

				System.out.println("O nome científico do humano é: " + humano.getNome());

				System.out.println("A cor do humano: " + humano.getCor());

				System.out.println("A temperatura corporal do humano é: " + humano.getTempCorporal());

				System.out.println("O tamanho do humano é: " + humano.getTamanho());

				System.out.println("A classificação em que o humano está é de animal: " + humano.getClassificacao());

				System.out.println("A alimentação do humano é do tipo: " + humano.getAlimentacao());

				System.out.println("O habitat em que o humano vive é: " + humano.getHabitat());

				System.out.println("O tipo de locomoção do humano é: " + humano.getLocomocao());

				System.out.println("A reprodução do humano é do tipo: " + humano.getReproducao());

				System.out.println();

				humano.emitirsom();

				System.out.println();

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
