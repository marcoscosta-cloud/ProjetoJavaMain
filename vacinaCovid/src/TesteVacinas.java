import java.util.Scanner;

public class TesteVacinas {

	public static void main(String[] args) {
		TipoDeVacina[] vacinas = TipoDeVacina.values();
		for (int index = 0; index < vacinas.length; index++) {
			System.out.println(vacinas[index]);
		}
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
		String nome = leia.nextLine();
		
		System.out.println("Informe a idade:");
		int idade = leia.nextInt();
		
		System.out.println("Informe a quantidade de vacinas aplicadas:");
		int vacinasAplicadas = leia.nextInt();
		
		System.out.println("Informe a quantidade de dias deste a ultima vacinas aplicada:");
		int quantidadeDiasVacina = leia.nextInt();
		
		leia.close();
		
		Pessoa pessoa = new Pessoa(nome,idade);
		
		CartaoDeVacinacao cartao = new CartaoDeVacinacao();
		cartao.setDiasDaUltimaVacina(quantidadeDiasVacina);
		cartao.setQuantidadeVacina(vacinasAplicadas);
		cartao.setPessoa(pessoa);
		
		/*
		 * Como melhorar esse programa?
		 * 1 - Criar um Enum de TipoDeVacina
		 * 1.1 - Colocar as opÃ§Ãµes de Enum sendo Coronavac, Astrazenica, Janssen, Pfizer
		 * 2. Criar atributo com get e set do TipoDeVacina na classe CartaoDeVacinacao
		 * 3. Alterar o enum TipoDeVacina incluindo a regra em cada uma das opÃ§Ãµes (Referencia: Projeto de Salario no Enum Cargo).
		 * 4. Alteracao a classe TesteVacinas realizando um for do TipoDeVacina.values() para demonstrar as opÃ§Ãµes de vacinas existentes.
		 * 5. Vamos alterar a class abstract Vacina  o metodo regra agora deve ser void, e em cada implementaÃ§Ã£o das classes filhas deve-se imprimir utilizando o sysout se a pessoa Ã© apta ou nÃ£o.
		 * 5.1 - O(a) {nome} que optou pela vacina {vacina} pode tomar vacina? .
		 * 5.2 - Sim ou NÃ£o.
		 * 6.0 - Alterar a chamada da regra para cartao.getTipoVacina().regra()(ReferÃªncia class TesteSalario)
		 */
		
		TipoDeVacina.CORONAVAC.imprima(cartao, TipoDeVacina.CORONAVAC);
		
		System.out.println("----");
		
		TipoDeVacina.ASTRAZENICA.imprima(cartao, TipoDeVacina.ASTRAZENICA);
		
		System.out.println("----");
		
		TipoDeVacina.PFIZER.imprima(cartao, TipoDeVacina.PFIZER);
		
		System.out.println("----");
		
		TipoDeVacina.JANSSEN.imprima(cartao, TipoDeVacina.JANSSEN);
		
	}

}


