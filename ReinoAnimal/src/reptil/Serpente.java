package reptil;

public class Serpente extends Reptil {

	// Atributos

	private boolean atacando;

	@Override
	public void emitirsom() {
		System.out.println("ssssssssssss");
	}

	// metododarbote

	public void darbote(int ameaca) {
		if (ameaca == 0) {
			atacando = true;

			System.out.println("Fique tranquilo! Não irei te atacar!");

		}

		else {
			System.out.println("Fique em alerta! Irei te atacar!");
		}

	}

	// Getters e Setters

	public boolean isAtacando() {
		return atacando;
	}

	public void setAtacando(boolean atacando) {
		this.atacando = atacando;
	}

}
