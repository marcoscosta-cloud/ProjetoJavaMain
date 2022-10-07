
public class Circulo implements FormaGeometrica {

//	Atributos

	private double raio;
	private static final double PI = 3.14;

//	Métodos Getters e Setters

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public static double getPi() {
		return PI;
	}

	// Implementar construtor

	public Circulo(double raio) {
		this.raio = raio;
	}

//	Métodos da Interface

	@Override
	public double area() {
		return (PI * raio * raio);
	}

	@Override
	public double comprimento() {
		return (2 * PI * raio);
	}

}
