
public class Multiplicacao implements OperacaoMatematica {

//	Construtor

	public Multiplicacao() {

	}
	
	// Métodos

	@Override

	public int calcula(int a, int b) {
		System.out.printf("A multiplicação de %d e %d será %d.\n", a, b, (a * b));
		return (a * b);

	}

}
