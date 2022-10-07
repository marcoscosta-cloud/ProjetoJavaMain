public class TestaCondicional2 {
  public static void main(String[] args) {
    System.out.println("testando condicionais");
    int idade = 16;
    int quantidadePessoas = 50;
    int idadeAcompanhante = 20;
    boolean acompanhanteEhMaiorDeIdade = idadeAcompanhante >= 18;
    boolean acompanhado = quantidadePessoas >= 2 && acompanhanteEhMaiorDeIdade;
    boolean podeEntrar = idade >= 18 || acompanhado;

    if (podeEntrar) {
      System.out.println("seja bem vindo");
    } else {
      System.out.println("infelizmente você não pode entrar");
    }
  }
}