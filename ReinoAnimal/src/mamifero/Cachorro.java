package mamifero;

public class Cachorro extends Mamifero {

	// Atributos

	private boolean cavando;

	// metodo cavar
	
	public void cavar(int acao) {

		if (acao == 0) {
			cavando = false;

			System.out.println("Ok! Obrigado!");

		}

		else {

			System.out.println("Não é possível que você não saiba que esse mamífero cave!!!");
		}
	}
		@Override
		public void emitirsom() {
	System.out.println("AUAUAUAUAUAU");
		}

	// Getters e Setters

	public boolean isCavando() {
		return cavando;
	}

	public void setCavando(boolean cavando) {
		this.cavando = cavando;
	}

}
