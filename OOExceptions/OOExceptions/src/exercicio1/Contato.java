//1. Escreva uma classe Contato que contenha nome, telefone e um identificador. Esse identificador deve ser gerado automaticamente pela classe através de um contador (cada vez que um Contato é criado o contador é incrementado e atribuído ao identificador). 

package exercicio1;

public class Contato {

	// Atributos

	private static int contador = 0;

	private int id;
	private String nome;
	private String telefone;
	private String email;

	// Construtor

	public Contato() {
		contador++;
		id = contador;
	}

	// Gettters e Setters

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	@Override
	public String toString() {
		String s = "";
		s += "\n";
		s += "\n identificador: " + id;
		s += "\n Nome: " + nome;
		s += "\n Telefone : " + telefone ;
		s += "\n Email: " + email;
		s += " ";
		return s;
	}

}
