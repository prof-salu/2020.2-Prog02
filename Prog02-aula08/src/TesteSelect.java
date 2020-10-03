import java.util.ArrayList;
import java.util.List;

public class TesteSelect {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> lista = new ArrayList<>();
		lista = dao.getProdutos();
		
		for (Produto produto : lista) {
			System.out.println(produto);
		}
	}

}
