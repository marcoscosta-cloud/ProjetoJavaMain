package bytebank;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = primeiraConta;
        Conta terceiraConta = new Conta();
        
        primeiraConta.saldo = 300;
        terceiraConta.saldo = 300;
        
        System.out.println("Saldo da conta " + primeiraConta + ": " + primeiraConta.saldo);
        System.out.println("Saldo da conta " + segundaConta + ": " + segundaConta.saldo);
        System.out.println("Saldo da conta " + terceiraConta + ": " + terceiraConta.saldo);
        
        if (primeiraConta == segundaConta) {
            System.out.println("Primeira e segunda conta são a mesma!");
        } else {
            System.out.println("Primeira e segunda conta não são a mesma!");
        }
        if (primeiraConta == terceiraConta) {
            System.out.println("Primeira e terceira conta são a mesma!");
        } else {
            System.out.println("Primeira e terceira conta não são a mesma!");
        }
        
    }
}