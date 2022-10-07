public class DezOuVintePorcento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {

			if (funcionario.getSalarioBase() > 3000.0) {
				return funcionario.getSalarioBase() * 1.1;
			}
			return funcionario.getSalarioBase() * 1.2;
		
	}

}

