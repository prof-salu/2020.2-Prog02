package concorrencia;

public class Banheiro {
	public void numero1() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " fazendo uma coisa rapida");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando as mãos");
			System.out.println(nome + " saindo do banheiro");
		}
	}

	public void numero2() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " batendo na porta");

		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " fazendo uma coisa demorada");

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando as mãos");
			System.out.println(nome + " saindo do banheiro");
		}
	}
}
