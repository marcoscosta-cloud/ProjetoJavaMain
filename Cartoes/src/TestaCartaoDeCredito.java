import java.util.Scanner;

public class TestaCartaoDeCredito {

	public static void main(String[] args) {

		System.out.println("Informe a bandeira:");
		
		Scanner scanner = new Scanner(System.in);
		
		CartaoDeCredito regraCartao = new Visa();
		
		String bandeira = scanner.nextLine();
		
		if(bandeira.equals("VISA")) {
			
			regraCartao = new CartaoDeCreditoFactory()
				.retornaCartaoDeCredito(BandeiraCartao.VISA);
		}
		
		if(bandeira.equals("MASTER")) { 
			
			regraCartao = new CartaoDeCreditoFactory()
				.retornaCartaoDeCredito(BandeiraCartao.MASTER);
		}
		
		if(bandeira.equals("AMEX")) { 
			
			regraCartao = new CartaoDeCreditoFactory()
				.retornaCartaoDeCredito(BandeiraCartao.AMEX);
		}
		
		System.out.println("Informe o numero do cartao:");
		
		String numeroCartaoVisa = scanner.nextLine();
		
		scanner.close();
		
		Boolean valido = regraCartao.validaCartao(numeroCartaoVisa);
		
		System.out.println("Cartao "+ bandeira +" numero:"+ numeroCartaoVisa + " Ã© valido: "+ valido);
	}
}


/*
 Tutorial
 enum = Ele serve para e
*/
