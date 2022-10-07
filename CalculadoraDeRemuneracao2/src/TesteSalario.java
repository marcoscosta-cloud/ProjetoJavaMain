import java.util.Scanner;

public class TesteSalario {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Informe seu nome: ");
        String nome = leia.nextLine();
        funcionario.setNome(nome);
        
        System.out.println("Informe seu cargo, conforme as opÃ§Ãµes abaixo: ");
        
        //var listaDeCargo = Cargo.values();
        Cargo[] listaDeCargo = Cargo.values();
        
        /*
          0 = Cargo.DBA
          1 = Cargo.DESENVOLVEDOR
          2 = Cargo.TESTER
          3 = Cargo.ESTAGIARIO
          4 = Cargo.DIRETOR
          5 = Cargo.GERENTE
         */
        
         for(int index = 0; index < listaDeCargo.length; index++)
         {
        	 System.out.println(listaDeCargo[index]);
         }
         
        /*
         * For acima Ã© igual ao for abaixo, sÃ³ que Ã© executado via index
       
         * for(Cargo cargo : listaDeCargo) {
        	System.out.println(cargo);
		}*/
       
        String cargo = leia.nextLine();
        
        // Outra forma de recuperar o enum baseado em uma String Exemplo: DBA = Cargo.DBA
        try {
        	funcionario.setCargo(Cargo.valueOf(cargo));
        }catch (Exception e) {
        	 leia.close();
			 throw new IllegalArgumentException("O cargo informado nÃ£o Ã© valido.");
		}

        System.out.println("Informe seu salÃ¡rio: ");
        double salario = leia.nextDouble();
        funcionario.setSalarioBase(salario);
        
        leia.close();

      
        double salarioReajustado = funcionario.reajustaSalario();
        System.out.println(nome + ". Seu novo salÃ¡rio Ã©: R$ " + salarioReajustado);
    }
}
