package mamifero;

import animal.Animal;

public class Mamifero extends Animal {

	// Atributos

	private boolean pelagem;

	// Getters e Setters

	public boolean isPelagem() {
		return pelagem;
	}

	public void setPelagem(boolean pelagem) {
		this.pelagem = pelagem;
	}

	@Override
	public void emitirsom() {

	}
}
