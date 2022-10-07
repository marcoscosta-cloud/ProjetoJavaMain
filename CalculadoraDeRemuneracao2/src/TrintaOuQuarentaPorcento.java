public class TrintaOuQuarentaPorcento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {
		
		if(funcionario.getSalarioBase() > 1000.0) 
	        return funcionario.getSalarioBase() *1.30;
	    
	    return funcionario.getSalarioBase() * 1.40; 
	}  
}


