public class Astrazenica extends Vacina {

	private String nome = "Astrazenica";
	
	public String getNome() {
		return this.nome;
	}
	
	/*
	 * Regra: Numero de dias para vacinar deve ser maior que 122 dias
	 *  e numero de vacinas deve ser menor que 4
	 *  e deve seguir a regra de idade.
	 */
	public boolean regraBoolean(CartaoDeVacinacao cartaoVacinacao) {
		
		return cartaoVacinacao.getDiasDaUltimaVacina() > 122 
				&& cartaoVacinacao.getQuantidadeVacina() < 4
				&& this.regraIdade(cartaoVacinacao.getPessoa());
	}

	@Override
	public void regraVoid(CartaoDeVacinacao cartaoVacinacao) {
		System.out.println("O(a) " + cartaoVacinacao.getPessoa().getNome() +
				" que optou pela vacina Astrazenica pode tomar vacina?");
		if (cartaoVacinacao.getDiasDaUltimaVacina() > 122 
				&& cartaoVacinacao.getQuantidadeVacina() < 4
				&& this.regraIdade(cartaoVacinacao.getPessoa())) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		
	}

}
