package reptil;

public class Camaleao extends Reptil {

	// Atributos

	private boolean camuflando;

	// metodo camuflar

	public void camuflar(int captura) {
		if ( captura == 0) {
			camuflando = true;
			System.out.println("A brincadeira acabou");
			
		}

		else {
			System.out.println("Vou brincar de pique-esconde!");
		}


	}

	@Override
	public void emitirsom() {
		System.out.println("Estou em silêncio, não emito som.");
	}
	// Getters e Setters

	public boolean isCamuflando() {
		return camuflando;
	}

	public void setCamuflando(boolean camuflando) {
		this.camuflando = camuflando;
	}

}
