package exemplo02;

public class CopiadorDeArquivos implements Runnable {
	public void executa() {
		for (int i = 0; i < 100000000; i++) {
			System.out.println("Copiando arquivos: " + i);
		}
	}

	@Override
	public void run() {
		executa();
	}
}
