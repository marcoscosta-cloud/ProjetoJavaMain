//75) Crie um programa que preencha automaticamente (usando lógica, não apenas
//atribuindo diretamente) um vetor numérico com 15 posições com os primeiros
//elementos da sequência de Fibonacci:
	
public class Fibonacci {
    static long fibo(int n) {
        int F = 1;     // atual
        int ant = 1;   // anterior

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                F = 1;
                ant = 1;
            } else {
                F += ant;
                ant = F - ant;
            }

        }

        return F;
    }
    public static void main(String[] args) {
	
		for (int i = 0; i < 16; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
		}
		
		}
    }




