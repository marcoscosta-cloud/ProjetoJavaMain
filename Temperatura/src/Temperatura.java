public class Temperatura {
	private double valor;
	private char tipo;
	
	public Temperatura(double valor, char tipo) {
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public char getTipo() {
		return this.tipo;
	}
	
	public void converter() {
		if (this.tipo == 'C') {
			double F;
			F = ( 9*this.getValor() + 160 ) / 5;
			this.setTipo('F');
			this.setValor(F);	
		} else {
			double C;
			C = (5.0/9.0) * (this.getValor()-32);
			this.setTipo('C');
			this.setValor(C);
		}

	}
	
	public void exibe() {
		System.out.println("Temperatura Ã©: " + this.valor + this.tipo);
	}
}
