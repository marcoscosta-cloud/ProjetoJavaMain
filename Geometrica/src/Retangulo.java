public class Retangulo implements FormaGeometrica {
	double altura, base;
	
	public Retangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}
	
	public double area() {
		return altura * base;
	}
	
	public double perimetro() {
		return 2 * (altura + base);
	}
}
