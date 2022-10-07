package figurageometrica;

import java.util.Scanner;

public class Triangulo extends Figura2D {
	
	Scanner imprima = new Scanner(System.in);

	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Triangulo() {

	}

	@Override
	public double calcularArea() {
		System.out.println("Informe o valor da base desejada");
		this.base = imprima.nextDouble();
		System.out.println("Informe o valor da altura desejada");
		this.altura = imprima.nextDouble();
		System.out.println("A área do Triângulo é " + (altura * base) / 2);

		return (altura * base) / 2;
	}

}
