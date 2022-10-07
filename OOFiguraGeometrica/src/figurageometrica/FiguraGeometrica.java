//1. Escreva uma classe FiguraGeometrica com atributos nome e cor. Escreva uma classe Figura2D e uma classe Figura3D. Ambas classes Figura2D e Figura3D são subclasses da classe FiguraGeometrica.

package figurageometrica;

public class FiguraGeometrica {

	private String nome;
	private String cor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
