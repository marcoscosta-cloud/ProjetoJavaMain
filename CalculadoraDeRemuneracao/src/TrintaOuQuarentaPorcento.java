public class TrintaOuQuarentaPorcento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {

			if (funcionario.getSalarioBase() > 1000.0) {
				return funcionario.getSalarioBase() * 1.3;
			}
			return funcionario.getSalarioBase() * 1.4;

	}
}
