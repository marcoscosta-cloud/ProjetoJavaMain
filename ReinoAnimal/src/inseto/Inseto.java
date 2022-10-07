package inseto;

import animal.Animal;

public class Inseto extends Animal {

	// Atributos

	private String quantidadeDePatas;
	private String quantidadeDeAsas;
	private String quantidadeDeAntenas;

	@Override
	public void emitirsom() {
		
	}

	// Getters e Setters

	public String getQuantidadeDePatas() {
		return quantidadeDePatas;
	}

	public void setQuantidadeDePatas(String quantidadeDePatas) {
		this.quantidadeDePatas = quantidadeDePatas;
	}

	public String getQuantidadeDeAsas() {
		return quantidadeDeAsas;
	}

	public void setQuantidadeDeAsas(String quantidadeDeAsas) {
		this.quantidadeDeAsas = quantidadeDeAsas;
	}

	public String getQuantidadeDeAntenas() {
		return quantidadeDeAntenas;
	}

	public void setQuantidadeDeAntenas(String quantidadeDeAntenas) {
		this.quantidadeDeAntenas = quantidadeDeAntenas;
	}


}
