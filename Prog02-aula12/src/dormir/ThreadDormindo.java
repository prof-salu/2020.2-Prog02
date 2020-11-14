package dormir;

public class ThreadDormindo implements Runnable {

	public static void main(String[] args) {
		ThreadDormindo dormindo = new ThreadDormindo();
		Thread t1 = new Thread(dormindo);

		t1.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		// O metodo sleep() trabalha com milisegundos (30 segundos = 30000)
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim do programa dormindo");
	}

}
