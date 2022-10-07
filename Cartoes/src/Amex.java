public class Amex implements CartaoDeCredito {


	public Boolean validaCartao(String numero) {
		if(numero.length() ==14 && numero.startsWith("9"))
			return true;
		
		return false;
	}

}
