
public class Contato extends Agenda {
	private String telefone;
	private String email;
	
	public Contato(String nome, String telefone, String email) {
		super(nome);
		this.telefone = telefone;
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}