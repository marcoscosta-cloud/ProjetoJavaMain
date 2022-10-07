import java.io.IOException;
import java.util.Random;

import exception.ParametroDiasTrabalhadosInvalidoException;

public class TesteSalario {
	
	public static void main(String[] args) {
		FuncionarioEmpresa mayra = new FuncionarioEmpresa();
		mayra.setNomePessoa("Mayra Micheli");
		mayra.setValorSalario(15000);
		for (int mes = 1; mes<=24;mes++) {
				double valorDiaTrabalho = realizarCalculoDiasTrabalhadosFuncionario(mayra, mes);
				System.out.println("O valor do salario/dia de R$ " 
						+ mayra.getNomePessoa() 
						+ " no mês " + mes
						+ " é de: " 
						+ valorDiaTrabalho);
		}
	}

	private static double realizarCalculoDiasTrabalhadosFuncionario(FuncionarioEmpresa funcionario, int mes) {
		double valorSalarioDia = 0;
		try {
			valorSalarioDia = funcionario.calcularValorSalarioDia(buscarDadosDiasTrabalhados(funcionario));
		} catch (ParametroDiasTrabalhadosInvalidoException e) {
			enviarEmailDepartamentoFinanceiro(funcionario, mes);
		}
		return valorSalarioDia;
	}
	
	private static void enviarEmailDepartamentoFinanceiro(FuncionarioEmpresa funcionario, int mes) {
		System.out.println("Enviando e-mail para gerente de " + funcionario.getNomePessoa() + ". Mês com problema --> " + mes);		
	}

	/**
	 * Método representa a busca em um sistema externo
	 * @param mayra
	 * @return Retorna a quantdade de dias trabalhados (de 0 a 22 dias)
	 */
	private static int buscarDadosDiasTrabalhados(FuncionarioEmpresa funcionarioEmpresa) {
		Random random = new Random();
		return random.nextInt(0, 22);
	}

}
