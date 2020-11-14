package exemplo02;

public class BarraDeProgresso implements Runnable{
	public void executa() {
		for(int i = 0; i < 100000000; i++) {
			System.out.println("Carregando " + i);
		}
	}

	@Override
	public void run() {
		executa();		
	}
}
