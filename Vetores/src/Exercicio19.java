//19.Ler as duas notas bimestrais para um conjunto de 10 alunos.
//Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
//tipo real. Escreva um programa que calcule a média aritmética simples das notas informadas armazenando o resultado em um vetor “Result” de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] resultado = new double[10];

		for (int i = 0; i < nota1.length; i++) {

			System.out.println("Informe a primeira nota:");
			nota1[i] = leia.nextDouble();
			System.out.println("Informe a segunda nota:");
			nota2[i] = leia.nextDouble();

			resultado[i] = (nota1[i] + nota2[i]) / 2;

			System.out.println("A média das duas notas informadas foi: " + resultado[i] + ".\n");

			if (resultado[i] >= 7) {
				System.out.println("Parabéns!!! Você foi aprovado(a)\n");
			} else {
				System.out.println("Infelizmente você foi reprovado(a). Estude mais no próximo ano.\n");
			}

		}

		leia.close();
	}
}
