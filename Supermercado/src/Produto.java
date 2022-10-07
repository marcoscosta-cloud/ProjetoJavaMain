//19. Identifique	 as	 classes	 e	 implemente	 um	 programa	 para	 a	 seguinte	 especificação:	 “O	
//supermercado	 vende	 diferentes	 tipos	 de	 produtos.	 Cada	 produto	 tem	 um	 preço	 e	 uma	
//quantidade	em	estoque.	Um	pedido	de	um	cliente	é	composto	de	itens,	onde	cada	item	
//especifica	o	produto	que	o	cliente	deseja	e	a	respectiva	quantidade. Esse	pedido	pode	ser	
//pago	em	dinheiro,	cheque	ou	cartão.”


public class Produto {
	private String nomeProduto;
	private double precoProduto;
	private int quantidadeEstoque;
	
	public Produto(String nomeProduto, double precoProduto, int quantidadeEstoque) {
		
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
}
