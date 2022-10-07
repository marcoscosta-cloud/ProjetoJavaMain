public class TesteFuncionario {
    public static void main(String[] args) {
        
        Funcionario marcos = new Funcionario();
        
        marcos.setNome("Marcos Costa");
        marcos.setCpf("333.333.333-33");
        marcos.setSalario(2600.00);
        
        System.out.println(marcos.getNome());
        System.out.println(marcos.getBonificacao());
        System.out.println(marcos.getSalario());
        
    }
}