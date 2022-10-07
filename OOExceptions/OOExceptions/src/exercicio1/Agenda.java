//Crie uma classe Agenda que irá funcionar para gerenciar os Contatos. Essa classe precisa de ter um método para adicionar um Contato e também para consultar.

package exercicio1;

public class Agenda {
	private Contato[] contatos;

	public Agenda() {
		contatos = new Contato[3];
	}

	public void adicionarContato(Contato c) throws AgendaCheiaException  {
		
		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		if(cheia) {
			throw new AgendaCheiaException();
		}
	}
	
	public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null) {
				if(contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			}
		}
		throw new ContatoNaoExisteException(nome);
	}

	@Override
	public String toString() {
		String s = "";
		for (Contato c : contatos) {
			if(c != null) {
				s += c.toString() + "\n";
			}
			
		}

		return s;
	}

}
