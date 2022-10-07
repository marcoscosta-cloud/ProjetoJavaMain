
public class TestaFormaGeometrica {
	public static void main(String[] args) {
		FormaGeometrica circulo = new Circulo(4);
		System.out.println("A área do Círculo é " + circulo.area());
		System.out.println("O comprimento do Círculo é " + circulo.comprimento() + "\n");

		FormaGeometrica quadrado = new Quadrado(4);
		System.out.println("A área do Quadrado é " + quadrado.area());
		System.out.println("O comprimento do Quadrado é " + quadrado.comprimento() + "\n");

	}

}

//Cast de Intefaces
//FormaGeometrica fGquadrado = (FormaGeometrica) quadrado;
