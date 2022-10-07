public abstract class Vacina {
	
	/*
	 * Implementar regra geral de vacinaÃ§Ã£o que Ã©:
	 * idade acima de 05 anos atÃ© 80.
	 */
	public boolean regraIdade(Pessoa pessoa)
	{		
		return pessoa.getIdade() > 5 && pessoa.getIdade() <= 80;
	}
	
	abstract String getNome();
	
	abstract boolean regraBoolean(CartaoDeVacinacao cartaoVacinacao);
	
	abstract void regraVoid(CartaoDeVacinacao cartaoVacinacao);
	
	public void imprima(CartaoDeVacinacao cartaoVacinacao, TipoDeVacina tipoDeVacina) {
		cartaoVacinacao.setTipoDeVacina(tipoDeVacina);
		System.out.println("Estou apto para aplicar a vacina " + getNome() + "?");
		System.out.println(cartaoVacinacao
				.getTipoDeVacina()
				.regraBoolean(cartaoVacinacao)== true ? "Sim":"Não");
		cartaoVacinacao.getTipoDeVacina().regraVoid(cartaoVacinacao);
	}
}

