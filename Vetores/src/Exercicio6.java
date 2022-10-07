
public class Exercicio6 {
	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		vetorA[0] = 10;
		vetorA[1] = 20;
		vetorA[2] = 30;
		vetorA[3] = 40;
		vetorA[4] = 50;
		vetorA[5] = 60;
		vetorA[6] = 70;
		vetorA[7] = 80;
		vetorA[8] = 90;
		vetorA[9] = 100;

		vetorB[0] = 10;
		vetorB[1] = 20;
		vetorB[2] = 30;
		vetorB[3] = 40;
		vetorB[4] = 50;
		vetorB[5] = 60;
		vetorB[6] = 70;
		vetorB[7] = 80;
		vetorB[8] = 90;
		vetorB[9] = 100;

		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A posição do " + (i + 1) + "º" + " elemento do Vetor A é " + vetorA[i]);
		}

		System.out.println();

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("A posição do " + (i + 1) + "º" + " elemento do Vetor B é " + vetorB[i]);
		}

		System.out.println();

		for (int i = 0; i < vetorC.length; i++) {
			System.out.println("A posição do " + (i + 1) + "º" + " elemento do Vetor C é " + vetorC[i]);
		}
	}

}
