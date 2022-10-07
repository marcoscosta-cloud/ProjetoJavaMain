package inseto;

public class Vagalume extends Inseto {

	private boolean iluminando;

	// metodo iluminar

	public void iluminar(int faseDoDia) {

		if (faseDoDia == 0) {
			iluminando = true;

			System.out.println("Está em atividade e aceso igual a" + " uma lamparina");

		}

		else {
			System.out.println("Está em repouso e não quer ser incomodado!");
		}
	}

	@Override
	public void emitirsom() {
	System.out.println("ZSZSZSZSZSSZSZ");
	}

//Getters e Setters		

	public boolean isIluminando() {
		return iluminando;
	}

	public void setIluminando(boolean iluminando) {
		this.iluminando = iluminando;
	}

}
