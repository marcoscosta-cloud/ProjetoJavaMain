public class TesteFormas {
	public static void main(String[] args) {
		
		FormaGeometrica forma;
		
		forma = new Quadrado(5.0);
		
		System.out.println(forma.area());
		System.out.println(forma.perimetro());
		
	}
}
