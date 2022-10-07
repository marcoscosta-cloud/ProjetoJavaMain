
//Calculadora com Enum

package enumerador;

//Escreva um Enum que represente as quatro operações matemáticas: somar,subtrair,multiplicar e dividir.O Enum deve ter um construtor que receba o símbolo da operação(+, - , *, /)

public enum OperacoesMatematicas {

	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {

			return x + y;
		}
	},
	SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
	
			return x - y;
		}
	}, 
	MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			
			return x * y;
		}
	}, 
	DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			
			return x / y;
		}
	};

	private String simbolo;

//	Construtores dentro de um Enum, já é subentendido que ele será automaticamente privado.

	OperacoesMatematicas(String simbolo) {
		this.simbolo = simbolo;
	}

//	Sobrescreva o método toString que retorne somente o símbolo da operação. 

	@Override
	public String toString() {

		return this.simbolo;
	}

//Implemente um método abastrato com a seguinte assinatura double executarOperacao(double x, double y). Cada opção do Enum deve implementar esse método realizando a operação de acordo com sua descrição.

	public abstract double executarOperacao(double x, double y);
}
