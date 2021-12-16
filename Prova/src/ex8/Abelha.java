package ex8;

public class Abelha extends Inseto {

	private Ataque atacar;

	public Abelha(int tamanho, String cor, Ataque atacar) {
		super(tamanho, cor);
		this.atacar = atacar;
		
	}
	
	public void locomover() {
		atacar.locomover();
	}

	public void atacar() {
		atacar.atacar();
		
		
	}
}
