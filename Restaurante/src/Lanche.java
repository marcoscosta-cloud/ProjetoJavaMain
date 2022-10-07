
public class Lanche extends Item {
	
	private int peso;
	private String ingredientes;
	
	public Lanche(String nome, double preco, int peso, String ingredientes){
		super(nome, preco);
		this.peso = peso;
		this.ingredientes = ingredientes;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

}

