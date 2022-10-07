import java.util.ArrayList;

public class Pedido {
	private Cliente cliente;
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	
	public double calculaTotal() {
		double total = 0;
		for(Produto produto: listaProdutos) {
			total = total + produto.getPrecoProduto();
		}
		return total;
	}
	
	public void pagamentoEmDinheiro() {
//		TODO implementar
	}
	public void pagamentoEmCartao() {
//		TODO implementar
	}
	public void pagamentoEmPix() {
//		TODO implementar
	}
}
