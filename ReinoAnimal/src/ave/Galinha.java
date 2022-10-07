package ave;

public class Galinha extends Ave {

	// Atributos

	private boolean ciscando;

	// Metodo ciscar

	public void ciscar(int faseDoDia) {
		if (faseDoDia == 0) {
			ciscando = false;
			System.out.println("Está repousando e não está ciscando.");
		} else {
			System.out.println("Está acordada e ciscando muito!");
		}

	}
	
	
	@Override
	public void emitirsom() {
		System.out.println("Emitido som de Cocoricóóóó!!!");
	}
	
	// Getters e Setters

	public boolean isCiscando() {
		return ciscando;
	}

	public void setCiscando(boolean ciscando) {
		this.ciscando = ciscando;

	}

}
