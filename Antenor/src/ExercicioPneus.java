import java.util.Scanner;

public class ExercicioPneus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Pressão do Pneu Dianteiro Direito");
        int pneuDianteiroDireito = sc.nextInt();
        System.out.println("Digite a Pressão do Pneu Dianteiro Esquerdo");
        int pneuDianteiroEsquerdo = sc.nextInt();
        System.out.println("Digite a Pressão do Pneu Traseiro Direito");
        int pneuTraseiroDireito = sc.nextInt();
        System.out.println("Digite a Pressão do Pneu Traseiro Esquerdo");
        int pneuTraseiroEsquerdo = sc.nextInt();

        
        //Pneu Dianteiro Direito
        
        if (pneuDianteiroDireito >= 30 && pneuDianteiroDireito <= 32) {

            System.out.println("A Pressão do Pneu Dianteiro Direito é: " + pneuDianteiroDireito + ". Pneu calibrado");

        } else {
            System.out
                    .println("A Pressão do Pneu Dianteiro Direito é: " + pneuDianteiroDireito + ". Pneu descalibrado");
        }

        //Pneu Dianteiro Esquerdo
        
        if (pneuDianteiroEsquerdo >= 30 && pneuDianteiroEsquerdo <= 32) {

            System.out.println("A Pressão do Pneu Dianteiro Esquerdo é: " + pneuDianteiroEsquerdo + ". Pneu calibrado");

        } else {
            System.out.println(
                    "A Pressão do Pneu Dianteiro Esquerdo é: " + pneuDianteiroEsquerdo + ". Pneu descalibrado");
        }

        //Pneu Traseiro Direito
    
        if (pneuTraseiroDireito >= 29 && pneuTraseiroDireito <= 31) {

            System.out.println("A Pressão do Pneu Traseiro Direito é: " + pneuTraseiroDireito + ". Pneu calibrado");

        } else {
            System.out.println("A Pressão do Pneu Traseiro Direito é: " + pneuTraseiroDireito + ". Pneu descalibrado");
        }
        
        //Pneu Traseiro Esquerdo
        
        if (pneuTraseiroEsquerdo >= 29 && pneuTraseiroEsquerdo <= 31) {

            System.out.println("A Pressão do Pneu Traseiro Esquerdo é: " + pneuTraseiroEsquerdo + ". Pneu calibrado");

        } else {
            System.out.println("A Pressão do Pneu Traseiro Esquerdo é: " + pneuTraseiroEsquerdo + ". Pneu descalibrado");
        }

        sc.close();
    }
}