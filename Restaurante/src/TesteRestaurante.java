
import java.util.Scanner;

public class TesteRestaurante {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		Cliente cliente = new Cliente();
		Pedido pedido = new Pedido();
		Lanche lanche = new Lanche();
		Bebida bebida = new Bebida();
		
		System.out.println("Insira o seu nome: ");
		cliente.setCliente(scanner.nextDouble());
		
		System.out.println("Insira o nome do lanche: ");
		lanche.setNomeLanche(scanner.nextLine());
		pedido.itensConsumidos.add(lanche.getNomeLanche());
		
		System.out.println("Insira o preço do lanche: ");
		lanche.setPreco(scanner.nextDouble());
		
		System.out.println("Insira o nome da bebida: ");
		bebida.setNomeBebida(scanner.next());			
		pedido.itensConsumidos.add(bebida.getNomeBebida());
		
		System.out.println("Insira o preço da bebida: ");
		bebida.setPreco(scanner.nextDouble());
		
		
		System.out.println("Tem taxa de serviço? 1 - SIM / 2 - NÃO ");
		int taxa = scanner.nextInt();
		
		switch (taxa) {
		case 1: {			
			pedido.taxaDeServico = true;
			break;
		}
		case 2: {
			pedido.taxaDeServico = false;
			break;
		}
		default:
			pedido.taxaDeServico = true;
		}
		
		System.out.println("");
		System.out.print("Itens do pedido: ");
		System.out.println(pedido.itensConsumidos);
		System.out.println("Valor total: R$ " + pedido.calcularTotal(bebida, lanche));
			
		scanner.close();
	}
}
