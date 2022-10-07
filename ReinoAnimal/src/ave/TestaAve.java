package ave;

import java.util.Scanner;

public class TestaAve {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Avestruz avestruz = new Avestruz();
		avestruz.setNome("Struthio camelus");
		avestruz.setCor("Preta");
		avestruz.setTempCorporal("Sangue quente");
		avestruz.setTamanho("Grande(pode chegar a 2,8 metros)");
		avestruz.setClassificacao("Vertebrado");
		avestruz.setAlimentacao("Onívoro");
		avestruz.setHabitat("Terrestre");
		avestruz.setLocomocao("Bípede");
		avestruz.setReproducao("Sexuada");

		Galinha galinha = new Galinha();
		galinha.setNome("Gallus gallus domesticus");
		galinha.setCor("Pode variar");
		galinha.setTempCorporal("Sangue quente");
		galinha.setTamanho("Pequena");
		galinha.setClassificacao("Vertebrada");
		galinha.setAlimentacao("Onívoro");
		galinha.setHabitat("Terrestre");
		galinha.setLocomocao("Bípede");
		galinha.setReproducao("Sexuada");
		int opcao = 0;
		do {
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Avestruz");
		System.out.println("2 - Galinha");
		System.out.println("3 - Sair do programa");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:

			System.out.println("Você escolheu o Avestruz!");
			System.out.println();
			System.out.println("O nome científico do avestruz é: " + avestruz.getNome());

			System.out.println("A cor do avestruz é: " + avestruz.getCor());

			System.out.println("A temperatura corporal do avestruz é: " + avestruz.getTempCorporal());

			System.out.println("O tamanho do avestruz é: " + avestruz.getTamanho());

			System.out.println("A classificação em que o avestruz está é de animal: " + avestruz.getClassificacao());

			System.out.println("A alimentação do avestruz é do tipo: " + avestruz.getAlimentacao());

			System.out.println("O habitat em que o avestruz vive é: " + avestruz.getHabitat());

			System.out.println("O tipo de locomoção do avestruz é: " + avestruz.getLocomocao());

			System.out.println("A reprodução do avestruz é do tipo: " + avestruz.getReproducao());

			System.out.println();

			avestruz.emitirsom();

			System.out.println();

			System.out.println("Qual o periodo do dia você gostaria de saber do Avestruz? ");
			System.out.println("0 - Noturno");
			System.out.println("1 - Diurno");
			int opa = leia.nextInt();

			avestruz.enterracabeca(opa);

			System.out.println();

			System.out.println("Você deseja saber se o avestruz voa? ");
			System.out.println("0 - Não");
			System.out.println("1 - Sim");
			int opav = leia.nextInt();

			avestruz.voar(opav);

			System.out.println();

			System.out.println("Você deseja saber se o avestruz migra? ");
			System.out.println("0 - Não");
			System.out.println("1 - Sim");
			int opam = leia.nextInt();

			avestruz.migrar(opam);

			break;

		case 2:

			System.out.println("Você escolheu a Galinha!");

			System.out.println();

			System.out.println("O nome científico da galinha é: " + galinha.getNome());

			System.out.println("A cor da galinha: " + galinha.getCor());

			System.out.println("A temperatura corporal da galinha é: " + galinha.getTempCorporal());

			System.out.println("O tamanho da galinha é: " + galinha.getTamanho());

			System.out.println("A classificação em que a galinha está é de animal: " + galinha.getClassificacao());

			System.out.println("A alimentação da galinha é do tipo: " + galinha.getAlimentacao());

			System.out.println("O habitat em que a galinha vive é: " + galinha.getHabitat());

			System.out.println("O tipo de locomoção da galinha é: " + galinha.getLocomocao());

			System.out.println("A reprodução da galinha é do tipo: " + galinha.getReproducao());

			System.out.println();

			galinha.emitirsom();

			System.out.println();

			System.out.println("Qual o periodo do dia você gostaria de saber da Galinha? ");
			System.out.println("0 - Noturno");
			System.out.println("1 - Diurno");
			int opg = leia.nextInt();

			galinha.ciscar(opg);
			
			System.out.println("Você deseja saber se a galinha migra? ");
			System.out.println("0 - Não");
			System.out.println("1 - Sim");
			int opgm = leia.nextInt();

			galinha.migrar(opgm);

			break;

		case 3:
			
			System.out.println("Programa finalizado!");
			
			break;
			
		default:
			
			System.out.println("Opção inválida! Por favor tente novamente!");
			
			break;
		}

	}while(opcao!=3); 
		

		leia.close();
	}

}
