public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		if (Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
			// chama o mÃ©todo direto
			return new DezOuVintePorcento().calcula(funcionario);
		}

		if (Cargo.DBA.equals(funcionario.getCargo()) 
			|| Cargo.TESTER.equals(funcionario.getCargo())) {
			
			// cria uma variÃ¡vel e chama o mÃ©todo
			RegraDeCalculo quinzeOuVinteCinco = new QuinzeOuVinteCincoPorcento();
			return quinzeOuVinteCinco.calcula(funcionario);
		}

		if (Cargo.ESTAGIARIO.equals(funcionario.getCargo())) {
			return new TrintaOuQuarentaPorcento().calcula(funcionario);
		}
		
// 		Outra forma de comparar
//		if (Cargo.ESTAGIARIO == funcionario.getCargo()) {
//			return new TrintaOuQuarentaPorcento().calcula(funcionario);
//		}

		throw new RuntimeException("funcionario inválido");
	}
}

