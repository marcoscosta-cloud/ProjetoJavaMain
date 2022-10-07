//Um animal contém nome, comprimento, número de patas (padrão é 4), cor, ambiente e velocidade (em m/s).

//Um peixe é um animal, tem 0 patas, seu ambiente é o mar(padrão), cor cinzenta(padrão). Além disso tem como características barbatanas e cauda.

//Um mamífero é um animal e seu ambiente padrão é terra.

//Um urso é um mamífero, cor castanho e seu alimento preferido é o mel.

//Crie as classes Animal, Peixe e Mamífero.

//Para a classe Animal, coloque os atributos:

//• Nome, comprimento, patas, cor, ambiente, velocidade


package zoo;

public class Animal {

	// Atributos

	private String nome;
	private int comprimento;
	private int patas = 4;
	private String cor;
	private String ambiente;
	private double velocidade;


	// Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

}