
public abstract class Item {
	
	private double preco;
	private String nome;
	
	
	public Item(double preco, String nome) {
		this.preco = preco;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}

