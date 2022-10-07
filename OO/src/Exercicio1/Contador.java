package Exercicio1;
//1. Escreva uma classe chamada Contador, que tem um atributo estático que é incrementado sempre que a classe for instanciada. Crie métodos para zerar, incrementar e retornar o valor do contador. Desenvolva um
//programa para testar essa classe.

public class Contador {
	
//	Atributos.
	
	static int cont;
	
	public static int incrementar(){
		return cont++;
	}
	
//	Metódo zerar
	
	public static int zerar() {
		return cont = cont - cont;
	}

//	Metódo retornar
	
	public static int retornarValor() {
		return cont;
	}
	
	
}
