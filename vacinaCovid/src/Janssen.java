public class Janssen extends Vacina {

	private String nome = "Janssen";
	
	public String getNome() {
		return this.nome;
	}
	
	/*
	 * Regra: numero de vacinas deve ser igual a zero e seguir a regra de idade.
	 */
	public boolean regraBoolean(CartaoDeVacinacao cartaoVacinacao) {
		return  cartaoVacinacao.getQuantidadeVacina() == 0
				&& this.regraIdade(cartaoVacinacao.getPessoa());
	}

	@Override
	public void regraVoid(CartaoDeVacinacao cartaoVacinacao) {
		System.out.println("O(a) " + cartaoVacinacao.getPessoa().getNome() +
				" que optou pela vacina Janssen pode tomar vacina?");
		if (cartaoVacinacao.getQuantidadeVacina() == 0
				&& this.regraIdade(cartaoVacinacao.getPessoa())) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		
	}

}
