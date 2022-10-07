package figurageometrica;

import java.util.Scanner;

public class Circulo extends Figura2D {

	Scanner imprima = new Scanner(System.in);

	private double raio;
	private static final double PI = 3.14;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public static double getPi() {
		return PI;
	}

	public Circulo() {
		

	}

	@Override
	public double calcularArea() {
		System.out.println("Informe o valor do raio desejado");
		this.raio = imprima.nextDouble();
		System.out.println("A área do Círculo é " + (PI * raio * raio));
		return (PI * raio * raio);

	}

}