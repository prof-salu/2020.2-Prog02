package Q1;

public class Moeda implements Comparable<Moeda> {
	private double valor;

	public Moeda(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "R$ " + valor;
	}

	@Override
	public int compareTo(Moeda outra) {
		if (this.valor > outra.valor) {
			return 1;
		}

		if (this.valor < outra.valor) {
			return -1;
		}

		return 0;
	}
}
