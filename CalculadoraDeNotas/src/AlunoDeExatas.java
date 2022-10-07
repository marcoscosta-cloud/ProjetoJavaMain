import java.util.Scanner;

public class AlunoDeExatas extends Aluno implements AlunoEspecial {
    
    protected double nota3 = 0;
    AlunoEspecialHelper helper;

    public AlunoDeExatas(String nome) {
        super(nome);
        helper = new AlunoEspecialHelper(this);
    }

    @Override
    public void perguntaNotas() {
        super.perguntaDuasNotas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Terceira Nota: ");
        this.nota3 = scanner.nextDouble();
    }
    
    @Override
    public double calculaMedia() {
        super.media = (super.nota1 + super.nota2 + this.nota3) / 3;
        return super.getMedia();
    }

    @Override
    public boolean emAnalisePeloCorpoDocente() {
        return helper.emAnalisePeloCorpoDocente();
    }

    @Override
    public String pegaSituacao() {
        return helper.pegaSituacao();
    }
}
