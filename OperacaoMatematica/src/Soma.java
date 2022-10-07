
public class Soma implements OperacaoMatematica {

//	Construtor

	public Soma() {

	}

//	Métodos

	@Override

	public int calcula(int a, int b) {
		System.out.printf("A soma de %d e %d será %d.\n", a, b, (a + b));
		return (a + b);

	}

}
