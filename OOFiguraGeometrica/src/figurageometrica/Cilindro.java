package figurageometrica;

import java.util.Scanner;

public class Cilindro extends Figura3D {
	
	Scanner imprima = new Scanner(System.in);

	private double altura;
	private double base;
	private double raio;
	private static final double PI = 3.14;
	double areaTotal;
	
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public static double getPi() {
		return PI;
	}
	
	public Cilindro() {
		
	
	}
	@Override
	public double calcularVolume() {
		System.out.println("A volume do Cilindro é " + (Math.PI*(raio*raio)*altura));
		
		return Math.PI*(raio*raio)*altura;
	}
	@Override
	public double calcularArea() {
		
		System.out.println("Informe o valor da altura desejada");
		this.altura = imprima.nextDouble();
		System.out.println("Informe o valor da base desejada");
		this.base = imprima.nextDouble();
		System.out.println("Informe o valor do raio desejado");
		this.raio = imprima.nextDouble();
		System.out.println("A área do Cilindro é " + (areaTotal));
		
		double areaBase = Math.PI * (raio*raio);
		double areaLateral = 2 * Math.PI * raio * altura;
		areaTotal = (2 * areaBase) + areaLateral;
		
		return areaTotal;
	}
}