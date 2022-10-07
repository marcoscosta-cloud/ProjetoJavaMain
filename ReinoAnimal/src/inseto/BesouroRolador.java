package inseto;

public class BesouroRolador extends Inseto {

	// Atributos

	private boolean rolando;

	// metodo rolabosta

	public void rolarbosta(int faseDoDia) {

		if (faseDoDia == 0) {
			rolando = true;

			System.out.println("Está em repouso e não quer ser incomodado!");

		}

		else {
			System.out.println("Está acordado e rolando muita bosta!");
		}
	}

	@Override
	public void emitirsom() {
		System.out.println("bzzzzzzzzzz");
	}

	// Getters e Setters

	public boolean isRolando() {
		return rolando;
	}

	public void setRolando(boolean rolando) {
		this.rolando = rolando;
	}

}
