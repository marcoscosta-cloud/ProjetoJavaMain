
public class Exercicio1 {
	public static void main(String[] args) {
		
	int[] vetorA = new int[5];
	int[] vetorB = new int[5];
	
	vetorA[0] = 10;
	vetorA[1] = 30;
	vetorA[2] = 50;
	vetorA[3] = 70;
	vetorA[4] = 90;
	
	for(int indice = 0; indice < vetorA.length; indice ++) {
		
		vetorB[indice] = vetorA[indice];
		
		System.out.println("Vetor A "+ (indice + 1)+ "º posição: " + vetorA[indice]);
		System.out.println("Vetor B "+ (indice + 1)+ "º posição: " + vetorB[indice]);

	}
}
}

