//29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
//- Até 3 anos de empresa: aumento de 3%
//- entre 3 e 10 anos: aumento de 12.5%
//- 10 anos ou mais: aumento de 20%

import java.util.Scanner;
public class SalarioReajustado {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Informe o seu nome:");
	String nome = scanner.nextLine();
	
	System.out.println("Informe o seu salário:");
	double salario = scanner.nextDouble();
	if (salario <= 0) {
		System.out.println("Informação de salário está inválido");
	}else {
	
	System.out.println("Informe há quantos anos "
			+ " você trabalha na empresa");
	int anos = scanner.nextInt(); 
	if (anos <= 0) {
		System.out.println("Informação de tempo está inválido");
	}else {
	
	double reajuste1 = salario * 1.03;	
//	double reajuste2 = salario+((salario/100)*3));
	double reajuste2 = salario * 1.125;
	double reajuste3 = salario * 1.20;
	
	if(anos <=3) {
		System.out.println("Olá "+nome+" o seu salário é R$ "
	+String.format("%.2f",salario)+
" com reajuste de 3% será de R$ "+String.format("%.2f",reajuste1));
		
	}else if((anos >3)&&(anos<10)){
		System.out.println("Olá "+nome+" o seu salário é R$ "
	+String.format("%.2f",salario)+
" com reajuste de 12,5% será de R$ "+String.format("%.2f",reajuste2));
	
	}else {
		System.out.println("Olá "+nome+" o seu salário é R$ "
	+String.format("%.2f",salario)+
" com reajuste de 20% será de R$ "+String.format("%.2f",reajuste3));
	}
	scanner.close();
	}	
}
}
}
