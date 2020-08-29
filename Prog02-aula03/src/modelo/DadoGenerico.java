package modelo;

public class DadoGenerico<T> {
	private T dado;
	
	public DadoGenerico(T dado) {
		this.dado = dado;
	}
	
	public T getDado() {
		return dado;
	}
}
