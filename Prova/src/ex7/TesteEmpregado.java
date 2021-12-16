package ex7;

public class TesteEmpregado {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Gerente", "Alan", 30);
		Empregado e1 = new Empregado(p1, 32);
		
		System.out.println("cargo: " + p1.cargo);
		System.out.println("salario: " + e1.salario);
		
	}

}
