//33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
//de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
//em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
//ela não pode exceder 30% do salário ou então o empréstimo será negado.

import java.util.Scanner;
public class EmprestimoBancario {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorSalario;
        double valorMensal;
        double valorCalculo;

        do {
            System.out.println("Qual o valor do imovél?");
            double valorImovel = scanner.nextDouble();
            System.out.println("Em quantos anos você vai pagar o imóvel?");
            int anos = (scanner.nextInt() * 12);
            System.out.println("Qual o seu salário?");
            valorSalario = scanner.nextDouble();

            valorMensal = valorImovel / anos;
            valorCalculo = valorSalario * 0.3;

            if (valorMensal > valorCalculo) {
                System.out.println("Empréstimo negado, seu salário não é " +
            "compatível com as condições da compra!\n");
            } else {
                System.out.printf("O valor das prestações ficará em R$ %.2f ", valorMensal);
            }
        } while (valorMensal > valorCalculo);

        scanner.close();

    }
}



