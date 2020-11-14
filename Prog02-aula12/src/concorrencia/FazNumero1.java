package concorrencia;

public class FazNumero1 implements Runnable{

	private Banheiro banheiro;
	
	public FazNumero1(Banheiro banheiro) {
		this.banheiro = banheiro;
	}
	
	@Override
	public void run() {
		banheiro.numero1();		
	}
}
