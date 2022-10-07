public class CinquentaOuSetentaPorcento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {
		
		if(funcionario.getSalarioBase() > 30000)
		{
			return funcionario.getSalarioBase() * 1.50;
		}
		
		return funcionario.getSalarioBase() * 1.70;
	}

}

