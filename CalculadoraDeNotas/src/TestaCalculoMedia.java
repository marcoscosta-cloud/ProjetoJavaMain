import java.util.Scanner;

public class TestaCalculoMedia {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de media de alunos!");
        System.out.println("Digite o Nome do Aluno: ");
        
        String nome = scanner.nextLine();
        
        System.out.println("Qual o tipo do aluno? (1 = Biologicas,"
                + " 2 = Exatas, 3 = Humanas)");
        int resposta = scanner.nextInt();
        if ( resposta > 0 && resposta < 4 ) {
            Aluno aluno = null;
            switch (resposta) {
            case 1:
                aluno = new AlunoDeBiologicas(nome);
                break;
            case 2:
                aluno = new AlunoDeExatas(nome);
                break;
            case 3:
                aluno = new AlunoDeHumanas(nome);
                break;
            }
            aluno.perguntaNotas();
            aluno.calculaMedia();
            
            System.out.println("A situacao do aluno " + aluno.getNome());
            System.out.println("É estar " + aluno.pegaSituacao());
        } else {
            System.out.println("Tipo do aluno invalido!");
        }
    }
}
