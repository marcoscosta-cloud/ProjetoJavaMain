import java.util.ArrayList;

public class Pedido {
	private String nomeCliente;
	private ArrayList<Item> itensConsumidos = new ArrayList<Item>();
	private boolean taxaDeServico = true;
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Item> getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(ArrayList<Item> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}

	public boolean isTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(boolean taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}

	public double calcularTotal() {
		double total = 0;
		
		for (Item itemConsumido : itensConsumidos) {
			total += itemConsumido.getPreco();
		}
		
		if (taxaDeServico) {
			return total * 1.15;
		}
		
		return total;
	}
		
	public void adicionarItem(Item item) {
		this.itensConsumidos.add(item);
	}
	
}

