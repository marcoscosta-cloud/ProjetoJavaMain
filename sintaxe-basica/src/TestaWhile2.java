
public class TestaWhile2 {
	 public static void main(String[] args) {
		    //Contagem de 0 a 10 de um em um
		    int contador = 0;
		    while(contador <= 10){
		      System.out.println(contador);
		      contador++;
		    }

		    //Contagem de 2 a 10 de um em um
		    contador = 2;
		    while(contador <= 10){
		      System.out.println(contador);
		      contador++;
		    }

		    //Contagem de 0 a 10 de dois em dois
		    contador = 0;
		    while(contador <= 10){
		      System.out.println(contador);
		      contador = contador + 2;
		    }

		    //Contagem de 0 a 10 de dois em dois usando o operador +=
		    contador = 0;
		    while(contador <= 10){
		      System.out.println(contador);
		      contador += 2;
		    }
		  }
		}