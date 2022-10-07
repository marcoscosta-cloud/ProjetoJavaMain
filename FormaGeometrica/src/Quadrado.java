
public class Quadrado implements FormaGeometrica {

//	Atributos

	private double lado;

//	Métodos Getters e Setters

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return (lado * lado);
	}

	@Override
	public double comprimento() {
		return (lado);
	}

//	Implementar o construtor

	public Quadrado(double lado) {
		this.lado = lado;
	}


}
