import java.util.Scanner;

public class TestaLista {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome do novo contato");
        String nomeContato = scanner.nextLine();
        
        System.out.println("Informe o numero do novo contato");
        String numeroContato = scanner.nextLine();
        
        System.out.println("Informe o email do novo contato");
        String emailContato = scanner.nextLine();
        System.out.println("----------------------------");
        System.out.println("Nome: " + nomeContato);
        System.out.println("Número: " + numeroContato);
        System.out.println("Email: " + emailContato);
        System.out.println("----------------------------");
        
        Contato novoContato = new Contato(nomeContato,numeroContato,emailContato);
        System.out.println("Contato criado com sucesso!");
        
        
        scanner.close();
    }
}