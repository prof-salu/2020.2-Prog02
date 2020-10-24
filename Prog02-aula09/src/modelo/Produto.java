package modelo;

public class Produto {
	private int codigo;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Produto() {
		//Construtor Default (Vazio)
	}
	
	public Produto(int codigo, String descricao, int quantidade, double preco) {
		//Construtor com parâmetros (Cheio)
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	//Gets, Sets e toString
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco="
				+ preco + "]";
	}
}
