package inseto;

import java.util.Scanner;


public class TestaInseto {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);

			Vagalume vagalume = new Vagalume();
			vagalume.setNome("Lampyridae");
			vagalume.setCor("Pode variar");
			vagalume.setTempCorporal("Sangue quente");
			vagalume.setTamanho("Pequeno");
			vagalume.setClassificacao("Invertebrado");
			vagalume.setAlimentacao("Onívoro");
			vagalume.setHabitat("Terrestre");
			vagalume.setLocomocao("Quadrúpede");
			vagalume.setReproducao("Sexuada");
			vagalume.setQuantidadeDePatas("3 pares");
			vagalume.setQuantidadeDeAsas("1 par");
			vagalume.setQuantidadeDeAntenas("1 par");
			
			
			BesouroRolador besouro = new BesouroRolador();
			besouro.setNome("Coleoptera");
			besouro.setCor("Pode variar");
			besouro.setTempCorporal("Sangue quente");
			besouro.setTamanho("Pode variar");
			besouro.setClassificacao("Invertebrado");
			besouro.setAlimentacao("Herbívoro");
			besouro.setHabitat("Terrestre");
			besouro.setLocomocao("Quadrupede");
			besouro.setReproducao("Sexuada");
			besouro.setQuantidadeDePatas("3 pares");
			besouro.setQuantidadeDeAsas("1 par");
			besouro.setQuantidadeDeAntenas("1 par");
			int opcao = 0;

			do {
				System.out.println("Escolha uma das opções abaixo:");
				System.out.println("1 - Vagalume");
				System.out.println("2 - besouro");
				System.out.println("3 - Sair do programa");
				opcao = leia.nextInt();

				switch (opcao) {
				case 1:

					System.out.println("Você escolheu o vagalume!");
					System.out.println();
					System.out.println("O nome científico do vagalume é: " + vagalume.getNome());

					System.out.println("A cor do vagalume é: " + vagalume.getCor());

					System.out.println("A temperatura corporal do vagalume é: " + vagalume.getTempCorporal());

					System.out.println("O tamanho do vagalume é: " + vagalume.getTamanho());

					System.out
							.println("A classificação em que o vagalume está é de animal: " + vagalume.getClassificacao());

					System.out.println("A alimentação do vagalume é do tipo: " + vagalume.getAlimentacao());

					System.out.println("O habitat em que o vagalume vive é: " + vagalume.getHabitat());

					System.out.println("O tipo de locomoção do vagalume é: " + vagalume.getLocomocao());

					System.out.println("A reprodução do vagalume é do tipo: " + vagalume.getReproducao());

					System.out.println("A quantidade de patas do vagalume é de: "  + vagalume.getQuantidadeDePatas());

					System.out.println("A quantidade de asas do vagalume é de: " + vagalume.getQuantidadeDeAsas());

					System.out.println("A quantidade de antenas do vagalume é de: " + vagalume.getQuantidadeDeAntenas());

					
					System.out.println();

					vagalume.emitirsom();

					System.out.println();

					System.out.println("Sobre qual comportamento do vagalume você deseja saber?");
					System.out.println("0 - Noturno");
					System.out.println("1 - Diurno");
					int opv = leia.nextInt();

					vagalume.iluminar(opv);

					break;

				case 2:

					System.out.println("Você escolheu o besouro!");

					System.out.println();

					System.out.println("O nome científico do besouro é: " + besouro.getNome());

					System.out.println("A cor do besouro: " + besouro.getCor());

					System.out.println("A temperatura corporal do besouro é: " + besouro.getTempCorporal());

					System.out.println("O tamanho do besouro é: " + besouro.getTamanho());

					System.out.println("A classificação em que o besouro está é de animal: " + besouro.getClassificacao());

					System.out.println("A alimentação do besouro é do tipo: " + besouro.getAlimentacao());

					System.out.println("O habitat em que o besouro vive é: " + besouro.getHabitat());

					System.out.println("O tipo de locomoção do besouro é: " + besouro.getLocomocao());

					System.out.println("A reprodução do besouro é do tipo: " + besouro.getReproducao());

					System.out.println("A quantidade de patas do besouro é de: "  + besouro.getQuantidadeDePatas());

					System.out.println("A quantidade de asas do besouro é de: " + besouro.getQuantidadeDeAsas());

					System.out.println("A quantidade de antenas do besouro é de: " + besouro.getQuantidadeDeAntenas());
					
					System.out.println("Sobre qual comportamento do besouro você deseja saber?");
					System.out.println("0 - Noturno");
					System.out.println("1 - Diurno");
					int opb = leia.nextInt();

					besouro.rolarbosta(opb);
			
					System.out.println();

					besouro.emitirsom();

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


