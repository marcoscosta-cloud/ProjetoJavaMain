package reptil;

import animal.Animal;

public class Reptil extends Animal {

	// Atributos

	private boolean peconha;

	@Override
	public void emitirsom() {

	}

	// metodo podeenvenenar

	public void podeEnvenenar(int ameaca) {
		if (ameaca == 0) {
			peconha = true;

			System.out.println("Sobre ameaça esse réptil vai te atacar e pode te envenenar, caso seja peçonhento");

		}

		else {
			System.out.println("Fique tranquilo! Não irei te atacar!");
		}
	}

	// Getters e Setters

	public boolean isPeconha() {
		return peconha;
	}

	public void setPeconha(boolean peconha) {
		this.peconha = peconha;
	}

}
