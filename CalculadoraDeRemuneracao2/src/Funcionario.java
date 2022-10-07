public class Funcionario {
	private Cargo cargo;
	private double salarioBase;
	private String nome;
	

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double reajustaSalario()
	{
		return this.getCargo().getRegra().calcula(this);
	} 
}



