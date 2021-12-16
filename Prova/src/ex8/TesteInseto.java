package ex8;

public class TesteInseto {

	public static void main(String[] args) {
		
		Abelha a = new Abelha(10, "Amarela e preta", new ImplementacaoAtaque("voando", "locomovendo"));
		Abelha b = new Abelha(20, "Preta", new ImplementacaoAtaque("voando", "picando"));
		
		b.atacar();
		b.locomover();

	}

}
