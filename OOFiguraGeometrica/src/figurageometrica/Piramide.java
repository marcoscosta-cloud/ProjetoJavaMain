package figurageometrica;

import java.util.Scanner;

public class Piramide extends Figura3D {

	Scanner imprima = new Scanner(System.in);

	private double altura;
	private double lado;
	double areaTotal;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Piramide() {

	}

	@Override
	public double calcularVolume() {

		System.out.println("O volume da Pirâmide é " + 1 / 3 * (altura * lado * lado));

		return 1 / 3 * (altura * lado * lado);
	}

	@Override
	public double calcularArea() {

		System.out.println("Informe o valor da altura desejada");
		this.altura = imprima.nextDouble();
		System.out.println("Informe o valor do lado desejado");
		this.lado = imprima.nextDouble();
		System.out.println("A área da Pirâmide é " + (areaTotal));

		double areaBase = (lado * lado);
		double areaLateral = 4 * lado * altura;
		areaTotal = areaBase + areaLateral;

		return areaTotal;

	}

}
