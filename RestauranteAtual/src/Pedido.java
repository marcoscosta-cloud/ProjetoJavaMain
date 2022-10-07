import java.util.ArrayList;

public class Pedido {
	private String nomeCliente;
	private ArrayList<Item>itensConsumidos = new ArrayList<Item>();
	public boolean taxaDeServico;
	
	public Pedido(String nomeCliente) {
		super();
		this.nomeCliente = nomeCliente;
	}
	
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
	
	
	private double calcularTotal() {
    double conta = 0;
    for (int i=0;i<itensConsumidos.size();i++) {
    	Item item = itensConsumidos.get(i);
    	conta=conta+item.getPreco();
    }	
    double taxa=0;
    if(taxaDeServico) {
    	taxa=conta*1.03;
    	return taxa;
    	
    }else {
    	return conta;
    }
	}
    public void gerarFatura(){
    	System.out.println("Restaurante Compartilha Tela - Jaque e Helô !!!");
    	System.out.println("Obrigado pela sua preferência, volte Sempre!!! ");
    	System.out.println("Aqui está sua conta "+nomeCliente);
    
    	for (int i=0;i<itensConsumidos.size();i++) {
    		Item item= itensConsumidos.get(i);
        	System.out.println(item.getNomeItem()+" - "+item.getPreco());
        }	
   
    System.out.println(calcularTotal());
    }
	}
    

