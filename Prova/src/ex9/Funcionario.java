package ex9;

public class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario = 1000.00;
	
	public double getBonificacao() {
		return this.salario * 0.10;
		
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
