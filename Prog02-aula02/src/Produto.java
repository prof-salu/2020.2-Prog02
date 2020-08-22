/**Classe utilizada para representar um produto
 * 
 * @author prof-salu
 * @version 1.0
 */
public class Produto{
	/**
	 * Propriedade que descreve um produto
	 */
	public String descricao;
	
	/**
	 * Propriedade que armazena o valor de um produto em Reais
	 */
	private double preco;
	private int quantidade;
	
	/**
	 * Construtor da classe Produto
	 * @param descricao descreve um produto
	 * @param preco valor do produto em reais
	 * @param quantidade quantidade do produto em estoque
	 */
	public Produto(String descricao, double preco, int quantidade) {
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	/**
	 * metodo utilizado para verificar o preco de um produto
	 * @return retorna o preco de um produto
	 */
	public double getPreco() {
		return preco;
	}
	
	/**
	 * metodo utilizado para alterar o preco de um produto
	 * @param preco novo preço do produto
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	/**
	 * metodo utilizado para verificar a quantidade de um produto
	 * @return retorna a quantidade de um produto em estoque
	 */
	public int getQuantidade() {
		return quantidade;
	}
	
	/**
	 * metodo utilizado para alterar a quantiade em estoque
	 * @param quantidade nova quantidade do produto
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	/**
	 * Metodo utilizado para exibir as informações de um produto
	 */
	@Override
	public String toString() {
		return "Produto { descricao= " + descricao + ", preco= " + 
					preco + ", quantidade= " + quantidade + "}";
	}
	
	/**
	 * Calcula o imposto de um produto. 
	 * Metodo descontinuado, utilize o metodo calculaImpostoComDesconto no seu lugar.
	 * @param taxa valor do imposto
	 * @return tarifa a ser paga
	 */
	
	@Deprecated
	public double calculaImposto(double taxa) {
		return preco * taxa;
	}
	
	/**
	 * Método utilizado para calcular o imposto de produtos a partir de 2012.
	 * @param taxa valor do imposto
	 * @return tarifa a ser paga
	 */
	
	public double calculaImpostoComDesconto(double taxa) {
		return (preco * taxa) / 2;
	}
	
}
