import java.util.Scanner;

public class AlunoDeBiologicas extends Aluno {

    public AlunoDeBiologicas(String nome) {
        super(nome);
    }
    
    @Override
    public void perguntaNotas() {
        super.perguntaDuasNotas();
    }
}