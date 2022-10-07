//20. Faça um programa	de agenda	telefônica, com	as	classes	Agenda	e	Contato.

public abstract class Agenda {
	private String nome;

	public Agenda(String nome) {
		this.nome = nome;

	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}