
public class Master implements CartaoDeCredito {

	public Boolean validaCartao(String numero) {
		if(numero.length() ==15 && numero.startsWith("5"))
			return true;
		
		return false;
	}

}

