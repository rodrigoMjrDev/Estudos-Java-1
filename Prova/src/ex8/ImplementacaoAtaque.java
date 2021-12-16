package ex8;

public class ImplementacaoAtaque implements Ataque {
	
	private String locomover;
	private String atacar;

	public ImplementacaoAtaque(String move, String atacar) {
		this.locomover = move;
		this.atacar = atacar;
		
	}
	
	@Override
	public void locomover() {
		
		System.out.println("locomover..");
		
	}

	@Override
	public void atacar() {
		locomover();
		System.out.println(atacar);
		
		
	}
	
	

}
