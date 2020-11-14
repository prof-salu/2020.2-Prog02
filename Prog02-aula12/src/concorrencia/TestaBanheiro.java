package concorrencia;

public class TestaBanheiro {
	public static void main(String[] args) {
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new FazNumero1(banheiro), "João");
		Thread convidado2 = new Thread(new FazNumero2(banheiro), "Ana");
		Thread convidado3 = new Thread(new FazNumero1(banheiro), "Bia");
		Thread convidado4 = new Thread(new FazNumero2(banheiro), "Pedro");
		Thread convidado5 = new Thread(new FazNumero2(banheiro), "Carlos");
		
		convidado1.start();
		convidado2.start();
		convidado3.start();
		convidado4.start();
		convidado5.start();
	}
}
