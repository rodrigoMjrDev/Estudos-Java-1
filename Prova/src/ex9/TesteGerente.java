package ex9;

public class TesteGerente {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		Gerente gerente = new Gerente();
		gerente.setSalario(2000.0);
		System.out.println("funcionario: " + f1.getBonificacao());
		System.out.println("gerente: " + gerente.getBonificacao());
		
	}
	
}
