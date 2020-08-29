package modelo;

public class Produto<T, U> {
	private T codigo;
	private String descricao;
	private U preco;
	
	public Produto(T codigo, String descricao, U preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	
}
