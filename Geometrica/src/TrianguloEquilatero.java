public class TrianguloEquilatero extends Triangulo implements FormaGeometrica {
	
	public TrianguloEquilatero(double lado) {
		super(lado, lado, lado);
	}
	
	public double area() {
		return (Math.sqrt(3)*this.lado1)/4;
	}
	
	public double perimetro() {
		return this.lado1 * 3;
	}
}
