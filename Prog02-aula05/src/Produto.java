
//CTRL + 1
public class Produto implements Comparable<Produto> {

	private int codigo;
	private String descricao;
	private int quantidade;
	private double valor;

	// CTRL + 3
	public Produto(int codigo, String descricao, int quantidade, double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", quantidade=" + quantidade + ", valor="
				+ valor + "]";
	}

	@Override
	public int compareTo(Produto outro) {
		return this.descricao.compareTo(outro.descricao);
		//Decrescente
		//return (this.descricao.compareTo(outro.descricao) * -1);
		
		//return Double.compare(this.valor, outro.valor);
		
	}
}
