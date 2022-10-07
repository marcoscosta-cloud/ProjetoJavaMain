package ave;

import animal.Animal;

public class Avestruz extends Ave {

	// Atributos

	private boolean cabecaEnterrada;
	private boolean dormindo;

	// metodo enterracabeca

	public void enterracabeca(int faseDoDia) {

		if (faseDoDia == 0) {
			dormindo = true;
			cabecaEnterrada = true;

			System.out.println("Está com a cabeça enterrada e dormindo.");

		}

		else {
			System.out.println("Está acordado e nervoso!");
		}
	}

	@Override
	public void emitirsom() {
		System.out.println("Emitido som de gritaria!!!");
	}
	
	// Getters e Setters

	public boolean isCabecaEnterrada() {
		return cabecaEnterrada;
	}

	public boolean isDormindo() {
		return dormindo;
	}

}
