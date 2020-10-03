import java.util.List;

public class TesteSelectComParametro {

	public static void main(String[] args) {
		List<Produto> produtos;
		ProdutoDAO dao = new ProdutoDAO();
		
		produtos = dao.getProdutos("CaNEca");
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
