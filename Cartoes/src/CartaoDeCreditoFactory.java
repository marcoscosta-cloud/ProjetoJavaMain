public class CartaoDeCreditoFactory {

	CartaoDeCredito retornaCartaoDeCredito(BandeiraCartao bandeira)
	{
		
		switch (bandeira) {
		
		case VISA: {
			
			return new Visa();
		}
		case MASTER: {
			
			return new Master();
		}
		case AMEX: {
			
			return new Amex();
		}
		default:
			throw new IllegalArgumentException("Valor nÃ£o informado corretamente: " + bandeira);
		}
	}
}
