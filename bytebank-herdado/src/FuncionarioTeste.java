public class FuncionarioTeste {

        private String nome;
        private String cpf;
        private double salario;
        private int tipo = 0; // 0 = Funcionário comum; 1 = Gerente; 2 = Diretor
        private int senha;

        public double getBonificacao() {

            if(this.tipo == 0) { 
                return this.salario * 0.1;
            
            } else if(this.tipo == 1) { 
            return this.salario;
            
        } else {
            return this.salario + 1000.0;
        }

    }

        public void setTipo(int tipo) {
            this.tipo = tipo;
        }

        public int getTipo() {
            return tipo;
        }

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
}



