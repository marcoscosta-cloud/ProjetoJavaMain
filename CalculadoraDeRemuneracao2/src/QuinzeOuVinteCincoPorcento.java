public class QuinzeOuVinteCincoPorcento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 1.25;
		}
		
		return funcionario.getSalarioBase() * 1.15;
	}

}



