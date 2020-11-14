package concorrencia;

public class FazNumero2 implements Runnable{

	private Banheiro banheiro;
	
	public FazNumero2(Banheiro banheiro) {
		this.banheiro = banheiro;
	}
	
	@Override
	public void run() {
		banheiro.numero2();		
	}
}
