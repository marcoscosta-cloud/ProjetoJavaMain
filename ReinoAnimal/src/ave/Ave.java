package ave;

import animal.Animal;

public class Ave extends Animal {

	// Atributos

	private boolean voando;
	private boolean migrando;

	// Metodovoar

	public void voar(int estado) {

		if (estado == 0) {
			voando = false;

			System.out.println("Ok! Obrigado!");

		}

		else {

			System.out.println("Não é possível que você " + " não saiba que essa ave não voa!!!!");
		}
	}

	// metodo migrar

	public void migrar(int situacao) {

		if (situacao == 0) {
			voando = false;

			System.out.println("Ok! Obrigado!");

		}

		else {

			System.out.println("Não acredito que você " + " não tenha estudado e aprendido que essa ave não migra.");

			System.out.println("Tenha dó....... Volte a estudar.");

		}
	}

	@Override
	public void emitirsom() {
		
	}

	// Getters e Setters

	public boolean isVoando() {
		return voando;
	}

	public void setVoando(boolean voando) {
		this.voando = voando;
	}

	public boolean isMigrando() {
		return migrando;
	}

	public void setMigrando(boolean migrando) {
		this.migrando = migrando;
	}

}
