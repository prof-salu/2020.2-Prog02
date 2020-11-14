package corrida;

public class Piloto implements Runnable {

	private String nome;
	private double velocidade;
	private double distanciaCircuito;
	private double distanciaPercorrida;

	public Piloto(String nome, double velocidade, double distanciaCircuito) {
		this.nome = nome;
		this.velocidade = velocidade;
		this.distanciaCircuito = distanciaCircuito;
	}

	@Override
	public void run() {
		acelera();
	}

	public void acelera() {
		while (distanciaPercorrida <= distanciaCircuito) {
			distanciaPercorrida += velocidade;
			System.out.printf(nome + " esta no km %.2f\n", distanciaPercorrida);
		}

		System.out.println(this.nome + "******* Terminou **********");
	}
}
