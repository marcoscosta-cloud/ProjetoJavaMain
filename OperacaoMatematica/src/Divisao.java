
public class Divisao implements OperacaoMatematica {
	
//	Construtor

	public Divisao() {

	}
	
	// Métodos

	@Override

	public int calcula(int a, int b) {
		System.out.printf("A divisão de %d e %d será %d.\n", a, b, (a / b));
		return (a / b);

	}

}
