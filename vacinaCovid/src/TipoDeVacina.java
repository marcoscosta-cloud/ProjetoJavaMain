public enum TipoDeVacina {
	CORONAVAC(new CoronaVac()),
	ASTRAZENICA(new Astrazenica()),
	JANSSEN(new Janssen()),
	PFIZER(new Pfizer());
	
	private Vacina vacina;
	
	TipoDeVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public boolean regraBoolean(CartaoDeVacinacao cartao) {
		return this.vacina.regraBoolean(cartao);
	}
	
	public void regraVoid(CartaoDeVacinacao cartao) {
		this.vacina.regraVoid(cartao);
	}
	
	public void imprima(CartaoDeVacinacao cartaoVacinacao, TipoDeVacina tipoDeVacina) {
		this.vacina.imprima(cartaoVacinacao, tipoDeVacina);
	}
}
