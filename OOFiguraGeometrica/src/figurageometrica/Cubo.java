package figurageometrica;

import java.util.Scanner;

public class Cubo extends Figura3D {

	Scanner imprima = new Scanner(System.in);

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Cubo() {

	}

	@Override
	public double calcularVolume() {

		System.out.println("O volume do Cubo é " + (lado * lado * lado));

		return lado * lado * lado;
	}

	@Override
	public double calcularArea() {

		System.out.println("Informe o valor do lado desejado");
		this.lado = imprima.nextDouble();
		System.out.println("A área do Cubo é " + 6 * (lado * lado));

		return 6 * (lado * lado);
	}

}