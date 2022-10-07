package Exercicio6;
//6. Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos

//para conversão aproximada das unidades de velocidade segundo a lista
//abaixo.
//• 1 minuto = 60 segundos
//• 1 hora = 60 minutos
//• 1 dia = 24 horas
//• 1 semana = 7 dias
//• 1 mês = 30 dias
//• 1 ano = 365.25 dias

public class ConversaoDeUnidadesDeTempo {

//	Método conversão de minutos para segundos.

	public static double converteMinuto(double numero) {
		return numero * 60;
	}

//	Método conversão de horas para minutos.

	public static double converteHora(double numero) {
		return numero * 60;
	}

//	Método conversão de dias para horas.

	public static double converteDia(double numero) {
		return numero * 24;
	}

//	Método conversão de semana para dias.

	public static double converteSemana(double numero) {
		return numero * 7;
	}

//	Método conversão de meses para dias.

	public static double converteMes(double numero) {
		return numero * 30;
	}

//	Método conversão de anos para dias.

	public static double converteAno(double numero) {
		return numero * 365;
	}
}
