import java.security.InvalidParameterException;

import exception.ParametroDiasTrabalhadosInvalidoException;

public class FuncionarioEmpresa {
	
	private String nomePessoa;
	private double valorSalario;

	
	
	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}
	
	public double calcularValorSalarioDia(int quantDias) throws ParametroDiasTrabalhadosInvalidoException {
		System.out.println("Calculando valor do Salário para " 
					+ nomePessoa 
					+ ". Valor Salário R$ " 
					+ valorSalario + " e " 
					+ quantDias + " trabalhados.");
		if (quantDias <=0) {
			throw new ParametroDiasTrabalhadosInvalidoException("Quantidade de dias trabalhados inválido");
		}
		
		return valorSalario/quantDias;
	}

}
