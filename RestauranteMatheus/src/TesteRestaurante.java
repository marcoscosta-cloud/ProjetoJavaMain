public class TesteRestaurante {
	public static void main(String[] args) {
		Lanche lanche = new Lanche();
		lanche.setNome("Hamburger");
		lanche.setPreco(32.5);
		
		Bebida bebida = new Bebida();
		bebida.setNome("Coca Cola");
		bebida.setPreco(7.5);
		
		Pedido pedido = new Pedido();
		pedido.adicionarItem(lanche);
		pedido.adicionarItem(bebida);
		
		System.out.println("O preço total do pedido é R$" + pedido.calcularTotal());
	}
}

