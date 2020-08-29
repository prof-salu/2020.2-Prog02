package modelo;

public class Par<T, U> {
	private T valor1;
	private U valor2;
	
	public Par(T valor1, U valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	@Override
	public String toString() {
		return "Par [valor1=" + valor1 + ", valor2=" + valor2 + "]";
	}
}
