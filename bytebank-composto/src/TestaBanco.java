
public class TestaBanco {
	public static void main(String[] args) {
		Cliente primeiroCliente = new Cliente();
		primeiroCliente.setNome("Marcos");
		primeiroCliente.setCpf("222.222.222-22");
		primeiroCliente.setProfissao("Desenvolvedor");
		
		Conta contaMarcos = new Conta();
		contaMarcos.setTitular(primeiroCliente);
		contaMarcos.setSaldo(100);
		System.out.println("Olá " + contaMarcos.getTitular().getNome());
		System.out.println("Seu cpf é " + contaMarcos.getTitular().getCpf());
		System.out.println("Sua profissão é " + contaMarcos.getTitular().getProfissao());
		System.out.println("Seu saldo é " + contaMarcos.getSaldo());
		
		Conta contaRafael = new Conta();
		contaRafael.deposita(1000);
		System.out.println(contaRafael.getTitular());
		if(contaRafael.getTitular() == null) {
			System.out.println("Esta conta ainda não possui cliente!");
		} else {
		System.out.println("Olá " + contaRafael.getTitular().getNome());
		System.out.println("Seu saldo é " + contaRafael.getSaldo());
		
	}

	}
}
