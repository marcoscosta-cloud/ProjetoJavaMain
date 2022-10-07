package figurageometrica;

import java.util.Scanner;

public class Quadrado extends Figura2D {
	Scanner imprima = new Scanner(System.in);

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Quadrado() {

		
	}

	@Override
	public double calcularArea() {
		System.out.println("Informe o valor do lado desejado");
		this.lado = imprima.nextDouble();
		System.out.println("A área do Quadrado é " + (lado * lado));

		return (lado * lado);
	}

}
