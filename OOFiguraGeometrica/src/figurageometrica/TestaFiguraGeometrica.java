package figurageometrica;

import java.util.Scanner;

public class TestaFiguraGeometrica {
	public static void main(String[] args) {
		Scanner imprima = new Scanner(System.in);

		int opcao;
		
		do {
			
		System.out.println("--------------------------------");
		System.out.println("------GEOMETRIA DE FIGURAS------");
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("Escolha um dos tipos de figura abaixo");
		System.out.println("1 - Figura 2D");
		System.out.println("2 - Figura 3D");
		System.out.println("3 - Sair");
		opcao = imprima.nextInt();
		
		System.out.println();
		

			
			switch (opcao) {
			
			case 1:
				
				do {

				System.out.println("Você escolheu a Figura 2D.");
				System.out.println();
				System.out.println("Escolha uma das formas geométricas abaixo e será exibido a área de cada um:");
				System.out.println("1 - Círculo");
				System.out.println("2 - Quadrado");
				System.out.println("3 - Triângulo");
				System.out.println("4 - Sair");
				opcao = imprima.nextInt();
				
				System.out.println();
				
					
					switch (opcao) {
					
					case 1:

						Circulo circulo = new Circulo();
						circulo.calcularArea();
						circulo.setNome("Circulo");
						System.out.println(circulo.getNome());
						circulo.setCor("Verde");
						System.out.println(circulo.getCor());

						break;

					case 2:

						Quadrado quadrado = new Quadrado();
						quadrado.calcularArea();
						quadrado.setNome("Quadrado");
						System.out.println(quadrado.getNome());
						quadrado.setCor("Vermelho");
						System.out.println(quadrado.getCor());

						break;

					case 3:

						Triangulo triangulo = new Triangulo();
						triangulo.calcularArea();
						triangulo.setNome("Triangulo");
						System.out.println(triangulo.getNome());
						triangulo.setCor("Azul");
						System.out.println(triangulo.getCor());

						break;

					case 4:

						System.out.println("Programa finalizado com sucesso!!!");

						break;

					default:

						System.out.println("Opção inválida, tente novamente!!!");

						break;
					}
					

				}while (opcao != 4);
				
				break;
				
			case 2:

				do {
					
				System.out.println("Você escolheu a Figura 3D.");
				System.out.println();
				System.out.println("Escolha um dos tipos de figura abaixo");
				System.out.println("1 - Cubo");
				System.out.println("2 - Cilindro");
				System.out.println("3 - Pirâmide");
				System.out.println("4 - Sair");
				opcao = imprima.nextInt();
				
				System.out.println();

					switch (opcao) {
					case 1:

						Cubo cubo = new Cubo();
						cubo.calcularArea();
						cubo.calcularVolume();
						cubo.setNome("Cubo");
						System.out.println(cubo.getNome());
						cubo.setCor("Roxo");
						System.out.println(cubo.getCor());

						break;

					case 2:

						Cilindro cilindro = new Cilindro();
						cilindro.calcularArea();
						cilindro.calcularVolume();
						cilindro.setNome("Cilindro");
						System.out.println(cilindro.getNome());
						cilindro.setCor("Rosa");
						System.out.println(cilindro.getCor());

						break;

					case 3:

						Piramide piramide = new Piramide();
						piramide.calcularArea();
						piramide.calcularVolume();
						piramide.setNome("Piramide");
						System.out.println(piramide.getNome());
						piramide.setCor("Amarelo");
						System.out.println(piramide.getCor());

						break;

					case 4:

						System.out.println("Programa finalizado com sucesso!!!");

						break;

					default:

						System.out.println("Opção inválida, tente novamente!!!");

						break;
					}

				} while (opcao != 4);
				
				break;
				
			case 3:

				System.out.println("Programa finalizado com sucesso!!!");

				break;

			default:

				System.out.println("Opção inválida, tente novamente!!!");

				break;
			}

		} while (opcao != 3);
		
		imprima.close();
	}
}
