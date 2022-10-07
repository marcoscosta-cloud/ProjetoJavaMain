//23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//que:
//- Homens ganham 5% de desconto
//- Mulheres ganham 13% de desconto

import java.util.Scanner;
public class Desconto {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o seu nome:");
		String nome = leia.nextLine();
		
		System.out.println("Informe o seu sexo: 1 - Feminino , 2 - Masculino:");
		int sexo = leia.nextInt();
	
if((sexo!=1)&&(sexo!=2)) {
		System.out.println("Opção inváilida. Tente novamente");
		}
	else {
	
		System.out.println("Informe o valor de suas compras:");
		float valor = leia.nextFloat();
		
		float descontoF = (valor/100)*13;
		float descontoM = (valor/100)*5;
		float totalF = valor - descontoF;
		float totalM = valor - descontoM;
		
		if(sexo ==1) {
			System.out.println("Parabéns "+nome+" o valor de sua compra saírá "
					+String.format("%.2f", valor)+ " com desconto de 13% que será "
					+String.format("%.2f", totalF));
		}
		else{
			System.out.println("Parabéns "+nome+" o valor de sua compra é de R$ "
					+String.format("%.2f", valor)+ " com desconto de 5% será R$ "
					+String.format("%.2f", totalM));
			leia.close();
		}
	}
}
}
