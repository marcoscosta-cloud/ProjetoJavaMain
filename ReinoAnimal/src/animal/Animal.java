package animal;

public abstract class Animal {

	// Atributos

	private String nome;
	private String cor;
	private String tempCorporal;
	private String tamanho;
	private String classificacao;
	private String alimentacao;
	private String habitat;
	private String locomocao;
	private String reproducao;

	// metodo emitirsom

	public abstract void emitirsom();
		

	// Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTempCorporal() {
		return tempCorporal;
	}

	public void setTempCorporal(String tempCorporal) {
		this.tempCorporal = tempCorporal;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getLocomocao() {
		return locomocao;
	}

	public void setLocomocao(String locomocao) {
		this.locomocao = locomocao;
	}

	public String getReproducao() {
		return reproducao;
	}

	public void setReproducao(String reproducao) {
		this.reproducao = reproducao;
	}
}