import java.util.ArrayList;

public class Pedido {
	
	private String Cliente;
	private ArrayList<Item>itensConsumidos = new ArrayList<Item>(); 
	private boolean taxaDeServico;	
	public Pedido(String Cliente){
		Cliente = "Cliente";
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String Cliente) {
		this.Cliente = Cliente;
	}

	public ArrayList<Item> getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(ArrayList<Item> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}

	public boolean getTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(boolean taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}

	private double calcularTotal(Bebida, Lanche) {
		if (taxaDeServico) {
			return (bebida.getPreco() + lanche.getPreco()) * 1.15;
		}
		return bebida.getPreco() + lanche.getPreco();
	}
}
}

