package bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        // Deposita
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println("Saldo do paulo " + contaDoPaulo.saldo);
        // Sacar
        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println("Saldo 2 do paulo " +contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);
        
        //transfere
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        
        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
        
        if(sucessoTransferencia) {
            System.out.println("A transferencia ocorreu com sucesso");
        } else {
            System.out.println("A transferencia falhou");
        }        
        
        System.out.println("Saldo da Marcela " + contaDaMarcela.saldo);
        System.out.println("Saldo 3 do paulo " +contaDoPaulo.saldo);
    }
}