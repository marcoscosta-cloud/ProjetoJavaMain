package mamifero;

public class Humano extends Mamifero {

	// Atributos

	private double qi;

	@Override
	public void emitirsom() {
		System.out.println("Este mamífero fala muito BLÁBLÁBLÁ");
	}

	// Getters e Setters

	public double isQi() {
		return qi;
	}

	public void setQi(double qi) {
		this.qi = qi;
	}

}
