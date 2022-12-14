import java.util.Scanner;

public class AlunoDeHumanas extends Aluno implements AlunoEspecial {

    private AlunoEspecialHelper helper;

    public AlunoDeHumanas(String nome) {
        super(nome);
        helper = new AlunoEspecialHelper(this);
    }
    
    protected double nota3 = 0;
    protected double nota4 = 0;
    
    @Override
    public void perguntaNotas() {
        super.perguntaDuasNotas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Terceira Nota: ");
        this.nota3 = scanner.nextDouble();
        System.out.println("Quarta Nota: ");
        this.nota4 = scanner.nextDouble();
    }
    
    @Override
    public double calculaMedia() {
        super.media = (super.nota1 + super.nota2 + this.nota3 + this.nota4) / 4;
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
