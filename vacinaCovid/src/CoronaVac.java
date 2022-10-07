public class CoronaVac extends Vacina {
	
	private String nome = "CoronaVac";
	
	public String getNome() {
		return this.nome;
	}
	
	/*
	 * Regra: Numero de dias para vacinar deve ser maior que 122
	 *  e numero de vacinas deve ser menor que 4 
	 *  e seguir a regra de idade.
	
	 * *** Deve sobreescrever a regra de idade para maior que 3 anos 
	 *  e menor que 80 anos
	 */
	
	@Override
	public boolean regraIdade(Pessoa pessoa)
	{
		return pessoa.getIdade() > 3 && pessoa.getIdade() <= 80;
	}
	
	public boolean regraBoolean(CartaoDeVacinacao cartaoVacinacao) {
		
		return cartaoVacinacao.getDiasDaUltimaVacina() > 122 
				&& cartaoVacinacao.getQuantidadeVacina() < 4
				&& this.regraIdade(cartaoVacinacao.getPessoa());

	}

	@Override
	public void regraVoid(CartaoDeVacinacao cartaoVacinacao) {
		System.out.println("O(a) " + cartaoVacinacao.getPessoa().getNome() +
				" que optou pela vacina CoronaVac pode tomar vacina?");
		if (cartaoVacinacao.getDiasDaUltimaVacina() > 122 
				&& cartaoVacinacao.getQuantidadeVacina() < 4
				&& this.regraIdade(cartaoVacinacao.getPessoa())) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		
	}

	
}


